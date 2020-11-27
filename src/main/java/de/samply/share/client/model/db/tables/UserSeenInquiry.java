/*
 * This file is generated by jOOQ.
*/
package de.samply.share.client.model.db.tables;


import de.samply.share.client.model.db.Keys;
import de.samply.share.client.model.db.Samply;
import de.samply.share.client.model.db.tables.records.UserSeenInquiryRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class UserSeenInquiry extends TableImpl<UserSeenInquiryRecord> {

    private static final long serialVersionUID = 1285444075;

    /**
     * The reference instance of <code>samply.user_seen_inquiry</code>
     */
    public static final UserSeenInquiry USER_SEEN_INQUIRY = new UserSeenInquiry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserSeenInquiryRecord> getRecordType() {
        return UserSeenInquiryRecord.class;
    }

    /**
     * The column <code>samply.user_seen_inquiry.user_id</code>.
     */
    public final TableField<UserSeenInquiryRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>samply.user_seen_inquiry.inquiry_id</code>.
     */
    public final TableField<UserSeenInquiryRecord, Integer> INQUIRY_ID = createField("inquiry_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>samply.user_seen_inquiry</code> table reference
     */
    public UserSeenInquiry() {
        this("user_seen_inquiry", null);
    }

    /**
     * Create an aliased <code>samply.user_seen_inquiry</code> table reference
     */
    public UserSeenInquiry(String alias) {
        this(alias, USER_SEEN_INQUIRY);
    }

    private UserSeenInquiry(String alias, Table<UserSeenInquiryRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserSeenInquiry(String alias, Table<UserSeenInquiryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
    public UniqueKey<UserSeenInquiryRecord> getPrimaryKey() {
        return Keys.USER_SEEN_INQUIRY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserSeenInquiryRecord>> getKeys() {
        return Arrays.<UniqueKey<UserSeenInquiryRecord>>asList(Keys.USER_SEEN_INQUIRY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UserSeenInquiryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserSeenInquiryRecord, ?>>asList(Keys.USER_SEEN_INQUIRY__USER_SEEN_INQUIRY_USER_ID_FKEY, Keys.USER_SEEN_INQUIRY__USER_SEEN_INQUIRY_INQUIRY_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSeenInquiry as(String alias) {
        return new UserSeenInquiry(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSeenInquiry rename(String name) {
        return new UserSeenInquiry(name, null);
    }
}
