package org.atom.linx.data;

import java.util.Date;

class Attachment {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

public class ContentExport {
    private int id;
    private Date created_at;
    private String export_type;
    private Attachment attachment;
    private String progress_url;
    private int user_id;
    private String workflow_state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(Date created_at) {
        this.created_at = created_at;
    }

    public String getExportType() {
        return export_type;
    }

    public void setExportType(String export_type) {
        this.export_type = export_type;
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
}
