/*
 * This file is generated by jOOQ.
*/
package de.samply.share.client.model.db.tables.daos;


import de.samply.share.client.model.db.enums.UploadStatusType;
import de.samply.share.client.model.db.tables.Upload;
import de.samply.share.client.model.db.tables.records.UploadRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class UploadDao extends DAOImpl<UploadRecord, de.samply.share.client.model.db.tables.pojos.Upload, Integer> {

    /**
     * Create a new UploadDao without any configuration
     */
    public UploadDao() {
        super(Upload.UPLOAD, de.samply.share.client.model.db.tables.pojos.Upload.class);
    }

    /**
     * Create a new UploadDao with an attached configuration
     */
    public UploadDao(Configuration configuration) {
        super(Upload.UPLOAD, de.samply.share.client.model.db.tables.pojos.Upload.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(de.samply.share.client.model.db.tables.pojos.Upload object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.Upload> fetchById(Integer... values) {
        return fetch(Upload.UPLOAD.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public de.samply.share.client.model.db.tables.pojos.Upload fetchOneById(Integer value) {
        return fetchOne(Upload.UPLOAD.ID, value);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.Upload> fetchByStatus(UploadStatusType... values) {
        return fetch(Upload.UPLOAD.STATUS, values);
    }

    /**
     * Fetch records that have <code>triggered_at IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.Upload> fetchByTriggeredAt(Timestamp... values) {
        return fetch(Upload.UPLOAD.TRIGGERED_AT, values);
    }

    /**
     * Fetch records that have <code>triggered_by IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.Upload> fetchByTriggeredBy(String... values) {
        return fetch(Upload.UPLOAD.TRIGGERED_BY, values);
    }

    /**
     * Fetch records that have <code>is_dryrun IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.Upload> fetchByIsDryrun(Boolean... values) {
        return fetch(Upload.UPLOAD.IS_DRYRUN, values);
    }

    /**
     * Fetch records that have <code>is_full_upload IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.Upload> fetchByIsFullUpload(Boolean... values) {
        return fetch(Upload.UPLOAD.IS_FULL_UPLOAD, values);
    }

    /**
     * Fetch records that have <code>dktk_flagged IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.Upload> fetchByDktkFlagged(Boolean... values) {
        return fetch(Upload.UPLOAD.DKTK_FLAGGED, values);
    }

    /**
     * Fetch records that have <code>success_count IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.Upload> fetchBySuccessCount(Integer... values) {
        return fetch(Upload.UPLOAD.SUCCESS_COUNT, values);
    }

    /**
     * Fetch records that have <code>failure_count IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.Upload> fetchByFailureCount(Integer... values) {
        return fetch(Upload.UPLOAD.FAILURE_COUNT, values);
    }

    /**
     * Fetch records that have <code>failed_patients IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.Upload> fetchByFailedPatients(String... values) {
        return fetch(Upload.UPLOAD.FAILED_PATIENTS, values);
    }

    /**
     * Fetch records that have <code>time_to_set IN (values)</code>
     */
    public List<de.samply.share.client.model.db.tables.pojos.Upload> fetchByTimeToSet(Timestamp... values) {
        return fetch(Upload.UPLOAD.TIME_TO_SET, values);
    }
}
