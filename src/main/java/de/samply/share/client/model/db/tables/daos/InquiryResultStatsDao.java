/*
 * This file is generated by jOOQ.
*/
package de.samply.share.client.model.db.tables.daos;


import de.samply.share.client.model.db.tables.InquiryResultStats;
import de.samply.share.client.model.db.tables.records.InquiryResultStatsRecord;

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
public class InquiryResultStatsDao extends DAOImpl<InquiryResultStatsRecord, de.samply.share.client.model.db.tables.pojos.InquiryResultStats, Integer> {

    /**
     * Create a new InquiryResultStatsDao without any configuration
     */
    public InquiryResultStatsDao() {
        super(InquiryResultStats.INQUIRY_RESULT_STATS, de.samply.share.client.model.db.tables.pojos.InquiryResultStats.class);
    }

    /**
     * Create a new InquiryResultStatsDao with an attached configuration
     */
    public InquiryResultStatsDao(Configuration configuration) {
        super(InquiryResultStats.INQUIRY_RESULT_STATS, de.samply.share.client.model.db.tables.pojos.InquiryResultStats.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(de.samply.share.client.model.db.tables.pojos.InquiryResultStats object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.InquiryResultStats> fetchById(Integer... values) {
        return fetch(InquiryResultStats.INQUIRY_RESULT_STATS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public de.samply.share.client.model.db.tables.pojos.InquiryResultStats fetchOneById(Integer value) {
        return fetchOne(InquiryResultStats.INQUIRY_RESULT_STATS.ID, value);
    }

    /**
     * Fetch records that have <code>inquiry_result_id IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.InquiryResultStats> fetchByInquiryResultId(Integer... values) {
        return fetch(InquiryResultStats.INQUIRY_RESULT_STATS.INQUIRY_RESULT_ID, values);
    }

    /**
     * Fetch a unique record that has <code>inquiry_result_id = value</code>
     */
    public de.samply.share.client.model.db.tables.pojos.InquiryResultStats fetchOneByInquiryResultId(Integer value) {
        return fetchOne(InquiryResultStats.INQUIRY_RESULT_STATS.INQUIRY_RESULT_ID, value);
    }

    /**
     * Fetch records that have <code>stats_gender IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.InquiryResultStats> fetchByStatsGender(String... values) {
        return fetch(InquiryResultStats.INQUIRY_RESULT_STATS.STATS_GENDER, values);
    }

    /**
     * Fetch records that have <code>stats_age IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.InquiryResultStats> fetchByStatsAge(String... values) {
        return fetch(InquiryResultStats.INQUIRY_RESULT_STATS.STATS_AGE, values);
    }
}
