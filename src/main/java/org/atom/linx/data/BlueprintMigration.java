package org.atom.linx.data;

import java.util.Date;

public class BlueprintMigration {
    protected int id;
    protected int template_id;
    protected int subscription_id;
    protected int user_id;
    protected String workflow_state;
    protected Date created_at;
    protected Date exports_started_at;
    protected Date imports_queued_at;
    protected Date imports_completed_at;
    protected String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTemplateId() {
        return template_id;
    }

    public void setTemplateId(int template_id) {
        this.template_id = template_id;
    }

    public int getSubscriptionId() {
        return subscription_id;
    }

    public void setSubscriptionId(int subscription_id) {
        this.subscription_id = subscription_id;
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

    public Date getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(Date created_at) {
        this.created_at = created_at;
    }

    public Date getExportsStartedAt() {
        return exports_started_at;
    }

    public void setExportsStartedAt(Date exports_started_at) {
        this.exports_started_at = exports_started_at;
    }

    public Date getImportsQueuedAt() {
        return imports_queued_at;
    }

    public void setImportsQueuedAt(Date imports_queued_at) {
        this.imports_queued_at = imports_queued_at;
    }

    public Date getImportsCompletedAt() {
        return imports_completed_at;
    }

    public void setImportsCompletedAt(Date imports_completed_at) {
        this.imports_completed_at = imports_completed_at;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
