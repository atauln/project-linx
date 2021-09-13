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

    public boolean isCreate_discussion_topic() {
        return create_discussion_topic;
    }

    public void setCreate_discussion_topic(boolean create_discussion_topic) {
        this.create_discussion_topic = create_discussion_topic;
    }

    public boolean isCreate_announcement() {
        return create_announcement;
    }

    public void setCreate_announcement(boolean create_announcement) {
        this.create_announcement = create_announcement;
    }
}
