package org.atom.linx.data;

import java.util.Date;

class LockInfo {
    protected String asset_string;
    protected Date unlock_at;
    protected Date lock_at;
    protected String context_module;
    protected boolean manually_locked;

    public String getAssetString() {
        return asset_string;
    }

    public void setAssetString(String asset_string) {
        this.asset_string = asset_string;
    }

    public Date getUnlockAt() {
        return unlock_at;
    }

    public void setUnlockAt(Date unlock_at) {
        this.unlock_at = unlock_at;
    }

    public Date getLockAt() {
        return lock_at;
    }

    public void setLockAt(Date lock_at) {
        this.lock_at = lock_at;
    }

    public String getContextModule() {
        return context_module;
    }

    public void setContextModule(String context_module) {
        this.context_module = context_module;
    }

    public boolean isManuallyLocked() {
        return manually_locked;
    }

    public void setManuallyLocked(boolean manually_locked) {
        this.manually_locked = manually_locked;
    }
}

class ExternalToolTagAttributes {
    protected String url;
    protected boolean new_tab;
    protected String resource_link_id;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isNewTab() {
        return new_tab;
    }

    public void setNewTab(boolean new_tab) {
        this.new_tab = new_tab;
    }

    public String getResourceLinkId() {
        return resource_link_id;
    }

    public void setResourceLinkId(String resource_link_id) {
        this.resource_link_id = resource_link_id;
    }
}

class ScoreStatistic {
    protected int max;
    protected int mean;
    protected int min;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMean() {
        return mean;
    }

    public void setMean(int mean) {
        this.mean = mean;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}

class TurnitinSettings {
    protected String originality_report_visibility;
    protected boolean s_paper_check;
    protected boolean internet_check;
    protected boolean journal_check;
    protected boolean exclude_biblio;
    protected boolean exclude_quoted;
    protected String exclude_small_matches_type;
    protected int exclude_small_matches_value;

    public String getOriginalityReportVisibility() {
        return originality_report_visibility;
    }

    public void setOriginalityReportVisibility(String originality_report_visibility) {
        this.originality_report_visibility = originality_report_visibility;
    }

    public boolean isSPaperCheck() {
        return s_paper_check;
    }

    public void setSPaperCheck(boolean s_paper_check) {
        this.s_paper_check = s_paper_check;
    }

    public boolean isInternetCheck() {
        return internet_check;
    }

    public void setInternetCheck(boolean internet_check) {
        this.internet_check = internet_check;
    }

    public boolean isJournalCheck() {
        return journal_check;
    }

    public void setJournalCheck(boolean journal_check) {
        this.journal_check = journal_check;
    }

    public boolean isExcludeBiblio() {
        return exclude_biblio;
    }

    public void setExcludeBiblio(boolean exclude_biblio) {
        this.exclude_biblio = exclude_biblio;
    }

    public boolean isExcludeQuoted() {
        return exclude_quoted;
    }

    public void setExcludeQuoted(boolean exclude_quoted) {
        this.exclude_quoted = exclude_quoted;
    }

    public String getExcludeSmallMatchesType() {
        return exclude_small_matches_type;
    }

    public void setExcludeSmallMatchesType(String exclude_small_matches_type) {
        this.exclude_small_matches_type = exclude_small_matches_type;
    }

    public int getExcludeSmallMatchesValue() {
        return exclude_small_matches_value;
    }

    public void setExcludeSmallMatchesValue(int exclude_small_matches_value) {
        this.exclude_small_matches_value = exclude_small_matches_value;
    }
}

class NeedsGradingCountBySection{
    protected String section_id;
    protected int needs_grading_count;

    public String getSectionId() {
        return section_id;
    }

    public void setSectionId(String section_id) {
        this.section_id = section_id;
    }

    public int getNeedsGradingCount() {
        return needs_grading_count;
    }

    public void setNeedsGradingCount(int needs_grading_count) {
        this.needs_grading_count = needs_grading_count;
    }
}

public class Assignment {
    protected int id;
    protected String name;
    protected String description;
    protected Date created_at;
    protected Date updated_at;
    protected Date due_at;
    protected Date lock_at;
    protected Date unlock_at;
    protected boolean has_overrides;
    protected Object all_dates;
    protected int course_id;
    protected String html_url;
    protected String submissions_download_url;
    protected int assignment_group_id;
    protected boolean due_date_required;
    protected String[] allowed_extensions;
    protected int max_name_length;
    protected boolean turnitin_enabled;
    protected boolean vericite_enabled;
    protected TurnitinSettings turnitin_settings;
    protected boolean grade_group_students_individually;
    protected ExternalToolTagAttributes external_tool_tag_attributes;
    protected boolean peer_reviews;
    protected boolean automatic_peer_reviews;
    protected int peer_review_count;
    protected Date peer_reviews_assign_at;
    protected boolean intra_group_peer_reviews;
    protected int group_category_id;
    protected int needs_grading_count;
    protected NeedsGradingCountBySection[] needs_grading_count_by_section;
    protected int position;
    protected boolean post_to_sis;
    protected String integration_id;
    protected Object integration_data;
    protected double points_possible;
    protected String[] submission_types;
    protected boolean has_submitted_submissions;
    protected String grading_type;
    protected Object grading_standard_id;
    protected boolean published;
    protected boolean unpublishable;
    protected boolean only_visible_to_overrides;
    protected boolean locked_for_user;
    protected LockInfo lock_info;
    protected String lock_explanation;
    protected int quiz_id;
    protected boolean anonymous_submissions;
    protected DiscussionTopic discussion_topic;
    protected boolean freeze_on_copy;
    protected boolean frozen;
    protected String[] frozen_attributes;
    protected Object submission; //TODO submission object
    protected boolean use_rubric_for_grading;
    protected String rubric_settings;
    protected Object rubric; //TODO rubric object
    protected int[] assignment_visibility;
    protected AssignmentOverride[] overrides;
    protected boolean omit_from_final_grade;
    protected boolean moderated_grading;
    protected int grader_count;
    protected int final_grader_id;
    protected boolean grader_comments_visible_to_graders;
    protected boolean graders_anonymous_to_graders;
    protected boolean grader_names_visible_to_final_grader;
    protected boolean anonymous_grading;
    protected int allowed_attempts;
    protected boolean post_manually;
    protected ScoreStatistic score_statistics;
    protected boolean can_submit;

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

    public Date getDueAt() {
        return due_at;
    }

    public void setDueAt(Date due_at) {
        this.due_at = due_at;
    }

    public Date getLockAt() {
        return lock_at;
    }

    public void setLockAt(Date lock_at) {
        this.lock_at = lock_at;
    }

    public Date getUnlockAt() {
        return unlock_at;
    }

    public void setUnlockAt(Date unlock_at) {
        this.unlock_at = unlock_at;
    }

    public boolean isHasOverrides() {
        return has_overrides;
    }

    public void setHasOverrides(boolean has_overrides) {
        this.has_overrides = has_overrides;
    }

    public Object getAllDates() {
        return all_dates;
    }

    public void setAllDates(Object all_dates) {
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

    public TurnitinSettings getTurnitinSettings() {
        return turnitin_settings;
    }

    public void setTurnitinSettings(TurnitinSettings turnitin_settings) {
        this.turnitin_settings = turnitin_settings;
    }

    public boolean isGradeGroupStudentsIndividually() {
        return grade_group_students_individually;
    }

    public void setGradeGroupStudentsIndividually(boolean grade_group_students_individually) {
        this.grade_group_students_individually = grade_group_students_individually;
    }

    public ExternalToolTagAttributes getExternalToolTagAttributes() {
        return external_tool_tag_attributes;
    }

    public void setExternalToolTagAttributes(ExternalToolTagAttributes external_tool_tag_attributes) {
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

    public Date getPeerReviewsAssignAt() {
        return peer_reviews_assign_at;
    }

    public void setPeerReviewsAssignAt(Date peer_reviews_assign_at) {
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

    public NeedsGradingCountBySection[] getNeedsGradingCountBySection() {
        return needs_grading_count_by_section;
    }

    public void setNeedsGradingCountBySection(NeedsGradingCountBySection[] needs_grading_count_by_section) {
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

    public Object getIntegrationData() {
        return integration_data;
    }

    public void setIntegrationData(Object integration_data) {
        this.integration_data = integration_data;
    }

    public double getPointsPossible() {
        return points_possible;
    }

    public void setPointsPossible(double points_possible) {
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

    public Object getGradingStandardId() {
        return grading_standard_id;
    }

    public void setGradingStandardId(Object grading_standard_id) {
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

    public LockInfo getLockInfo() {
        return lock_info;
    }

    public void setLockInfo(LockInfo lock_info) {
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

    public DiscussionTopic getDiscussionTopic() {
        return discussion_topic;
    }

    public void setDiscussionTopic(DiscussionTopic discussion_topic) {
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

    public Object getSubmission() {
        return submission;
    }

    public void setSubmission(Object submission) {
        this.submission = submission;
    }

    public boolean isUseRubricForGrading() {
        return use_rubric_for_grading;
    }

    public void setUseRubricForGrading(boolean use_rubric_for_grading) {
        this.use_rubric_for_grading = use_rubric_for_grading;
    }

    public String getRubricSettings() {
        return rubric_settings;
    }

    public void setRubricSettings(String rubric_settings) {
        this.rubric_settings = rubric_settings;
    }

    public Object getRubric() {
        return rubric;
    }

    public void setRubric(Object rubric) {
        this.rubric = rubric;
    }

    public int[] getAssignmentVisibility() {
        return assignment_visibility;
    }

    public void setAssignmentVisibility(int[] assignment_visibility) {
        this.assignment_visibility = assignment_visibility;
    }

    public AssignmentOverride[] getOverrides() {
        return overrides;
    }

    public void setOverrides(AssignmentOverride[] overrides) {
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

    public ScoreStatistic getScoreStatistics() {
        return score_statistics;
    }

    public void setScoreStatistics(ScoreStatistic score_statistics) {
        this.score_statistics = score_statistics;
    }

    public boolean isCanSubmit() {
        return can_submit;
    }

    public void setCanSubmit(boolean can_submit) {
        this.can_submit = can_submit;
    }
}
