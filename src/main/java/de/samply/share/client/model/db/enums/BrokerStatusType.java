/*
 * This file is generated by jOOQ.
*/
package de.samply.share.client.model.db.enums;


import de.samply.share.client.model.db.Samply;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum BrokerStatusType implements EnumType {

    BS_UNREACHABLE("BS_UNREACHABLE"),

    BS_USER_UNKNOWN("BS_USER_UNKNOWN"),

    BS_AUTHENTICATION_ERROR("BS_AUTHENTICATION_ERROR"),

    BS_ACTIVATION_PENDING("BS_ACTIVATION_PENDING"),

    BS_OK("BS_OK");

    private final String literal;

    private BrokerStatusType(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return getSchema() == null ? null : getSchema().getCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Samply.SAMPLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "broker_status_type";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
