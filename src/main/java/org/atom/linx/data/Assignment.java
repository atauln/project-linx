package org.atom.linx.data;

import java.util.List;

class Needs_grading_count_by_section {
    private String section_id;
    private int needs_grading_count;

    public void setSection_id(String section_id){
        this.section_id = section_id;
    }

    public String getSection_id(){
        return this.section_id;
    }

    public void setNeeds_grading_count(int needs_grading_count){
        this.needs_grading_count = needs_grading_count;
    }

    public int getNeeds_grading_count(){
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

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getDue_at() {
        return due_at;
    }

    public void setDue_at(String due_at) {
        this.due_at = due_at;
    }

    public String getLock_at() {
        return lock_at;
    }

    public void setLock_at(String lock_at) {
        this.lock_at = lock_at;
    }

    public String getUnlock_at() {
        return unlock_at;
    }

    public void setUnlock_at(String unlock_at) {
        this.unlock_at = unlock_at;
    }

    public boolean isHas_overrides() {
        return has_overrides;
    }

    public void setHas_overrides(boolean has_overrides) {
        this.has_overrides = has_overrides;
    }

    public String getAll_dates() {
        return all_dates;
    }

    public void setAll_dates(String all_dates) {
        this.all_dates = all_dates;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getSubmissions_download_url() {
        return submissions_download_url;
    }

    public void setSubmissions_download_url(String submissions_download_url) {
        this.submissions_download_url = submissions_download_url;
    }

    public int getAssignment_group_id() {
        return assignment_group_id;
    }

    public void setAssignment_group_id(int assignment_group_id) {
        this.assignment_group_id = assignment_group_id;
    }

    public boolean isDue_date_required() {
        return due_date_required;
    }

    public void setDue_date_required(boolean due_date_required) {
        this.due_date_required = due_date_required;
    }

    public String[] getAllowed_extensions() {
        return allowed_extensions;
    }

    public void setAllowed_extensions(String[] allowed_extensions) {
        this.allowed_extensions = allowed_extensions;
    }

    public int getMax_name_length() {
        return max_name_length;
    }

    public void setMax_name_length(int max_name_length) {
        this.max_name_length = max_name_length;
    }

    public boolean isTurnitin_enabled() {
        return turnitin_enabled;
    }

    public void setTurnitin_enabled(boolean turnitin_enabled) {
        this.turnitin_enabled = turnitin_enabled;
    }

    public boolean isVericite_enabled() {
        return vericite_enabled;
    }

    public void setVericite_enabled(boolean vericite_enabled) {
        this.vericite_enabled = vericite_enabled;
    }

    public String getTurnitin_settings() {
        return turnitin_settings;
    }

    public void setTurnitin_settings(String turnitin_settings) {
        this.turnitin_settings = turnitin_settings;
    }

    public boolean isGrade_group_students_individually() {
        return grade_group_students_individually;
    }

    public void setGrade_group_students_individually(boolean grade_group_students_individually) {
        this.grade_group_students_individually = grade_group_students_individually;
    }

    public String getExternal_tool_tag_attributes() {
        return external_tool_tag_attributes;
    }

    public void setExternal_tool_tag_attributes(String external_tool_tag_attributes) {
        this.external_tool_tag_attributes = external_tool_tag_attributes;
    }

    public boolean isPeer_reviews() {
        return peer_reviews;
    }

    public void setPeer_reviews(boolean peer_reviews) {
        this.peer_reviews = peer_reviews;
    }

    public boolean isAutomatic_peer_reviews() {
        return automatic_peer_reviews;
    }

    public void setAutomatic_peer_reviews(boolean automatic_peer_reviews) {
        this.automatic_peer_reviews = automatic_peer_reviews;
    }

    public int getPeer_review_count() {
        return peer_review_count;
    }

    public void setPeer_review_count(int peer_review_count) {
        this.peer_review_count = peer_review_count;
    }

    public String getPeer_reviews_assign_at() {
        return peer_reviews_assign_at;
    }

    public void setPeer_reviews_assign_at(String peer_reviews_assign_at) {
        this.peer_reviews_assign_at = peer_reviews_assign_at;
    }

    public boolean isIntra_group_peer_reviews() {
        return intra_group_peer_reviews;
    }

    public void setIntra_group_peer_reviews(boolean intra_group_peer_reviews) {
        this.intra_group_peer_reviews = intra_group_peer_reviews;
    }

    public int getGroup_category_id() {
        return group_category_id;
    }

    public void setGroup_category_id(int group_category_id) {
        this.group_category_id = group_category_id;
    }

    public int getNeeds_grading_count() {
        return needs_grading_count;
    }

    public void setNeeds_grading_count(int needs_grading_count) {
        this.needs_grading_count = needs_grading_count;
    }

    public Needs_grading_count_by_section[] getNeeds_grading_count_by_section() {
        return needs_grading_count_by_section;
    }

    public void setNeeds_grading_count_by_section(Needs_grading_count_by_section[] needs_grading_count_by_section) {
        this.needs_grading_count_by_section = needs_grading_count_by_section;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isPost_to_sis() {
        return post_to_sis;
    }

    public void setPost_to_sis(boolean post_to_sis) {
        this.post_to_sis = post_to_sis;
    }

    public String getIntegration_id() {
        return integration_id;
    }

    public void setIntegration_id(String integration_id) {
        this.integration_id = integration_id;
    }

    public int getPoints_possible() {
        return points_possible;
    }

    public void setPoints_possible(int points_possible) {
        this.points_possible = points_possible;
    }

    public String[] getSubmission_types() {
        return submission_types;
    }

    public void setSubmission_types(String[] submission_types) {
        this.submission_types = submission_types;
    }

    public boolean isHas_submitted_submissions() {
        return has_submitted_submissions;
    }

    public void setHas_submitted_submissions(boolean has_submitted_submissions) {
        this.has_submitted_submissions = has_submitted_submissions;
    }

    public String getGrading_type() {
        return grading_type;
    }

    public void setGrading_type(String grading_type) {
        this.grading_type = grading_type;
    }

    public String getGrading_standard_id() {
        return grading_standard_id;
    }

    public void setGrading_standard_id(String grading_standard_id) {
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

    public boolean isOnly_visible_to_overrides() {
        return only_visible_to_overrides;
    }

    public void setOnly_visible_to_overrides(boolean only_visible_to_overrides) {
        this.only_visible_to_overrides = only_visible_to_overrides;
    }

    public boolean isLocked_for_user() {
        return locked_for_user;
    }

    public void setLocked_for_user(boolean locked_for_user) {
        this.locked_for_user = locked_for_user;
    }

    public String getLock_info() {
        return lock_info;
    }

    public void setLock_info(String lock_info) {
        this.lock_info = lock_info;
    }

    public String getLock_explanation() {
        return lock_explanation;
    }

    public void setLock_explanation(String lock_explanation) {
        this.lock_explanation = lock_explanation;
    }

    public int getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(int quiz_id) {
        this.quiz_id = quiz_id;
    }

    public boolean isAnonymous_submissions() {
        return anonymous_submissions;
    }

    public void setAnonymous_submissions(boolean anonymous_submissions) {
        this.anonymous_submissions = anonymous_submissions;
    }

    public String getDiscussion_topic() {
        return discussion_topic;
    }

    public void setDiscussion_topic(String discussion_topic) {
        this.discussion_topic = discussion_topic;
    }

    public boolean isFreeze_on_copy() {
        return freeze_on_copy;
    }

    public void setFreeze_on_copy(boolean freeze_on_copy) {
        this.freeze_on_copy = freeze_on_copy;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public String[] getFrozen_attributes() {
        return frozen_attributes;
    }

    public void setFrozen_attributes(String[] frozen_attributes) {
        this.frozen_attributes = frozen_attributes;
    }

    public String getSubmission() {
        return submission;
    }

    public void setSubmission(String submission) {
        this.submission = submission;
    }

    public boolean isUse_rubric_for_grading() {
        return use_rubric_for_grading;
    }

    public void setUse_rubric_for_grading(boolean use_rubric_for_grading) {
        this.use_rubric_for_grading = use_rubric_for_grading;
    }

    public String getRubric() {
        return rubric;
    }

    public void setRubric(String rubric) {
        this.rubric = rubric;
    }

    public int[] getAssignment_visibility() {
        return assignment_visibility;
    }

    public void setAssignment_visibility(int[] assignment_visibility) {
        this.assignment_visibility = assignment_visibility;
    }

    public String getOverrides() {
        return overrides;
    }

    public void setOverrides(String overrides) {
        this.overrides = overrides;
    }

    public boolean isOmit_from_final_grade() {
        return omit_from_final_grade;
    }

    public void setOmit_from_final_grade(boolean omit_from_final_grade) {
        this.omit_from_final_grade = omit_from_final_grade;
    }

    public boolean isModerated_grading() {
        return moderated_grading;
    }

    public void setModerated_grading(boolean moderated_grading) {
        this.moderated_grading = moderated_grading;
    }

    public int getGrader_count() {
        return grader_count;
    }

    public void setGrader_count(int grader_count) {
        this.grader_count = grader_count;
    }

    public int getFinal_grader_id() {
        return final_grader_id;
    }

    public void setFinal_grader_id(int final_grader_id) {
        this.final_grader_id = final_grader_id;
    }

    public boolean isGrader_comments_visible_to_graders() {
        return grader_comments_visible_to_graders;
    }

    public void setGrader_comments_visible_to_graders(boolean grader_comments_visible_to_graders) {
        this.grader_comments_visible_to_graders = grader_comments_visible_to_graders;
    }

    public boolean isGraders_anonymous_to_graders() {
        return graders_anonymous_to_graders;
    }

    public void setGraders_anonymous_to_graders(boolean graders_anonymous_to_graders) {
        this.graders_anonymous_to_graders = graders_anonymous_to_graders;
    }

    public boolean isGrader_names_visible_to_final_grader() {
        return grader_names_visible_to_final_grader;
    }

    public void setGrader_names_visible_to_final_grader(boolean grader_names_visible_to_final_grader) {
        this.grader_names_visible_to_final_grader = grader_names_visible_to_final_grader;
    }

    public boolean isAnonymous_grading() {
        return anonymous_grading;
    }

    public void setAnonymous_grading(boolean anonymous_grading) {
        this.anonymous_grading = anonymous_grading;
    }

    public int getAllowed_attempts() {
        return allowed_attempts;
    }

    public void setAllowed_attempts(int allowed_attempts) {
        this.allowed_attempts = allowed_attempts;
    }

    public boolean isPost_manually() {
        return post_manually;
    }

    public void setPost_manually(boolean post_manually) {
        this.post_manually = post_manually;
    }

    public String getScore_statistics() {
        return score_statistics;
    }

    public void setScore_statistics(String score_statistics) {
        this.score_statistics = score_statistics;
    }

    public boolean isCan_submit() {
        return can_submit;
    }

    public void setCan_submit(boolean can_submit) {
        this.can_submit = can_submit;
    }
}
