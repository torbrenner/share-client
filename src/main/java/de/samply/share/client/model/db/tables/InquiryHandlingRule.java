/*
 * This file is generated by jOOQ.
*/
package de.samply.share.client.model.db.tables;


import de.samply.share.client.model.db.Keys;
import de.samply.share.client.model.db.Samply;
import de.samply.share.client.model.db.enums.ReplyRuleType;
import de.samply.share.client.model.db.tables.records.InquiryHandlingRuleRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * Incoming inquiries may be handled differently, depending on several criteria. 
 * Allow to define an "if" part which has to be handled in the application, 
 * a link to a specific broker (may be null), a link to a certain result type 
 * (may also be null) as well as an action to take (e.g. instantly reply a 
 * number)
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InquiryHandlingRule extends TableImpl<InquiryHandlingRuleRecord> {

    private static final long serialVersionUID = -715928098;

    /**
     * The reference instance of <code>samply.inquiry_handling_rule</code>
     */
    public static final InquiryHandlingRule INQUIRY_HANDLING_RULE = new InquiryHandlingRule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InquiryHandlingRuleRecord> getRecordType() {
        return InquiryHandlingRuleRecord.class;
    }

    /**
     * The column <code>samply.inquiry_handling_rule.id</code>.
     */
    public final TableField<InquiryHandlingRuleRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('samply.inquiry_handling_rule_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>samply.inquiry_handling_rule.broker_id</code>.
     */
    public final TableField<InquiryHandlingRuleRecord, Integer> BROKER_ID = createField("broker_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>samply.inquiry_handling_rule.full_result</code>. Should the full result be generated here?
     */
    public final TableField<InquiryHandlingRuleRecord, Boolean> FULL_RESULT = createField("full_result", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "Should the full result be generated here?");

    /**
     * The column <code>samply.inquiry_handling_rule.automatic_reply</code>.
     */
    public final TableField<InquiryHandlingRuleRecord, ReplyRuleType> AUTOMATIC_REPLY = createField("automatic_reply", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(de.samply.share.client.model.db.enums.ReplyRuleType.class), this, "");

    /**
     * Create a <code>samply.inquiry_handling_rule</code> table reference
     */
    public InquiryHandlingRule() {
        this("inquiry_handling_rule", null);
    }

    /**
     * Create an aliased <code>samply.inquiry_handling_rule</code> table reference
     */
    public InquiryHandlingRule(String alias) {
        this(alias, INQUIRY_HANDLING_RULE);
    }

    private InquiryHandlingRule(String alias, Table<InquiryHandlingRuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private InquiryHandlingRule(String alias, Table<InquiryHandlingRuleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Incoming inquiries may be handled differently, depending on several criteria. Allow to define an \"if\" part which has to be handled in the application, a link to a specific broker (may be null), a link to a certain result type (may also be null) as well as an action to take (e.g. instantly reply a number)");
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
    public Identity<InquiryHandlingRuleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_INQUIRY_HANDLING_RULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InquiryHandlingRuleRecord> getPrimaryKey() {
        return Keys.INQUIRY_HANDLING_RULE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InquiryHandlingRuleRecord>> getKeys() {
        return Arrays.<UniqueKey<InquiryHandlingRuleRecord>>asList(Keys.INQUIRY_HANDLING_RULE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<InquiryHandlingRuleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<InquiryHandlingRuleRecord, ?>>asList(Keys.INQUIRY_HANDLING_RULE__INQUIRY_HANDLING_RULE_BROKER_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InquiryHandlingRule as(String alias) {
        return new InquiryHandlingRule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InquiryHandlingRule rename(String name) {
        return new InquiryHandlingRule(name, null);
    }
}
