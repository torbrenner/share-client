#!/usr/bin/env bash

set -e

if [ -n "$DEPLOYMENT_CONTEXT" ]; then
  echo "INFO: preparing deployment in context ${DEPLOYMENT_CONTEXT}"
  mv "${CATALINA_HOME}"/webapps/ROOT.war "${CATALINA_HOME}"/webapps/"${DEPLOYMENT_CONTEXT}".war
  mv "${CATALINA_HOME}"/conf/Catalina/localhost/ROOT.xml "${CATALINA_HOME}"/conf/Catalina/localhost/"${DEPLOYMENT_CONTEXT}".xml
fi

file="${CATALINA_HOME}"/conf/Catalina/localhost/"${DEPLOYMENT_CONTEXT:-ROOT}".xml
sed -i "s/{postgres-host}/${POSTGRES_HOST}/"              "$file"
sed -i "s/{postgres-port}/${POSTGRES_PORT:-5432}/"        "$file"
sed -i "s/{postgres-db}/${POSTGRES_DB}/"                  "$file"
sed -i "s/{postgres-user}/${POSTGRES_USER}/"              "$file"
sed -i "s/{postgres-pass}/${POSTGRES_PASS}/"              "$file"

file=${CATALINA_HOME}/conf/${PROJECT}_common_config.xml
sed -i "s~{proxy-url}~${HTTP_PROXY}~"                     "$file"
sed -i "s/{proxy-user}/${PROXY_USER}/"                    "$file"
sed -i "s/{proxy-pass}/${PROXY_PASS}/"                    "$file"

file=${CATALINA_HOME}/conf/${PROJECT}_common_urls.xml
sed -i "s#{store-url}#${STORE_URL}#"                      "$file"
sed -i "s#{id-manager-url}#${ID_MANAGER_URL}#"            "$file"
sed -i "s#{mdr-url}#${MDR_URL}#"                          "$file"
sed -i "s#{directory-url}#${DIRECTORY_URL}#"              "$file"
sed -i "s#{share-url}#${SHARE_URL}#"                      "$file"
sed -i "s#{patientlist-url}#${PATIENTLIST_URL}#"          "$file"
sed -i "s#{projectpseudonymisation-url}#${PROJECTPSEUDONYMISATION_URL}#"                      "$file"

file=${CATALINA_HOME}/conf/${PROJECT}_common_operator.xml
sed -i "s/{operator-first-name}/${OPERATOR_FIRST_NAME}/"  "$file"
sed -i "s/{operator-last-name}/${OPERATOR_LAST_NAME}/"    "$file"
sed -i "s/{operator-email}/${OPERATOR_EMAIL}/"            "$file"
sed -i "s#{operator-phone}#${OPERATOR_PHONE}#"            "$file"

file=${CATALINA_HOME}/conf/mailSending.xml
sed -i "s%{mail-host}%${MAIL_HOST}%"                      "$file"
sed -i "s%{mail-port}%${MAIL_PORT:-25}%"                  "$file"
sed -i "s%{mail-protocol}%${MAIL_PROTOCOL:-smtp}%"        "$file"
sed -i "s%{mail-from-address}%${MAIL_FROM_ADDRESS}%"      "$file"
sed -i "s%{mail-from-name}%${MAIL_FROM_NAME}%"            "$file"

file=${CATALINA_HOME}/conf/${PROJECT}_bridgehead_info.xml
sed -i "s#{site}#${SITE}#"                                "$file"
sed -i "s#{siteid}#${SITEID}#"                            "$file"
sed -i "s#{query-language}#${QUERY_LANGUAGE:-QUERY}#"     "$file"
sed -i "s#{central-search}#${CENTRAL_SEARCH}#"            "$file"
sed -i "s#{decentral-search}#${DECENTRAL_SEARCH}#"        "$file"
sed -i "s#{query-language}#${QUERY_LANGUAGE:-QUERY}#"     "$file"
sed -i "s#{monitor-interval}#${MONITOR_INTERVAL}#"        "$file"
sed -i "s#{monitor-url}#${MONITOR_URL}#"                  "$file"
sed -i "s#{update-server}#${UPDATE_SERVER}#"              "$file"

file=${CATALINA_HOME}/conf/log4j2.xml
sed -i "s/{level}/${LOG_LEVEL:-info}/"                    "$file"

file=${CATALINA_HOME}/conf/features.properties
sed -i "s/{feature_BBMRI_DIRECTORY_SYNC}/${feature_BBMRI_DIRECTORY_SYNC:-false}/" "$file"
sed -i "s/{feature_DKTK_CENTRAL_SEARCH}/${feature_DKTK_CENTRAL_SEARCH:-false}/"   "$file"
sed -i "s/{feature_NNGM_CTS}/${feature_NNGM_CTS:-false}/"                         "$file"
sed -i "s|{feature_NNGM_ENCRYPT_ID}|${feature_NNGM_ENCRYPT_ID:-false}|"           "$file"

file=${CATALINA_HOME}/conf/${PROJECT}_cts_info.xml
sed -i "s|{nngm-magicpl-apikey}|${NNGM_MAGICPL_APIKEY}|"                    "$file"
sed -i "s|{nngm-magicpl-url}|${NNGM_MAGICPL_URL}|"                          "$file"
sed -i "s|{nngm-profile}|${NNGM_PROFILE}|"                                  "$file"
sed -i "s|{nngm-cts-url}|${NNGM_CTS_URL}|"                                  "$file"
sed -i "s|{nngm-cts-user}|${NNGM_CTS_USER}|"                                "$file"
sed -i "s|{nngm-cts-password}|${NNGM_CTS_PASSWORD}|"                        "$file"
sed -i "s|{nngm-site-idtype}|${NNGM_SITE_IDTYPE}|"                          "$file"
sed -i "s|{nngm-mainzelliste-apikey}|${NNGM_MAINZELLISTE_APIKEY}|"          "$file"
sed -i "s|{nngm-mainzelliste-url}|${NNGM_MAINZELLISTE_URL}|"                "$file"

if [ -n "$TOMCAT_REVERSEPROXY_FQDN" ]; then
  echo "Info: Configuring reverse proxy for URL ${TOMCAT_REVERSEPROXY_FQDN}";
  mv "${CATALINA_HOME}/conf/server.xml" "${CATALINA_HOME}/conf/server.xml.ori";
  ## Apply add reverse proxy configuration to
  echo "Info: applying ${CATALINA_HOME}/conf/server.reverseproxy.patch on ${CATALINA_HOME}/conf/server.xml"
  patch -i "${CATALINA_HOME}/conf/server.reverseproxy.patch" -o "${CATALINA_HOME}/conf/server.xml" "${CATALINA_HOME}/conf/server.xml.ori"
  if [ -z "$TOMCAT_REVERSEPROXY_PORT" ]; then
	  case "$TOMCAT_REVERSEPROXY_SSL" in
	  	true)
	  		TOMCAT_REVERSEPROXY_PORT=443
	  		TOMCAT_REVERSEPROXY_SCHEME=https
	  		;;
	  	false)
	  		TOMCAT_REVERSEPROXY_PORT=80
	  		TOMCAT_REVERSEPROXY_SCHEME=http
	  		;;
	  	*)
	  		echo "Error: Please set TOMCAT_REVERSEPROXY_SSL to either true or false."
	  		exit 1
	  esac
  fi
  echo "Info: Applying configuration for ReverseProxy with settings: TOMCAT_REVERSEPROXY_FQDN=$TOMCAT_REVERSEPROXY_FQDN TOMCAT_REVERSEPROXY_PORT=${TOMCAT_REVERSEPROXY_PORT} TOMCAT_REVERSEPROXY_SSL=${TOMCAT_REVERSEPROXY_SSL}"
  sed -i -e "s|{tomcat_reverseproxy_fqdn}|${TOMCAT_REVERSEPROXY_FQDN}|g ; \
  	s|{tomcat_reverseproxy_scheme}|${TOMCAT_REVERSEPROXY_SCHEME}|g ; \
  	s|{tomcat_reverseproxy_port}|${TOMCAT_REVERSEPROXY_PORT}|g ; \
  	s|{tomcat_reverseproxy_ssl}|${TOMCAT_REVERSEPROXY_SSL}|g" \
  	"${CATALINA_HOME}"/conf/server.xml;
  echo "Info: ReverseProxy configuration is finished"
fi

export CATALINA_OPTS="${CATALINA_OPTS} -javaagent:/docker/jmx_prometheus_javaagent-0.3.1.jar=9100:/docker/jmx-exporter.yml"

# Replace start.sh with catalina.sh
exec /usr/local/tomcat/bin/catalina.sh run
