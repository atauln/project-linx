package org.atom.linx.data;

import java.util.Date;

class GroupTopicChildren {
    protected int id;
    protected int group_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroupId() {
        return group_id;
    }

    public void setGroupId(int group_id) {
        this.group_id = group_id;
    }
}

public class DiscussionTopic {
    protected int id;
    protected String title;
    protected String message;
    protected String html_url;
    protected Date posted_at;
    protected Date last_reply_at;
    protected boolean require_initial_post;
    protected boolean user_can_see_posts;
    protected int discussion_subentry_count;
    protected String read_state;
    protected int unread_count;
    protected boolean subscribed;
    protected String subscription_hold;
    protected Object assignment_id;
    protected Object delayed_post_at;
    protected boolean published;
    protected Object lock_at;
    protected boolean locked;
    protected boolean pinned;
    protected boolean locked_for_user;
    protected Object lock_info;
    protected String lock_explanation;
    protected String user_name;
    protected int[] topic_children;
    protected GroupTopicChildren[] group_topic_children;
    protected Object root_topic_id;
    protected String podcast_url;
    protected String discussion_type;
    protected Object group_category_id;
    protected Object attachments;
    protected Permissions permissions;
    protected boolean allow_rating;
    protected boolean only_graders_can_rate;
    protected boolean sort_by_rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHtmlUrl() {
        return html_url;
    }

    public void setHtmlUrl(String html_url) {
        this.html_url = html_url;
    }

    public Date getPostedAt() {
        return posted_at;
    }

    public void setPostedAt(Date posted_at) {
        this.posted_at = posted_at;
    }

    public Date getLastReplyAt() {
        return last_reply_at;
    }

    public void setLastReplyAt(Date last_reply_at) {
        this.last_reply_at = last_reply_at;
    }

    public boolean isRequireInitialPost() {
        return require_initial_post;
    }

    public void setRequireInitialPost(boolean require_initial_post) {
        this.require_initial_post = require_initial_post;
    }

    public boolean isUserCanSeePosts() {
        return user_can_see_posts;
    }

    public void setUserCanSeePosts(boolean user_can_see_posts) {
        this.user_can_see_posts = user_can_see_posts;
    }

    public int getDiscussionSubentryCount() {
        return discussion_subentry_count;
    }

    public void setDiscussionSubentryCount(int discussion_subentry_count) {
        this.discussion_subentry_count = discussion_subentry_count;
    }

    public String getReadState() {
        return read_state;
    }

    public void setReadState(String read_state) {
        this.read_state = read_state;
    }

    public int getUnreadCount() {
        return unread_count;
    }

    public void setUnreadCount(int unread_count) {
        this.unread_count = unread_count;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getSubscriptionHold() {
        return subscription_hold;
    }

    public void setSubscriptionHold(String subscription_hold) {
        this.subscription_hold = subscription_hold;
    }

    public Object getAssignmentId() {
        return assignment_id;
    }

    public void setAssignmentId(Object assignment_id) {
        this.assignment_id = assignment_id;
    }

    public Object getDelayedPostAt() {
        return delayed_post_at;
    }

    public void setDelayedPostAt(Object delayed_post_at) {
        this.delayed_post_at = delayed_post_at;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public Object getLockAt() {
        return lock_at;
    }

    public void setLockAt(Object lock_at) {
        this.lock_at = lock_at;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public boolean isLockedForUser() {
        return locked_for_user;
    }

    public void setLockedForUser(boolean locked_for_user) {
        this.locked_for_user = locked_for_user;
    }

    public Object getLockInfo() {
        return lock_info;
    }

    public void setLockInfo(Object lock_info) {
        this.lock_info = lock_info;
    }

    public String getLockExplanation() {
        return lock_explanation;
    }

    public void setLockExplanation(String lock_explanation) {
        this.lock_explanation = lock_explanation;
    }

    public String getUserName() {
        return user_name;
    }

    public void setUserName(String user_name) {
        this.user_name = user_name;
    }

    public int[] getTopicChildren() {
        return topic_children;
    }

    public void setTopicChildren(int[] topic_children) {
        this.topic_children = topic_children;
    }

    public GroupTopicChildren[] getGroupTopicChildren() {
        return group_topic_children;
    }

    public void setGroupTopicChildren(GroupTopicChildren[] group_topic_children) {
        this.group_topic_children = group_topic_children;
    }

    public Object getRootTopicId() {
        return root_topic_id;
    }

    public void setRootTopicId(Object root_topic_id) {
        this.root_topic_id = root_topic_id;
    }

    public String getPodcastUrl() {
        return podcast_url;
    }

    public void setPodcastUrl(String podcast_url) {
        this.podcast_url = podcast_url;
    }

    public String getDiscussionType() {
        return discussion_type;
    }

    public void setDiscussionType(String discussion_type) {
        this.discussion_type = discussion_type;
    }

    public Object getGroupCategoryId() {
        return group_category_id;
    }

    public void setGroupCategoryId(Object group_category_id) {
        this.group_category_id = group_category_id;
    }

    public Object getAttachments() {
        return attachments;
    }

    public void setAttachments(Object attachments) {
        this.attachments = attachments;
    }

    public Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    public boolean isAllowRating() {
        return allow_rating;
    }

    public void setAllowRating(boolean allow_rating) {
        this.allow_rating = allow_rating;
    }

    public boolean isOnlyGradersCanRate() {
        return only_graders_can_rate;
    }

    public void setOnlyGradersCanRate(boolean only_graders_can_rate) {
        this.only_graders_can_rate = only_graders_can_rate;
    }

    public boolean isSortByRating() {
        return sort_by_rating;
    }

    public void setSortByRating(boolean sort_by_rating) {
        this.sort_by_rating = sort_by_rating;
    }
}
