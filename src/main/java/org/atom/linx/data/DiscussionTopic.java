package org.atom.linx.data;

import java.util.Date;

class GroupTopicChildren {
    public int id;
    public int group_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }
}

public class DiscussionTopic {
    public int id;
    public String title;
    public String message;
    public String html_url;
    public Date posted_at;
    public Date last_reply_at;
    public boolean require_initial_post;
    public boolean user_can_see_posts;
    public int discussion_subentry_count;
    public String read_state;
    public int unread_count;
    public boolean subscribed;
    public String subscription_hold;
    public Object assignment_id;
    public Object delayed_post_at;
    public boolean published;
    public Object lock_at;
    public boolean locked;
    public boolean pinned;
    public boolean locked_for_user;
    public Object lock_info;
    public String lock_explanation;
    public String user_name;
    public int[] topic_children;
    public GroupTopicChildren[] group_topic_children;
    public Object root_topic_id;
    public String podcast_url;
    public String discussion_type;
    public Object group_category_id;
    public Object attachments;
    public Permissions permissions;
    public boolean allow_rating;
    public boolean only_graders_can_rate;
    public boolean sort_by_rating;

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

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public Date getPosted_at() {
        return posted_at;
    }

    public void setPosted_at(Date posted_at) {
        this.posted_at = posted_at;
    }

    public Date getLast_reply_at() {
        return last_reply_at;
    }

    public void setLast_reply_at(Date last_reply_at) {
        this.last_reply_at = last_reply_at;
    }

    public boolean isRequire_initial_post() {
        return require_initial_post;
    }

    public void setRequire_initial_post(boolean require_initial_post) {
        this.require_initial_post = require_initial_post;
    }

    public boolean isUser_can_see_posts() {
        return user_can_see_posts;
    }

    public void setUser_can_see_posts(boolean user_can_see_posts) {
        this.user_can_see_posts = user_can_see_posts;
    }

    public int getDiscussion_subentry_count() {
        return discussion_subentry_count;
    }

    public void setDiscussion_subentry_count(int discussion_subentry_count) {
        this.discussion_subentry_count = discussion_subentry_count;
    }

    public String getRead_state() {
        return read_state;
    }

    public void setRead_state(String read_state) {
        this.read_state = read_state;
    }

    public int getUnread_count() {
        return unread_count;
    }

    public void setUnread_count(int unread_count) {
        this.unread_count = unread_count;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getSubscription_hold() {
        return subscription_hold;
    }

    public void setSubscription_hold(String subscription_hold) {
        this.subscription_hold = subscription_hold;
    }

    public Object getAssignment_id() {
        return assignment_id;
    }

    public void setAssignment_id(Object assignment_id) {
        this.assignment_id = assignment_id;
    }

    public Object getDelayed_post_at() {
        return delayed_post_at;
    }

    public void setDelayed_post_at(Object delayed_post_at) {
        this.delayed_post_at = delayed_post_at;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public Object getLock_at() {
        return lock_at;
    }

    public void setLock_at(Object lock_at) {
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

    public boolean isLocked_for_user() {
        return locked_for_user;
    }

    public void setLocked_for_user(boolean locked_for_user) {
        this.locked_for_user = locked_for_user;
    }

    public Object getLock_info() {
        return lock_info;
    }

    public void setLock_info(Object lock_info) {
        this.lock_info = lock_info;
    }

    public String getLock_explanation() {
        return lock_explanation;
    }

    public void setLock_explanation(String lock_explanation) {
        this.lock_explanation = lock_explanation;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int[] getTopic_children() {
        return topic_children;
    }

    public void setTopic_children(int[] topic_children) {
        this.topic_children = topic_children;
    }

    public GroupTopicChildren[] getGroup_topic_children() {
        return group_topic_children;
    }

    public void setGroup_topic_children(GroupTopicChildren[] group_topic_children) {
        this.group_topic_children = group_topic_children;
    }

    public Object getRoot_topic_id() {
        return root_topic_id;
    }

    public void setRoot_topic_id(Object root_topic_id) {
        this.root_topic_id = root_topic_id;
    }

    public String getPodcast_url() {
        return podcast_url;
    }

    public void setPodcast_url(String podcast_url) {
        this.podcast_url = podcast_url;
    }

    public String getDiscussion_type() {
        return discussion_type;
    }

    public void setDiscussion_type(String discussion_type) {
        this.discussion_type = discussion_type;
    }

    public Object getGroup_category_id() {
        return group_category_id;
    }

    public void setGroup_category_id(Object group_category_id) {
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

    public boolean isAllow_rating() {
        return allow_rating;
    }

    public void setAllow_rating(boolean allow_rating) {
        this.allow_rating = allow_rating;
    }

    public boolean isOnly_graders_can_rate() {
        return only_graders_can_rate;
    }

    public void setOnly_graders_can_rate(boolean only_graders_can_rate) {
        this.only_graders_can_rate = only_graders_can_rate;
    }

    public boolean isSort_by_rating() {
        return sort_by_rating;
    }

    public void setSort_by_rating(boolean sort_by_rating) {
        this.sort_by_rating = sort_by_rating;
    }
}
