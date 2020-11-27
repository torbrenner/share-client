/*
 * This file is generated by jOOQ.
*/
package de.samply.share.client.model.db.tables.daos;


import de.samply.share.client.model.db.tables.UserSeenInquiry;
import de.samply.share.client.model.db.tables.records.UserSeenInquiryRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
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
public class UserSeenInquiryDao extends DAOImpl<UserSeenInquiryRecord, de.samply.share.client.model.db.tables.pojos.UserSeenInquiry, Record2<Integer, Integer>> {

    /**
     * Create a new UserSeenInquiryDao without any configuration
     */
    public UserSeenInquiryDao() {
        super(UserSeenInquiry.USER_SEEN_INQUIRY, de.samply.share.client.model.db.tables.pojos.UserSeenInquiry.class);
    }

    /**
     * Create a new UserSeenInquiryDao with an attached configuration
     */
    public UserSeenInquiryDao(Configuration configuration) {
        super(UserSeenInquiry.USER_SEEN_INQUIRY, de.samply.share.client.model.db.tables.pojos.UserSeenInquiry.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Integer, Integer> getId(de.samply.share.client.model.db.tables.pojos.UserSeenInquiry object) {
        return compositeKeyRecord(object.getUserId(), object.getInquiryId());
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.UserSeenInquiry> fetchByUserId(Integer... values) {
        return fetch(UserSeenInquiry.USER_SEEN_INQUIRY.USER_ID, values);
    }

    /**
     * Fetch records that have <code>inquiry_id IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.UserSeenInquiry> fetchByInquiryId(Integer... values) {
        return fetch(UserSeenInquiry.USER_SEEN_INQUIRY.INQUIRY_ID, values);
    }
}
