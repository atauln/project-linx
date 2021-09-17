package org.atom.linx.data;

import java.util.Date;

public class MigrationIssue {
    private int id;
    private String content_migration_url;
    private String description;
    private String workflow_state;
    private String fix_issue_html_url;
    private String issue_type;
    private String error_report_html_url;
    private String error_message;
    private Date created_at;
    private Date updated_at;

    public int getId() {
        return id;
    }

    public void SetId(int id) {
        this.id = id;
    }

    public String getContentMigrationUrl() {
        return content_migration_url;
    }

    public void setContentMigrationUrl(String content_migration_url) {
        this.content_migration_url = content_migration_url;
    }

    public String getDescription() {
        return description;
    }

    public void SetDescription(String description) {
        this.description = description;
    }

    public String getWorkflowState() {
        return workflow_state;
    }

    public void setWorkflowState(String workflow_state) {
        this.workflow_state = workflow_state;
    }

    public String getFixIssueHtmlUrl() {
        return fix_issue_html_url;
    }

    public void setFixIssueHtmlUrl(String fix_issue_html_url) {
        this.fix_issue_html_url = fix_issue_html_url;
    }

    public String getIssueType() {
        return issue_type;
    }

    public void setIssueType(String issue_type) {
        this.issue_type = issue_type;
    }

    public String getErrorReportHtmlUrl() {
        return error_report_html_url;
    }

    public void setErrorReportHtmlUrl(String error_report_html_url) {
        this.error_report_html_url = error_report_html_url;
    }

    public String getErrorMessage() {
        return error_message;
    }

    public void setErrorMessage(String error_message) {
        this.error_message = error_message;
    }

    public Date getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdatedAt() {
        return updated_at;
    }

    public void setUpdatedAt(Date updated_at) {
        this.updated_at = updated_at;
    }
}
