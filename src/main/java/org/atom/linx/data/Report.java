package org.atom.linx.data;

import java.util.Date;

class ReportParameters {
    public int enrollment_term_id;
    public boolean include_deleted;
    public int course_id;
    public String order;
    public boolean users;
    public boolean accounts;
    public boolean terms;
    public boolean courses;
    public boolean sections;
    public boolean enrollments;
    public boolean groups;
    public boolean xlist;
    public int sis_terms_csv;
    public int sis_accounts_csv;
    public boolean include_enrollment_state;
    public String[] enrollment_state;
    public Date start_at;
    public Date end_at;

    public int getEnrollmentTermId() {
        return enrollment_term_id;
    }

    public void setEnrollmentTermId(int enrollment_term_id) {
        this.enrollment_term_id = enrollment_term_id;
    }

    public boolean isIncludeDeleted() {
        return include_deleted;
    }

    public void setIncludeDeleted(boolean include_deleted) {
        this.include_deleted = include_deleted;
    }

    public int getCourseId() {
        return course_id;
    }

    public void setCourseId(int course_id) {
        this.course_id = course_id;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public boolean isUsers() {
        return users;
    }

    public void setUsers(boolean users) {
        this.users = users;
    }

    public boolean isAccounts() {
        return accounts;
    }

    public void setAccounts(boolean accounts) {
        this.accounts = accounts;
    }

    public boolean isTerms() {
        return terms;
    }

    public void setTerms(boolean terms) {
        this.terms = terms;
    }

    public boolean isCourses() {
        return courses;
    }

    public void setCourses(boolean courses) {
        this.courses = courses;
    }

    public boolean isSections() {
        return sections;
    }

    public void setSections(boolean sections) {
        this.sections = sections;
    }

    public boolean isEnrollments() {
        return enrollments;
    }

    public void setEnrollments(boolean enrollments) {
        this.enrollments = enrollments;
    }

    public boolean isGroups() {
        return groups;
    }

    public void setGroups(boolean groups) {
        this.groups = groups;
    }

    public boolean isXlist() {
        return xlist;
    }

    public void setXlist(boolean xlist) {
        this.xlist = xlist;
    }

    public int getSisTermsCsv() {
        return sis_terms_csv;
    }

    public void setSisTermsCsv(int sis_terms_csv) {
        this.sis_terms_csv = sis_terms_csv;
    }

    public int getSisAccountsCsv() {
        return sis_accounts_csv;
    }

    public void setSisAccountsCsv(int sis_accounts_csv) {
        this.sis_accounts_csv = sis_accounts_csv;
    }

    public boolean isIncludeEnrollmentState() {
        return include_enrollment_state;
    }

    public void setIncludeEnrollmentState(boolean include_enrollment_state) {
        this.include_enrollment_state = include_enrollment_state;
    }

    public String[] getEnrollmentState() {
        return enrollment_state;
    }

    public void setEnrollmentState(String[] enrollment_state) {
        this.enrollment_state = enrollment_state;
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
}

public class Report {
    public int id;
    public String report;
    public String file_url;
    public Object attachment;
    public String status;
    public Date created_at;
    public Date started_at;
    public Date ended_at;
    public ReportParameters parameters;
    public int progress;
    public int current_line;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getFileUrl() {
        return file_url;
    }

    public void setFileUrl(String file_url) {
        this.file_url = file_url;
    }

    public Object getAttachment() {
        return attachment;
    }

    public void setAttachment(Object attachment) {
        this.attachment = attachment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(Date created_at) {
        this.created_at = created_at;
    }

    public Date getStartedAt() {
        return started_at;
    }

    public void setStartedAt(Date started_at) {
        this.started_at = started_at;
    }

    public Date getEndedAt() {
        return ended_at;
    }

    public void setEndedAt(Date ended_at) {
        this.ended_at = ended_at;
    }

    public ReportParameters getParameters() {
        return parameters;
    }

    public void setParameters(ReportParameters parameters) {
        this.parameters = parameters;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getCurrentLine() {
        return current_line;
    }

    public void setCurrentLine(int current_line) {
        this.current_line = current_line;
    }
}
