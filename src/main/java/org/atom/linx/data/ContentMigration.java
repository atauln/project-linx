package org.atom.linx.data;

import java.util.Date;

class UploadParams { //TODO file:file_uploads.html File Upload Documentation
}

class PreAttachment {
    protected String upload_url;
    protected String message;
    protected UploadParams upload_params;

    public String getUploadUrl() {
        return upload_url;
    }

    public void setUploadUrl(String upload_url) {
        this.upload_url = upload_url;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UploadParams getUploadParams() {
        return upload_params;
    }

    public void setUploadParams(UploadParams upload_params) {
        this.upload_params = upload_params;
    }
}

public class ContentMigration {
    protected int id;
    protected String migration_type;
    protected String migration_type_title;
    protected String migration_issues_url;
    protected Attachment attachment;
    protected String progress_url;
    protected int user_id;
    protected String workflow_state;
    protected Date started_at;
    protected Date finished_at;
    protected PreAttachment pre_attachment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMigrationType() {
        return migration_type;
    }

    public void setMigrationType(String migration_type) {
        this.migration_type = migration_type;
    }

    public String getMigrationTypeTitle() {
        return migration_type_title;
    }

    public void setMigrationTypeTitle(String migration_type_title) {
        this.migration_type_title = migration_type_title;
    }

    public String getMigrationIssuesUrl() {
        return migration_issues_url;
    }

    public void setMigrationIssuesUrl(String migration_issues_url) {
        this.migration_issues_url = migration_issues_url;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getProgressUrl() {
        return progress_url;
    }

    public void setProgressUrl(String progress_url) {
        this.progress_url = progress_url;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public String getWorkflowState() {
        return workflow_state;
    }

    public void setWorkflowState(String workflow_state) {
        this.workflow_state = workflow_state;
    }

    public Date getStartedAt() {
        return started_at;
    }

    public void setStartedAt(Date started_at) {
        this.started_at = started_at;
    }

    public Date getFinishedAt() {
        return finished_at;
    }

    public void setFinishedAt(Date finished_at) {
        this.finished_at = finished_at;
    }

    public PreAttachment getPreAttachment() {
        return pre_attachment;
    }

    public void setPreAttachment(PreAttachment pre_attachment) {
        this.pre_attachment = pre_attachment;
    }
}
