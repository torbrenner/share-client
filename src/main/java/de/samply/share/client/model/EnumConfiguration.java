package de.samply.share.client.model;

/**
 * All available configuration items that are not timing-related
 */
public enum EnumConfiguration {
    CENTRAL_MDS_DATABASE_BASE_URL,
    CENTRAL_MDS_DATABASE_PATH,
    CENTRAL_MDS_DATABASE_UPLOAD_PATIENTS_WITH_LOCAL_CONSENT,
    CENTRAL_MDS_DATABASE_UPLOAD_RANDOMIZE_EXPORT_IDS,
    CENTRAL_MDS_DATABASE_DELETE_BEFORE_UPLOAD,
    CENTRAL_MDS_DATABASE_NEXT_UPLOAD_FULL,
    CENTRAL_MDS_DATABASE_SHOW_UPLOAD_PATIENTS_WITH_LOCAL_CONSENT,
    CENTRAL_MDS_DATABASE_ANONYMIZED_PATIENTS_PREFIX,
    DECENTRAL_SEARCH_MAIL_RECEIVER_ADDRESS,
    DECENTRAL_SEARCH_MAIL_SHARE_URL,
    DECENTRAL_SEARCH_MAIL_INCLUDE_EMPTY_RESULTS,
    MDR_URL,
    LDM_URL,
    SHARE_URL,
    DIRECTORY_URL,
    ID_MANAGER_URL,
    ID_MANAGER_INSTANCE_ID,
    ID_MANAGER_NETWORK_ID,
    HTTP_PROXY,
    HTTPS_PROXY,
    ROR_AUTOMATIC_UPLOAD,
    ROR_AUTOMATIC_UPLOAD_AT,
    MDR_GRP_MDSK,
    MDR_GRP_MDSB,
    MDR_GRP_ADT,
    MDR_SOURCE_GROUPS,
    MDR_KEY_UPLOAD_FROM,
    MDR_KEY_UPLOAD_TO,
    MDR_KEY_CONSENT_DKTK,
    MDR_KEY_DKTK_GLOBAL_ID,
    MDR_KEY_GENDER,
    MDR_KEY_CASE_DATE,
    MDR_KEY_CENTRAXX_MAPPING_VERSION,
    MDR_KEY_CENTRAXX_MAPPING_DATE,
    MDR_KEY_AGE_AT_DIAGNOSIS,
    INQUIRY_HIDE_RESULTS,
    INQUIRY_ADDITIONAL_MDRKEYS,
    QUALITY_REPORT_MDR_GROUPS,
    QUALITY_REPORT_ADDITIONAL_MDR_DATA_ELEMENTS,
    QUALITY_REPORT_MDR_NAMESPACE,
    QUALITY_REPORT_MDR_AUTH_USER_ID,
    QUALITY_REPORT_MDR_AUTH_KEY_ID,
    QUALITY_REPORT_MDR_AUTH_URL,
    QUALITY_REPORT_MDR_AUTH_PRIVATE_KEY_BASE_64,
    QUALITY_REPORT_MAX_ATTEMPTS,
    QUALITY_REPORT_MAX_TIME_TO_WAIT_IN_MILLIS,
    QUALITY_REPORT_ONLY_STATISTICS_AVAILABLE,
    QUALITY_REPORT_MDR_LINK_PREFIX,
    QUALITY_REPORT_MAX_NUMBER_OF_PATIENT_IDS_TO_BE_SHOWN,
    QUALITY_REPORT_CENTRAXX_DATAELEMENTS_FILE,
    QUALITY_REPORT_CENTRAXX_VALUES_FILE,
    QUALITY_REPORT_IGNORED_DATAELEMENTS,
    QUALITY_REPORT_DIRECTORY,
    QUALITY_REPORT_LOCATION,
    QUALITY_REPORT_BASIC_FILENAME,
    QUALITY_REPORT_SCHEDULER_FORMAT,
    QUALITY_REPORT_SCHEDULER_YEARS,
    QUALITY_REPORT_GROUP_MODUL,
    QUALITY_REPORT_SCHEDULER_BY_YEAR,
    QUALITY_REPORT_SCHEDULER_BY_MONTH,
    QUALITY_REPORT_STATISTICS_FILENAME,
    QUALITY_REPORT_EXCEL_INFO_FILENAME,
    QUALITY_REPORT_EXCEL_INFO_URL,
    QUALITY_REPORT_LANGUAGE_CODE,
    QUALITY_REPORT_TIMEOUT_IN_MINUTES,
    QUALITY_REPORT_SHOW_INFO_SHEET,
    QUALITY_REPORT_SHOW_FILTERED_ELEMENTS_SHEET,
    QUALITY_REPORT_SHOW_PATIENT_IDS_SHEET,
    QUALITY_REPORT_SHOW_ALL_ELEMENTS_SHEET,
    QUALITY_REPORT_SHOW_STATISTICS_SHEET,
    MONITORING_REPORT_COUNT_TOTAL,
    MONITORING_REPORT_COUNT_DKTKFLAG,
    MONITORING_REPORT_COUNT_REFERENCEQUERY,
    MONITORING_REPORT_TIME_REFERENCEQUERY,
    MONITORING_REPORT_CENTRAXX_MAPPING_INFORMATION,
    LDM_CACHING_ENABLED,
    LDM_CACHING_MAX_SIZE,
    EXPORT_MDR_BLACKLIST,
    ID_CONNECTOR_SOCKET_TIMEOUT,
    ID_CONNECTOR_CONNECT_TIMEOUT,
    ID_CONNECTOR_CONNECTION_REQUEST_TIMEOUT,
    ID_CONNECTOR_MAX_NUMBER_OF_CONNECTION_ATTEMPTS,
    ID_CONNECTOR_TIME_TO_WAIT_IN_SECONDS_BETWEEN_CONNECTION_ATTEMPTS,
    CTS_USERNAME,
    CTS_PASSWORD,
    CTS_PROFILE,
    CTS_URL,
    CTS_MAINZELLISTE_URL,
    CTS_MAINZELLISTE_API_KEY
}
