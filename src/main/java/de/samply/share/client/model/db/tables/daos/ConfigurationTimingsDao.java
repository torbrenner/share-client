/*
 * This file is generated by jOOQ.
*/
package de.samply.share.client.model.db.tables.daos;


import de.samply.share.client.model.db.tables.ConfigurationTimings;
import de.samply.share.client.model.db.tables.records.ConfigurationTimingsRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * Use an extra table for timing parameters for the sake of simply using integers
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigurationTimingsDao extends DAOImpl<ConfigurationTimingsRecord, de.samply.share.client.model.db.tables.pojos.ConfigurationTimings, String> {

    /**
     * Create a new ConfigurationTimingsDao without any configuration
     */
    public ConfigurationTimingsDao() {
        super(ConfigurationTimings.CONFIGURATION_TIMINGS, de.samply.share.client.model.db.tables.pojos.ConfigurationTimings.class);
    }

    /**
     * Create a new ConfigurationTimingsDao with an attached configuration
     */
    public ConfigurationTimingsDao(Configuration configuration) {
        super(ConfigurationTimings.CONFIGURATION_TIMINGS, de.samply.share.client.model.db.tables.pojos.ConfigurationTimings.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(de.samply.share.client.model.db.tables.pojos.ConfigurationTimings object) {
        return object.getName();
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.ConfigurationTimings> fetchByName(String... values) {
        return fetch(ConfigurationTimings.CONFIGURATION_TIMINGS.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>name = value</code>
     */
    public de.samply.share.client.model.db.tables.pojos.ConfigurationTimings fetchOneByName(String value) {
        return fetchOne(ConfigurationTimings.CONFIGURATION_TIMINGS.NAME, value);
    }

    /**
     * Fetch records that have <code>setting IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.ConfigurationTimings> fetchBySetting(Integer... values) {
        return fetch(ConfigurationTimings.CONFIGURATION_TIMINGS.SETTING, values);
    }

    /**
     * Fetch records that have <code>visible IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.ConfigurationTimings> fetchByVisible(Boolean... values) {
        return fetch(ConfigurationTimings.CONFIGURATION_TIMINGS.VISIBLE, values);
    }
}
