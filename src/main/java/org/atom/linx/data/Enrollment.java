package org.atom.linx.data;

import java.util.Date;

public class Enrollment {
    public int id;
    public int course_id;
    public String sis_course_id;
    public String course_integration_id;
    public int course_section_id;
    public String section_integration_id;
    public String sis_account_id;
    public String sis_section_id;
    public String sis_user_id;
    public String enrollment_state;
    public boolean limit_privileges_to_course_section;
    public int sis_import_id;
    public int root_account_id;
    public String type;
    public int user_id;
    public Object associated_user_id;
    public String role;
    public int role_id;
    public Date created_at;
    public Date updated_at;
    public Date start_at;
    public Date end_at;
    public Date last_activity_at;
    public Date last_attended_at;
    public int total_activity_time;
    public String html_url;
    public Grades grades;
    public User user;
    public String override_grade;
    public double override_score;
    public String unposted_current_grade;
    public String unposted_final_grade;
    public String unposted_current_score;
    public String unposted_final_score;
    public boolean has_grading_periods;
    public boolean totals_for_all_grading_periods_option;
    public String current_grading_period_title;
    public int current_grading_period_id;
    public String current_period_override_grade;
    public double current_period_override_score;
    public double current_period_unposted_current_score;
    public double current_period_unposted_final_score;
    public String current_period_unposted_current_grade;
    public String current_period_unposted_final_grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseId() {
        return course_id;
    }

    public void setCourseId(int course_id) {
        this.course_id = course_id;
    }

    public String getSisCourseId() {
        return sis_course_id;
    }

    public void setSisCourseId(String sis_course_id) {
        this.sis_course_id = sis_course_id;
    }

    public String getCourseIntegrationId() {
        return course_integration_id;
    }

    public void setCourseIntegrationId(String course_integration_id) {
        this.course_integration_id = course_integration_id;
    }

    public int getCourseSectionId() {
        return course_section_id;
    }

    public void setCourseSectionId(int course_section_id) {
        this.course_section_id = course_section_id;
    }

    public String getSectionIntegrationId() {
        return section_integration_id;
    }

    public void setSectionIntegrationId(String section_integration_id) {
        this.section_integration_id = section_integration_id;
    }

    public String getSisAccountId() {
        return sis_account_id;
    }

    public void setSisAccountId(String sis_account_id) {
        this.sis_account_id = sis_account_id;
    }

    public String getSisSectionId() {
        return sis_section_id;
    }

    public void setSisSectionId(String sis_section_id) {
        this.sis_section_id = sis_section_id;
    }

    public String getSisUserId() {
        return sis_user_id;
    }

    public void setSisUserId(String sis_user_id) {
        this.sis_user_id = sis_user_id;
    }

    public String getEnrollmentState() {
        return enrollment_state;
    }

    public void setEnrollmentState(String enrollment_state) {
        this.enrollment_state = enrollment_state;
    }

    public boolean isLimitPrivilegesToCourseSection() {
        return limit_privileges_to_course_section;
    }

    public void setLimitPrivilegesToCourseSection(boolean limit_privileges_to_course_section) {
        this.limit_privileges_to_course_section = limit_privileges_to_course_section;
    }

    public int getSisImportId() {
        return sis_import_id;
    }

    public void setSisImportId(int sis_import_id) {
        this.sis_import_id = sis_import_id;
    }

    public int getRootAccountId() {
        return root_account_id;
    }

    public void setRootAccountId(int root_account_id) {
        this.root_account_id = root_account_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public Object getAssociatedUserId() {
        return associated_user_id;
    }

    public void setAssociatedUserId(Object associated_user_id) {
        this.associated_user_id = associated_user_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getRoleId() {
        return role_id;
    }

    public void setRoleId(int role_id) {
        this.role_id = role_id;
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

    public Date getLastActivityAt() {
        return last_activity_at;
    }

    public void setLastActivityAt(Date last_activity_at) {
        this.last_activity_at = last_activity_at;
    }

    public Date getLastAttendedAt() {
        return last_attended_at;
    }

    public void setLastAttendedAt(Date last_attended_at) {
        this.last_attended_at = last_attended_at;
    }

    public int getTotalActivityTime() {
        return total_activity_time;
    }

    public void setTotalActivityTime(int total_activity_time) {
        this.total_activity_time = total_activity_time;
    }

    public String getHtmlUrl() {
        return html_url;
    }

    public void setHtmlUrl(String html_url) {
        this.html_url = html_url;
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOverrideGrade() {
        return override_grade;
    }

    public void setOverrideGrade(String override_grade) {
        this.override_grade = override_grade;
    }

    public double getOverrideScore() {
        return override_score;
    }

    public void setOverrideScore(double override_score) {
        this.override_score = override_score;
    }

    public String getUnpostedCurrentGrade() {
        return unposted_current_grade;
    }

    public void setUnpostedCurrentGrade(String unposted_current_grade) {
        this.unposted_current_grade = unposted_current_grade;
    }

    public String getUnpostedFinalGrade() {
        return unposted_final_grade;
    }

    public void setUnpostedFinalGrade(String unposted_final_grade) {
        this.unposted_final_grade = unposted_final_grade;
    }

    public String getUnpostedCurrentScore() {
        return unposted_current_score;
    }

    public void setUnpostedCurrentScore(String unposted_current_score) {
        this.unposted_current_score = unposted_current_score;
    }

    public String getUnpostedFinalScore() {
        return unposted_final_score;
    }

    public void setUnpostedFinalScore(String unposted_final_score) {
        this.unposted_final_score = unposted_final_score;
    }

    public boolean isHasGradingPeriods() {
        return has_grading_periods;
    }

    public void setHasGradingPeriods(boolean has_grading_periods) {
        this.has_grading_periods = has_grading_periods;
    }

    public boolean isTotalsForAllGradingPeriodsOption() {
        return totals_for_all_grading_periods_option;
    }

    public void setTotalsForAllGradingPeriodsOption(boolean totals_for_all_grading_periods_option) {
        this.totals_for_all_grading_periods_option = totals_for_all_grading_periods_option;
    }

    public String getCurrentGradingPeriodTitle() {
        return current_grading_period_title;
    }

    public void setCurrentGradingPeriodTitle(String current_grading_period_title) {
        this.current_grading_period_title = current_grading_period_title;
    }

    public int getCurrentGradingPeriodId() {
        return current_grading_period_id;
    }

    public void setCurrentGradingPeriodId(int current_grading_period_id) {
        this.current_grading_period_id = current_grading_period_id;
    }

    public String getCurrentPeriodOverrideGrade() {
        return current_period_override_grade;
    }

    public void setCurrentPeriodOverrideGrade(String current_period_override_grade) {
        this.current_period_override_grade = current_period_override_grade;
    }

    public double getCurrentPeriodOverrideScore() {
        return current_period_override_score;
    }

    public void setCurrentPeriodOverrideScore(double current_period_override_score) {
        this.current_period_override_score = current_period_override_score;
    }

    public double getCurrentPeriodUnpostedCurrentScore() {
        return current_period_unposted_current_score;
    }

    public void setCurrentPeriodUnpostedCurrentScore(double current_period_unposted_current_score) {
        this.current_period_unposted_current_score = current_period_unposted_current_score;
    }

    public double getCurrentPeriodUnpostedFinalScore() {
        return current_period_unposted_final_score;
    }

    public void setCurrentPeriodUnpostedFinalScore(double current_period_unposted_final_score) {
        this.current_period_unposted_final_score = current_period_unposted_final_score;
    }

    public String getCurrentPeriodUnpostedCurrentGrade() {
        return current_period_unposted_current_grade;
    }

    public void setCurrentPeriodUnpostedCurrentGrade(String current_period_unposted_current_grade) {
        this.current_period_unposted_current_grade = current_period_unposted_current_grade;
    }

    public String getCurrentPeriodUnpostedFinalGrade() {
        return current_period_unposted_final_grade;
    }

    public void setCurrentPeriodUnpostedFinalGrade(String current_period_unposted_final_grade) {
        this.current_period_unposted_final_grade = current_period_unposted_final_grade;
    }
}
