package org.atom.linx.data;

import java.util.List;

class Needs_grading_count_by_section {
    private String section_id;
    private int needs_grading_count;

    public void setSectionId(String section_id){
        this.section_id = section_id;
    }

    public String getSectionId(){
        return this.section_id;
    }

    public void setNeedsGradingCount(int needs_grading_count){
        this.needs_grading_count = needs_grading_count;
    }

    public int getNeedsGradingCount(){
        return this.needs_grading_count;
    }
}

public class Assignment {
    private boolean content;
    private boolean points;
    private int id;
    private String name;
    private String description;
    private String created_at;
    private String updated_at;
    private String due_at;
    private String lock_at;
    private String unlock_at;
    private boolean has_overrides;
    private String all_dates;
    private int course_id;
    private String html_url;
    private String submissions_download_url;
    private int assignment_group_id;
    private boolean due_date_required;
    private String[] allowed_extensions;
    private int max_name_length;
    private boolean turnitin_enabled;
    private boolean vericite_enabled;
    private String turnitin_settings;
    private boolean grade_group_students_individually;
    private String external_tool_tag_attributes;
    private boolean peer_reviews;
    private boolean automatic_peer_reviews;
    private int peer_review_count;
    private String peer_reviews_assign_at;
    private boolean intra_group_peer_reviews;
    private int group_category_id;
    private int needs_grading_count;
    private Needs_grading_count_by_section[] needs_grading_count_by_section;
    private int position;
    private boolean post_to_sis;
    private String integration_id;
    private int points_possible;
    private String[] submission_types;
    private boolean has_submitted_submissions;
    private String grading_type;
    private String grading_standard_id;
    private boolean published;
    private boolean unpublishable;
    private boolean only_visible_to_overrides;
    private boolean locked_for_user;
    private String lock_info;
    private String lock_explanation;
    private int quiz_id;
    private boolean anonymous_submissions;
    private String discussion_topic;
    private boolean freeze_on_copy;
    private boolean frozen;
    private String[] frozen_attributes;
    private String submission;
    private boolean use_rubric_for_grading;
    private String rubric;
    private int[] assignment_visibility;
    private String overrides;
    private boolean omit_from_final_grade;
    private boolean moderated_grading;
    private int grader_count;
    private int final_grader_id;
    private boolean grader_comments_visible_to_graders;
    private boolean graders_anonymous_to_graders;
    private boolean grader_names_visible_to_final_grader;
    private boolean anonymous_grading;
    private int allowed_attempts;
    private boolean post_manually;
    private String score_statistics;
    private boolean can_submit;

    public boolean isContent() {
        return content;
    }

    public void setContent(boolean content) {
        this.content = content;
    }

    public boolean isPoints() {
        return points;
    }

    public void setPoints(boolean points) {
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdatedAt() {
        return updated_at;
    }

    public void setUpdatedAt(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getDueAt() {
        return due_at;
    }

    public void setDueAt(String due_at) {
        this.due_at = due_at;
    }

    public String getLockAt() {
        return lock_at;
    }

    public void setLockAt(String lock_at) {
        this.lock_at = lock_at;
    }

    public String getUnlockAt() {
        return unlock_at;
    }

    public void setUnlockAt(String unlock_at) {
        this.unlock_at = unlock_at;
    }

    public boolean isHasOverrides() {
        return has_overrides;
    }

    public void setHasOverrides(boolean has_overrides) {
        this.has_overrides = has_overrides;
    }

    public String getAllDates() {
        return all_dates;
    }

    public void setAllDates(String all_dates) {
        this.all_dates = all_dates;
    }

    public int getCourseId() {
        return course_id;
    }

    public void setCourseId(int course_id) {
        this.course_id = course_id;
    }

    public String getHtmlUrl() {
        return html_url;
    }

    public void setHtmlUrl(String html_url) {
        this.html_url = html_url;
    }

    public String getSubmissionsDownloadUrl() {
        return submissions_download_url;
    }

    public void setSubmissionsDownloadUrl(String submissions_download_url) {
        this.submissions_download_url = submissions_download_url;
    }

    public int getAssignmentGroupId() {
        return assignment_group_id;
    }

    public void setAssignmentGroupId(int assignment_group_id) {
        this.assignment_group_id = assignment_group_id;
    }

    public boolean isDueDateRequired() {
        return due_date_required;
    }

    public void setDueDateRequired(boolean due_date_required) {
        this.due_date_required = due_date_required;
    }

    public String[] getAllowedExtensions() {
        return allowed_extensions;
    }

    public void setAllowedExtensions(String[] allowed_extensions) {
        this.allowed_extensions = allowed_extensions;
    }

    public int getMaxNameLength() {
        return max_name_length;
    }

    public void setMaxNameLength(int max_name_length) {
        this.max_name_length = max_name_length;
    }

    public boolean isTurnitinEnabled() {
        return turnitin_enabled;
    }

    public void setTurnitinEnabled(boolean turnitin_enabled) {
        this.turnitin_enabled = turnitin_enabled;
    }

    public boolean isVericiteEnabled() {
        return vericite_enabled;
    }

    public void setVericiteEnabled(boolean vericite_enabled) {
        this.vericite_enabled = vericite_enabled;
    }

    public String getTurnitinSettings() {
        return turnitin_settings;
    }

    public void setTurnitinSettings(String turnitin_settings) {
        this.turnitin_settings = turnitin_settings;
    }

    public boolean isGradeGroupStudentsIndividually() {
        return grade_group_students_individually;
    }

    public void setGradeGroupStudentsIndividually(boolean grade_group_students_individually) {
        this.grade_group_students_individually = grade_group_students_individually;
    }

    public String getExternalToolTagAttributes() {
        return external_tool_tag_attributes;
    }

    public void setExternalToolTagAttributes(String external_tool_tag_attributes) {
        this.external_tool_tag_attributes = external_tool_tag_attributes;
    }

    public boolean isPeerReviews() {
        return peer_reviews;
    }

    public void setPeerReviews(boolean peer_reviews) {
        this.peer_reviews = peer_reviews;
    }

    public boolean isAutomaticPeerReviews() {
        return automatic_peer_reviews;
    }

    public void setAutomaticPeerReviews(boolean automatic_peer_reviews) {
        this.automatic_peer_reviews = automatic_peer_reviews;
    }

    public int getPeerReviewCount() {
        return peer_review_count;
    }

    public void setPeerReviewCount(int peer_review_count) {
        this.peer_review_count = peer_review_count;
    }

    public String getPeerReviewsAssignAt() {
        return peer_reviews_assign_at;
    }

    public void setPeerReviewsAssignAt(String peer_reviews_assign_at) {
        this.peer_reviews_assign_at = peer_reviews_assign_at;
    }

    public boolean isIntraGroupPeerReviews() {
        return intra_group_peer_reviews;
    }

    public void setIntraGroupPeerReviews(boolean intra_group_peer_reviews) {
        this.intra_group_peer_reviews = intra_group_peer_reviews;
    }

    public int getGroupCategoryId() {
        return group_category_id;
    }

    public void setGroupCategoryId(int group_category_id) {
        this.group_category_id = group_category_id;
    }

    public int getNeedsGradingCount() {
        return needs_grading_count;
    }

    public void setNeedsGradingCount(int needs_grading_count) {
        this.needs_grading_count = needs_grading_count;
    }

    public Needs_grading_count_by_section[] getNeedsGradingCountBySection() {
        return needs_grading_count_by_section;
    }

    public void setNeedsGradingCountBySection(Needs_grading_count_by_section[] needs_grading_count_by_section) {
        this.needs_grading_count_by_section = needs_grading_count_by_section;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isPostToSis() {
        return post_to_sis;
    }

    public void setPostToSis(boolean post_to_sis) {
        this.post_to_sis = post_to_sis;
    }

    public String getIntegrationId() {
        return integration_id;
    }

    public void setIntegrationId(String integration_id) {
        this.integration_id = integration_id;
    }

    public int getPointsPossible() {
        return points_possible;
    }

    public void setPointsPossible(int points_possible) {
        this.points_possible = points_possible;
    }

    public String[] getSubmissionTypes() {
        return submission_types;
    }

    public void setSubmissionTypes(String[] submission_types) {
        this.submission_types = submission_types;
    }

    public boolean isHasSubmittedSubmissions() {
        return has_submitted_submissions;
    }

    public void setHasSubmittedSubmissions(boolean has_submitted_submissions) {
        this.has_submitted_submissions = has_submitted_submissions;
    }

    public String getGradingType() {
        return grading_type;
    }

    public void setGradingType(String grading_type) {
        this.grading_type = grading_type;
    }

    public String getGradingStandardId() {
        return grading_standard_id;
    }

    public void setGradingStandardId(String grading_standard_id) {
        this.grading_standard_id = grading_standard_id;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public boolean isUnpublishable() {
        return unpublishable;
    }

    public void setUnpublishable(boolean unpublishable) {
        this.unpublishable = unpublishable;
    }

    public boolean isOnlyVisibleToOverrides() {
        return only_visible_to_overrides;
    }

    public void setOnlyVisibleToOverrides(boolean only_visible_to_overrides) {
        this.only_visible_to_overrides = only_visible_to_overrides;
    }

    public boolean isLockedForUser() {
        return locked_for_user;
    }

    public void setLockedForUser(boolean locked_for_user) {
        this.locked_for_user = locked_for_user;
    }

    public String getLockInfo() {
        return lock_info;
    }

    public void setLockInfo(String lock_info) {
        this.lock_info = lock_info;
    }

    public String getLockExplanation() {
        return lock_explanation;
    }

    public void setLockExplanation(String lock_explanation) {
        this.lock_explanation = lock_explanation;
    }

    public int getQuizId() {
        return quiz_id;
    }

    public void setQuizId(int quiz_id) {
        this.quiz_id = quiz_id;
    }

    public boolean isAnonymousSubmissions() {
        return anonymous_submissions;
    }

    public void setAnonymousSubmissions(boolean anonymous_submissions) {
        this.anonymous_submissions = anonymous_submissions;
    }

    public String getDiscussionTopic() {
        return discussion_topic;
    }

    public void setDiscussionTopic(String discussion_topic) {
        this.discussion_topic = discussion_topic;
    }

    public boolean isFreezeOnCopy() {
        return freeze_on_copy;
    }

    public void setFreezeOnCopy(boolean freeze_on_copy) {
        this.freeze_on_copy = freeze_on_copy;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public String[] getFrozenAttributes() {
        return frozen_attributes;
    }

    public void setFrozenAttributes(String[] frozen_attributes) {
        this.frozen_attributes = frozen_attributes;
    }

    public String getSubmission() {
        return submission;
    }

    public void setSubmission(String submission) {
        this.submission = submission;
    }

    public boolean isUseRubricForGrading() {
        return use_rubric_for_grading;
    }

    public void setUseRubricForGrading(boolean use_rubric_for_grading) {
        this.use_rubric_for_grading = use_rubric_for_grading;
    }

    public String getRubric() {
        return rubric;
    }

    public void setRubric(String rubric) {
        this.rubric = rubric;
    }

    public int[] getAssignmentVisibility() {
        return assignment_visibility;
    }

    public void setAssignmentVisibility(int[] assignment_visibility) {
        this.assignment_visibility = assignment_visibility;
    }

    public String getOverrides() {
        return overrides;
    }

    public void setOverrides(String overrides) {
        this.overrides = overrides;
    }

    public boolean isOmitFromFinalGrade() {
        return omit_from_final_grade;
    }

    public void setOmitFromFinalGrade(boolean omit_from_final_grade) {
        this.omit_from_final_grade = omit_from_final_grade;
    }

    public boolean isModeratedGrading() {
        return moderated_grading;
    }

    public void setModeratedGrading(boolean moderated_grading) {
        this.moderated_grading = moderated_grading;
    }

    public int getGraderCount() {
        return grader_count;
    }

    public void setGraderCount(int grader_count) {
        this.grader_count = grader_count;
    }

    public int getFinalGraderId() {
        return final_grader_id;
    }

    public void setFinalGraderId(int final_grader_id) {
        this.final_grader_id = final_grader_id;
    }

    public boolean isGraderCommentsVisibleToGraders() {
        return grader_comments_visible_to_graders;
    }

    public void setGraderCommentsVisibleToGraders(boolean grader_comments_visible_to_graders) {
        this.grader_comments_visible_to_graders = grader_comments_visible_to_graders;
    }

    public boolean isGradersAnonymousToGraders() {
        return graders_anonymous_to_graders;
    }

    public void setGradersAnonymousToGraders(boolean graders_anonymous_to_graders) {
        this.graders_anonymous_to_graders = graders_anonymous_to_graders;
    }

    public boolean isGraderNamesVisibleToFinalGrader() {
        return grader_names_visible_to_final_grader;
    }

    public void setGraderNamesVisibleToFinalGrader(boolean grader_names_visible_to_final_grader) {
        this.grader_names_visible_to_final_grader = grader_names_visible_to_final_grader;
    }

    public boolean isAnonymousGrading() {
        return anonymous_grading;
    }

    public void setAnonymousGrading(boolean anonymous_grading) {
        this.anonymous_grading = anonymous_grading;
    }

    public int getAllowedAttempts() {
        return allowed_attempts;
    }

    public void setAllowedAttempts(int allowed_attempts) {
        this.allowed_attempts = allowed_attempts;
    }

    public boolean isPostManually() {
        return post_manually;
    }

    public void setPostManually(boolean post_manually) {
        this.post_manually = post_manually;
    }

    public String getScoreStatistics() {
        return score_statistics;
    }

    public void setScoreStatistics(String score_statistics) {
        this.score_statistics = score_statistics;
    }

    public boolean isCanSubmit() {
        return can_submit;
    }

    public void setCanSubmit(boolean can_submit) {
        this.can_submit = can_submit;
    }
}
