/*
 * This file is generated by jOOQ.
*/
package de.samply.share.client.model.db.tables;


import de.samply.share.client.model.db.Keys;
import de.samply.share.client.model.db.Samply;
import de.samply.share.client.model.db.tables.records.DocumentRecord;
import de.samply.share.client.util.jooq.DateConverter;

import java.util.Arrays;
import java.util.Date;
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
 * Users can upload (modified) export files in order to track what they may 
 * have sent to other people
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Document extends TableImpl<DocumentRecord> {

    private static final long serialVersionUID = -1624798045;

    /**
     * The reference instance of <code>samply.document</code>
     */
    public static final Document DOCUMENT = new Document();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DocumentRecord> getRecordType() {
        return DocumentRecord.class;
    }

    /**
     * The column <code>samply.document.id</code>.
     */
    public final TableField<DocumentRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('samply.document_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>samply.document.inquiry_id</code>.
     */
    public final TableField<DocumentRecord, Integer> INQUIRY_ID = createField("inquiry_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>samply.document.user_id</code>.
     */
    public final TableField<DocumentRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>samply.document.uploaded_at</code>.
     */
    public final TableField<DocumentRecord, Date> UPLOADED_AT = createField("uploaded_at", org.jooq.impl.SQLDataType.DATE.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_DATE", org.jooq.impl.SQLDataType.DATE)), this, "", new DateConverter());

    /**
     * The column <code>samply.document.filetype</code>.
     */
    public final TableField<DocumentRecord, String> FILETYPE = createField("filetype", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>samply.document.filename</code>.
     */
    public final TableField<DocumentRecord, String> FILENAME = createField("filename", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>samply.document.data</code>.
     */
    public final TableField<DocumentRecord, byte[]> DATA = createField("data", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * Create a <code>samply.document</code> table reference
     */
    public Document() {
        this("document", null);
    }

    /**
     * Create an aliased <code>samply.document</code> table reference
     */
    public Document(String alias) {
        this(alias, DOCUMENT);
    }

    private Document(String alias, Table<DocumentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Document(String alias, Table<DocumentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Users can upload (modified) export files in order to track what they may have sent to other people");
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
    public Identity<DocumentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DOCUMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DocumentRecord> getPrimaryKey() {
        return Keys.DOCUMENT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DocumentRecord>> getKeys() {
        return Arrays.<UniqueKey<DocumentRecord>>asList(Keys.DOCUMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DocumentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DocumentRecord, ?>>asList(Keys.DOCUMENT__DOCUMENT_INQUIRY_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Document as(String alias) {
        return new Document(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Document rename(String name) {
        return new Document(name, null);
    }
}
