package org.atom.linx.data;
public class Permissions {
    protected boolean create_discussion_topic;
    protected boolean create_announcement;
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
