/*
 * This file is generated by jOOQ.
*/
package de.samply.share.client.model.db.tables.daos;


import de.samply.share.client.model.db.tables.UserNotification;
import de.samply.share.client.model.db.tables.records.UserNotificationRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;


/**
 * Which user shall receive which notifications?
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserNotificationDao extends DAOImpl<UserNotificationRecord, de.samply.share.client.model.db.tables.pojos.UserNotification, Record2<Integer, Integer>> {

    /**
     * Create a new UserNotificationDao without any configuration
     */
    public UserNotificationDao() {
        super(UserNotification.USER_NOTIFICATION, de.samply.share.client.model.db.tables.pojos.UserNotification.class);
    }

    /**
     * Create a new UserNotificationDao with an attached configuration
     */
    public UserNotificationDao(Configuration configuration) {
        super(UserNotification.USER_NOTIFICATION, de.samply.share.client.model.db.tables.pojos.UserNotification.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Integer, Integer> getId(de.samply.share.client.model.db.tables.pojos.UserNotification object) {
        return compositeKeyRecord(object.getUserId(), object.getRequestedEntityId());
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.UserNotification> fetchByUserId(Integer... values) {
        return fetch(UserNotification.USER_NOTIFICATION.USER_ID, values);
    }

    /**
     * Fetch records that have <code>requested_entity_id IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.UserNotification> fetchByRequestedEntityId(Integer... values) {
        return fetch(UserNotification.USER_NOTIFICATION.REQUESTED_ENTITY_ID, values);
    }
}
