/*
 * This file is generated by jOOQ.
*/
package de.samply.share.client.model.db.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class Inquiry implements Serializable {

    private static final long serialVersionUID = -400366166;

    private Integer   id;
    private Integer   uploadId;
    private Integer   sourceId;
    private String    label;
    private String    description;
    private Integer   brokerId;
    private Integer   latestDetailsId;
    private Timestamp archivedAt;
    private Timestamp deletedAt;

    public Inquiry() {}

    public Inquiry(Inquiry value) {
        this.id = value.id;
        this.uploadId = value.uploadId;
        this.sourceId = value.sourceId;
        this.label = value.label;
        this.description = value.description;
        this.brokerId = value.brokerId;
        this.latestDetailsId = value.latestDetailsId;
        this.archivedAt = value.archivedAt;
        this.deletedAt = value.deletedAt;
    }

    public Inquiry(
        Integer   id,
        Integer   uploadId,
        Integer   sourceId,
        String    label,
        String    description,
        Integer   brokerId,
        Integer   latestDetailsId,
        Timestamp archivedAt,
        Timestamp deletedAt
    ) {
        this.id = id;
        this.uploadId = uploadId;
        this.sourceId = sourceId;
        this.label = label;
        this.description = description;
        this.brokerId = brokerId;
        this.latestDetailsId = latestDetailsId;
        this.archivedAt = archivedAt;
        this.deletedAt = deletedAt;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUploadId() {
        return this.uploadId;
    }

    public void setUploadId(Integer uploadId) {
        this.uploadId = uploadId;
    }

    public Integer getSourceId() {
        return this.sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getBrokerId() {
        return this.brokerId;
    }

    public void setBrokerId(Integer brokerId) {
        this.brokerId = brokerId;
    }

    public Integer getLatestDetailsId() {
        return this.latestDetailsId;
    }

    public void setLatestDetailsId(Integer latestDetailsId) {
        this.latestDetailsId = latestDetailsId;
    }

    public Timestamp getArchivedAt() {
        return this.archivedAt;
    }

    public void setArchivedAt(Timestamp archivedAt) {
        this.archivedAt = archivedAt;
    }

    public Timestamp getDeletedAt() {
        return this.deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Inquiry (");

        sb.append(id);
        sb.append(", ").append(uploadId);
        sb.append(", ").append(sourceId);
        sb.append(", ").append(label);
        sb.append(", ").append(description);
        sb.append(", ").append(brokerId);
        sb.append(", ").append(latestDetailsId);
        sb.append(", ").append(archivedAt);
        sb.append(", ").append(deletedAt);

        sb.append(")");
        return sb.toString();
    }
}
