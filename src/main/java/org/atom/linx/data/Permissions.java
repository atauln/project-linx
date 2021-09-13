package org.atom.linx.data;
public class Permissions {
    private boolean create_discussion_topic;
    private boolean create_announcement;
    public boolean attach;

    public boolean isAttach() {
        return attach;
    }

    public void setAttach(boolean attach) {
        this.attach = attach;
    }

    public boolean isCreateDiscussionTopic() {
        return create_discussion_topic;
    }

    public void setCreateDiscussionTopic(boolean create_discussion_topic) {
        this.create_discussion_topic = create_discussion_topic;
    }

    public boolean isCreateAnnouncement() {
        return create_announcement;
    }

    public void setCreateAnnouncement(boolean create_announcement) {
        this.create_announcement = create_announcement;
    }
}
