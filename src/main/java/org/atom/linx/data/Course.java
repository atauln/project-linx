package org.atom.linx.data;
import java.util.Date;

class WikiPage{
    private boolean content;
    public boolean isContent() {
        return content;
    }

    public void setContent(boolean content) {
        this.content = content;
    }
}

class BlueprintRestrictionsByObjectType{
    private Assignment assignment;
    private WikiPage wiki_page;
    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public WikiPage getWikiPage() {
        return wiki_page;
    }

    public void setWikiPage(WikiPage wiki_page) {
        this.wiki_page = wiki_page;
    }
}

public class Course{
    private int id;
    private Object sis_course_id;
    private String uuid;
    private Object integration_id;
    private int sis_import_id;
    private String name;
    private String course_code;
    private String workflow_state;
    private int account_id;
    private int root_account_id;
    private int enrollment_term_id;
    private Object grading_periods;
    private int grading_standard_id;
    private String grade_passback_setting;
    private Date created_at;
    private Date start_at;
    private Date end_at;
    private String locale;
    private Object enrollments;
    private int total_students;
    private Object calendar;
    private String default_view;
    private String syllabus_body;
    private int needs_grading_count;
    private Object term;
    private Object course_progress;
    private boolean apply_assignment_group_weights;
    private Permissions permissions;
    private boolean is_public;
    private boolean is_public_to_auth_users;
    private boolean public_syllabus;
    private boolean public_syllabus_to_auth;
    private String public_description;
    private int storage_quota_mb;
    private int storage_quota_used_mb;
    private boolean hide_final_grades;
    private String license;
    private boolean allow_student_assignment_edits;
    private boolean allow_wiki_comments;
    private boolean allow_student_forum_attachments;
    private boolean open_enrollment;
    private boolean self_enrollment;
    private boolean restrict_enrollments_to_course_dates;
    private String course_format;
    private boolean access_restricted_by_date;
    private String time_zone;
    private boolean blueprint;
    private BlueprintRestriction[] blueprint_restrictions;
    private BlueprintRestrictionsByObjectType blueprint_restrictions_by_object_type;
    private boolean template;

    public String toString() {
        String s = "";
        s += "Name: " + this.getName();
        s += "\nID: " + this.getId();
        s += "\nUUID: " + this.getUuid();
        return s;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getSisCourseId() {
        return sis_course_id;
    }

    public void setSisCourseId(Object sis_course_id) {
        this.sis_course_id = sis_course_id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Object getIntegrationId() {
        return integration_id;
    }

    public void setIntegrationId(Object integration_id) {
        this.integration_id = integration_id;
    }

    public int getSisImportId() {
        return sis_import_id;
    }

    public void setSisImportId(int sis_import_id) {
        this.sis_import_id = sis_import_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseCode() {
        return course_code;
    }

    public void setCourseCode(String course_code) {
        this.course_code = course_code;
    }

    public String getWorkflowState() {
        return workflow_state;
    }

    public void setWorkflowState(String workflow_state) {
        this.workflow_state = workflow_state;
    }

    public int getAccountId() {
        return account_id;
    }

    public void setAccountId(int account_id) {
        this.account_id = account_id;
    }

    public int getRootAccountId() {
        return root_account_id;
    }

    public void setRootAccountId(int root_account_id) {
        this.root_account_id = root_account_id;
    }

    public int getEnrollmentTermId() {
        return enrollment_term_id;
    }

    public void setEnrollmentTermId(int enrollment_term_id) {
        this.enrollment_term_id = enrollment_term_id;
    }

    public Object getGradingPeriods() {
        return grading_periods;
    }

    public void setGradingPeriods(Object grading_periods) {
        this.grading_periods = grading_periods;
    }

    public int getGradingStandardId() {
        return grading_standard_id;
    }

    public void setGradingStandardId(int grading_standard_id) {
        this.grading_standard_id = grading_standard_id;
    }

    public String getGradePassbackSetting() {
        return grade_passback_setting;
    }

    public void setGradePassbackSetting(String grade_passback_setting) {
        this.grade_passback_setting = grade_passback_setting;
    }

    public Date getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(Date created_at) {
        this.created_at = created_at;
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

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Object getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(Object enrollments) {
        this.enrollments = enrollments;
    }

    public int getTotalStudents() {
        return total_students;
    }

    public void setTotalStudents(int total_students) {
        this.total_students = total_students;
    }

    public Object getCalendar() {
        return calendar;
    }

    public void setCalendar(Object calendar) {
        this.calendar = calendar;
    }

    public String getDefaultView() {
        return default_view;
    }

    public void setDefaultView(String default_view) {
        this.default_view = default_view;
    }

    public String getSyllabusBody() {
        return syllabus_body;
    }

    public void setSyllabusBody(String syllabus_body) {
        this.syllabus_body = syllabus_body;
    }

    public int getNeedsGradingCount() {
        return needs_grading_count;
    }

    public void setNeedsGradingCount(int needs_grading_count) {
        this.needs_grading_count = needs_grading_count;
    }

    public Object getTerm() {
        return term;
    }

    public void setTerm(Object term) {
        this.term = term;
    }

    public Object getCourseProgress() {
        return course_progress;
    }

    public void setCourseProgress(Object course_progress) {
        this.course_progress = course_progress;
    }

    public boolean isApplyAssignmentGroupWeights() {
        return apply_assignment_group_weights;
    }

    public void setApplyAssignmentGroupWeights(boolean apply_assignment_group_weights) {
        this.apply_assignment_group_weights = apply_assignment_group_weights;
    }

    public Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    public boolean isIsPublic() {
        return is_public;
    }

    public void setIsPublic(boolean is_public) {
        this.is_public = is_public;
    }

    public boolean isIsPublicToAuthUsers() {
        return is_public_to_auth_users;
    }

    public void setIsPublicToAuthUsers(boolean is_public_to_auth_users) {
        this.is_public_to_auth_users = is_public_to_auth_users;
    }

    public boolean isPublicSyllabus() {
        return public_syllabus;
    }

    public void setPublicSyllabus(boolean public_syllabus) {
        this.public_syllabus = public_syllabus;
    }

    public boolean isPublicSyllabusToAuth() {
        return public_syllabus_to_auth;
    }

    public void setPublicSyllabusToAuth(boolean public_syllabus_to_auth) {
        this.public_syllabus_to_auth = public_syllabus_to_auth;
    }

    public String getPublicDescription() {
        return public_description;
    }

    public void setPublicDescription(String public_description) {
        this.public_description = public_description;
    }

    public int getStorageQuotaMb() {
        return storage_quota_mb;
    }

    public void setStorageQuotaMb(int storage_quota_mb) {
        this.storage_quota_mb = storage_quota_mb;
    }

    public int getStorageQuotaUsedMb() {
        return storage_quota_used_mb;
    }

    public void setStorageQuotaUsedMb(int storage_quota_used_mb) {
        this.storage_quota_used_mb = storage_quota_used_mb;
    }

    public boolean isHideFinalGrades() {
        return hide_final_grades;
    }

    public void setHideFinalGrades(boolean hide_final_grades) {
        this.hide_final_grades = hide_final_grades;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public boolean isAllowStudentAssignmentEdits() {
        return allow_student_assignment_edits;
    }

    public void setAllowStudentAssignmentEdits(boolean allow_student_assignment_edits) {
        this.allow_student_assignment_edits = allow_student_assignment_edits;
    }

    public boolean isAllowWikiComments() {
        return allow_wiki_comments;
    }

    public void setAllowWikiComments(boolean allow_wiki_comments) {
        this.allow_wiki_comments = allow_wiki_comments;
    }

    public boolean isAllowStudentForumAttachments() {
        return allow_student_forum_attachments;
    }

    public void setAllowStudentForumAttachments(boolean allow_student_forum_attachments) {
        this.allow_student_forum_attachments = allow_student_forum_attachments;
    }

    public boolean isOpenEnrollment() {
        return open_enrollment;
    }

    public void setOpenEnrollment(boolean open_enrollment) {
        this.open_enrollment = open_enrollment;
    }

    public boolean isSelfEnrollment() {
        return self_enrollment;
    }

    public void setSelfEnrollment(boolean self_enrollment) {
        this.self_enrollment = self_enrollment;
    }

    public boolean isRestrictEnrollmentsToCourseDates() {
        return restrict_enrollments_to_course_dates;
    }

    public void setRestrictEnrollmentsToCourseDates(boolean restrict_enrollments_to_course_dates) {
        this.restrict_enrollments_to_course_dates = restrict_enrollments_to_course_dates;
    }

    public String getCourseFormat() {
        return course_format;
    }

    public void setCourseFormat(String course_format) {
        this.course_format = course_format;
    }

    public boolean isAccessRestrictedByDate() {
        return access_restricted_by_date;
    }

    public void setAccessRestrictedByDate(boolean access_restricted_by_date) {
        this.access_restricted_by_date = access_restricted_by_date;
    }

    public String getTimeZone() {
        return time_zone;
    }

    public void setTimeZone(String time_zone) {
        this.time_zone = time_zone;
    }

    public boolean isBlueprint() {
        return blueprint;
    }

    public void setBlueprint(boolean blueprint) {
        this.blueprint = blueprint;
    }

    public BlueprintRestriction[] getBlueprintRestrictions() {
        return blueprint_restrictions;
    }

    public void setBlueprintRestrictions(BlueprintRestriction[] blueprint_restrictions) {
        this.blueprint_restrictions = blueprint_restrictions;
    }

    public BlueprintRestrictionsByObjectType getBlueprintRestrictionsByObjectType() {
        return blueprint_restrictions_by_object_type;
    }

    public void setBlueprintRestrictionsByObjectType(BlueprintRestrictionsByObjectType blueprint_restrictions_by_object_type) {
        this.blueprint_restrictions_by_object_type = blueprint_restrictions_by_object_type;
    }

    public boolean isTemplate() {
        return template;
    }

    public void setTemplate(boolean template) {
        this.template = template;
    }
}