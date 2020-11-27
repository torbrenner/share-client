/*
 * This file is generated by jOOQ.
*/
package de.samply.share.client.model.db.tables.pojos;


import de.samply.share.client.model.db.enums.AuthSchemeType;
import de.samply.share.client.model.db.enums.TargetType;

import java.io.Serializable;

import javax.annotation.Generated;


/**
 * Stored credentials for central search,  searchbrokers, local datamanagement...
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Credentials implements Serializable {

    private static final long serialVersionUID = -964106918;

    private Integer        id;
    private AuthSchemeType authScheme;
    private TargetType     target;
    private String         username;
    private String         passcode;
    private String         workstation;
    private String         domain;

    public Credentials() {}

    public Credentials(Credentials value) {
        this.id = value.id;
        this.authScheme = value.authScheme;
        this.target = value.target;
        this.username = value.username;
        this.passcode = value.passcode;
        this.workstation = value.workstation;
        this.domain = value.domain;
    }

    public Credentials(
        Integer        id,
        AuthSchemeType authScheme,
        TargetType     target,
        String         username,
        String         passcode,
        String         workstation,
        String         domain
    ) {
        this.id = id;
        this.authScheme = authScheme;
        this.target = target;
        this.username = username;
        this.passcode = passcode;
        this.workstation = workstation;
        this.domain = domain;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AuthSchemeType getAuthScheme() {
        return this.authScheme;
    }

    public void setAuthScheme(AuthSchemeType authScheme) {
        this.authScheme = authScheme;
    }

    public TargetType getTarget() {
        return this.target;
    }

    public void setTarget(TargetType target) {
        this.target = target;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasscode() {
        return this.passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public String getWorkstation() {
        return this.workstation;
    }

    public void setWorkstation(String workstation) {
        this.workstation = workstation;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Credentials (");

        sb.append(id);
        sb.append(", ").append(authScheme);
        sb.append(", ").append(target);
        sb.append(", ").append(username);
        sb.append(", ").append(passcode);
        sb.append(", ").append(workstation);
        sb.append(", ").append(domain);

        sb.append(")");
        return sb.toString();
    }
}
