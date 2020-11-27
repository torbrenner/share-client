/*
 * This file is generated by jOOQ.
*/
package de.samply.share.client.model.db.tables.records;


import de.samply.share.client.model.db.enums.UploadStatusType;
import de.samply.share.client.model.db.tables.Upload;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Uploads to central search.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UploadRecord extends UpdatableRecordImpl<UploadRecord> implements Record11<Integer, UploadStatusType, Timestamp, String, Boolean, Boolean, Boolean, Integer, Integer, String, Timestamp> {

    private static final long serialVersionUID = -573222582;

    /**
     * Setter for <code>samply.upload.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>samply.upload.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>samply.upload.status</code>.
     */
    public void setStatus(UploadStatusType value) {
        set(1, value);
    }

    /**
     * Getter for <code>samply.upload.status</code>.
     */
    public UploadStatusType getStatus() {
        return (UploadStatusType) get(1);
    }

    /**
     * Setter for <code>samply.upload.triggered_at</code>.
     */
    public void setTriggeredAt(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>samply.upload.triggered_at</code>.
     */
    public Timestamp getTriggeredAt() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>samply.upload.triggered_by</code>. Who triggered the upload? Was it automatically by the scheduler, or did a user do it?
     */
    public void setTriggeredBy(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>samply.upload.triggered_by</code>. Who triggered the upload? Was it automatically by the scheduler, or did a user do it?
     */
    public String getTriggeredBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>samply.upload.is_dryrun</code>.
     */
    public void setIsDryrun(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>samply.upload.is_dryrun</code>.
     */
    public Boolean getIsDryrun() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>samply.upload.is_full_upload</code>.
     */
    public void setIsFullUpload(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>samply.upload.is_full_upload</code>.
     */
    public Boolean getIsFullUpload() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>samply.upload.dktk_flagged</code>.
     */
    public void setDktkFlagged(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>samply.upload.dktk_flagged</code>.
     */
    public Boolean getDktkFlagged() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>samply.upload.success_count</code>. How many upload datasets were acknowledged with a 2xx status code
     */
    public void setSuccessCount(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>samply.upload.success_count</code>. How many upload datasets were acknowledged with a 2xx status code
     */
    public Integer getSuccessCount() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>samply.upload.failure_count</code>. How many upload datasets were finally denied
     */
    public void setFailureCount(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>samply.upload.failure_count</code>. How many upload datasets were finally denied
     */
    public Integer getFailureCount() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>samply.upload.failed_patients</code>. A JSON array of DKTK site ids of the failed patients
     */
    public void setFailedPatients(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>samply.upload.failed_patients</code>. A JSON array of DKTK site ids of the failed patients
     */
    public String getFailedPatients() {
        return (String) get(9);
    }

    /**
     * Setter for <code>samply.upload.time_to_set</code>. The timestamp that will be set at the central mds db at the end of the upload
     */
    public void setTimeToSet(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>samply.upload.time_to_set</code>. The timestamp that will be set at the central mds db at the end of the upload
     */
    public Timestamp getTimeToSet() {
        return (Timestamp) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, UploadStatusType, Timestamp, String, Boolean, Boolean, Boolean, Integer, Integer, String, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, UploadStatusType, Timestamp, String, Boolean, Boolean, Boolean, Integer, Integer, String, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Upload.UPLOAD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UploadStatusType> field2() {
        return Upload.UPLOAD.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Upload.UPLOAD.TRIGGERED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Upload.UPLOAD.TRIGGERED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return Upload.UPLOAD.IS_DRYRUN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return Upload.UPLOAD.IS_FULL_UPLOAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return Upload.UPLOAD.DKTK_FLAGGED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Upload.UPLOAD.SUCCESS_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Upload.UPLOAD.FAILURE_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Upload.UPLOAD.FAILED_PATIENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Upload.UPLOAD.TIME_TO_SET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadStatusType value2() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getTriggeredAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTriggeredBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getIsDryrun();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getIsFullUpload();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getDktkFlagged();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getSuccessCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getFailureCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getFailedPatients();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getTimeToSet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadRecord value2(UploadStatusType value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadRecord value3(Timestamp value) {
        setTriggeredAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadRecord value4(String value) {
        setTriggeredBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadRecord value5(Boolean value) {
        setIsDryrun(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadRecord value6(Boolean value) {
        setIsFullUpload(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadRecord value7(Boolean value) {
        setDktkFlagged(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadRecord value8(Integer value) {
        setSuccessCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadRecord value9(Integer value) {
        setFailureCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadRecord value10(String value) {
        setFailedPatients(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadRecord value11(Timestamp value) {
        setTimeToSet(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UploadRecord values(Integer value1, UploadStatusType value2, Timestamp value3, String value4, Boolean value5, Boolean value6, Boolean value7, Integer value8, Integer value9, String value10, Timestamp value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UploadRecord
     */
    public UploadRecord() {
        super(Upload.UPLOAD);
    }

    /**
     * Create a detached, initialised UploadRecord
     */
    public UploadRecord(Integer id, UploadStatusType status, Timestamp triggeredAt, String triggeredBy, Boolean isDryrun, Boolean isFullUpload, Boolean dktkFlagged, Integer successCount, Integer failureCount, String failedPatients, Timestamp timeToSet) {
        super(Upload.UPLOAD);

        set(0, id);
        set(1, status);
        set(2, triggeredAt);
        set(3, triggeredBy);
        set(4, isDryrun);
        set(5, isFullUpload);
        set(6, dktkFlagged);
        set(7, successCount);
        set(8, failureCount);
        set(9, failedPatients);
        set(10, timeToSet);
    }
}
