/*
 * This file is generated by jOOQ.
*/
package de.samply.share.client.model.db.tables.daos;


import de.samply.share.client.model.db.enums.BrokerStatusType;
import de.samply.share.client.model.db.tables.Broker;
import de.samply.share.client.model.db.tables.records.BrokerRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class BrokerDao extends DAOImpl<BrokerRecord, de.samply.share.client.model.db.tables.pojos.Broker, Integer> {

    /**
     * Create a new BrokerDao without any configuration
     */
    public BrokerDao() {
        super(Broker.BROKER, de.samply.share.client.model.db.tables.pojos.Broker.class);
    }

    /**
     * Create a new BrokerDao with an attached configuration
     */
    public BrokerDao(Configuration configuration) {
        super(Broker.BROKER, de.samply.share.client.model.db.tables.pojos.Broker.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(de.samply.share.client.model.db.tables.pojos.Broker object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.Broker> fetchById(Integer... values) {
        return fetch(Broker.BROKER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public de.samply.share.client.model.db.tables.pojos.Broker fetchOneById(Integer value) {
        return fetchOne(Broker.BROKER.ID, value);
    }

    /**
     * Fetch records that have <code>address IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.Broker> fetchByAddress(String... values) {
        return fetch(Broker.BROKER.ADDRESS, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.Broker> fetchByName(String... values) {
        return fetch(Broker.BROKER.NAME, values);
    }

    /**
     * Fetch records that have <code>last_checked IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.Broker> fetchByLastChecked(Timestamp... values) {
        return fetch(Broker.BROKER.LAST_CHECKED, values);
    }

    /**
     * Fetch records that have <code>credentials_id IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.Broker> fetchByCredentialsId(Integer... values) {
        return fetch(Broker.BROKER.CREDENTIALS_ID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.Broker> fetchByStatus(BrokerStatusType... values) {
        return fetch(Broker.BROKER.STATUS, values);
    }
}
