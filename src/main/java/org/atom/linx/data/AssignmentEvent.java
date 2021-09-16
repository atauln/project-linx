package org.atom.linx.data;

import java.util.Date;

public class AssignmentEvent {
    private String id;
    private String title;
    private Date start_at;
    private Date end_at;
    private String description;
    private String context_code;
    private String workflow_state;
    private String url;
    private String html_url;
    private String all_day_date;
    private boolean all_day;
    private Date created_at;
    private Date updated_at;
    private Assignment assignment;
    private AssignmentOverride assignment_overrides;
    private boolean important_dates;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartAt() {
        return start_at;
    }

    public void setStartAt(Date start_at) {
        this.start_at = start_at;
    }

    public Date getEndAt() {
        return end_at;
    }

    public void setEndAt(Date end_at) {
        this.end_at = end_at;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContextCode() {
        return context_code;
    }

    public void setContextCode(String context_code) {
        this.context_code = context_code;
    }

    public String getWorkflowState() {
        return workflow_state;
    }

    public void setWorkflowState(String workflow_state) {
        this.workflow_state = workflow_state;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtmlUrl() {
        return html_url;
    }

    public void setHtmlUrl(String html_url) {
        this.html_url = html_url;
    }

    public String getAllDayDate() {
        return all_day_date;
    }

    public void setAllDayDate(String all_day_date) {
        this.all_day_date = all_day_date;
    }

    public boolean isAllDay() {
        return all_day;
    }

    public void setAllDay(boolean all_day) {
        this.all_day = all_day;
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

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public AssignmentOverride getAssignmentOverrides() {
        return assignment_overrides;
    }

    public void setAssignmentOverrides(AssignmentOverride assignment_overrides) {
        this.assignment_overrides = assignment_overrides;
    }

    public boolean hasImportantDates() {
        return important_dates;
    }

    public void setImportantDates(boolean important_dates) {
        this.important_dates = important_dates;
    }
}
