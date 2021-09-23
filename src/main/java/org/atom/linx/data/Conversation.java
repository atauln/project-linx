package org.atom.linx.data;

import java.util.Date;

public class Conversation {
    protected int id;
    protected String subject;
    protected String workflow_state;
    protected String last_message;
    protected Date start_at;
    protected int message_count;
    protected boolean subscribed;
    protected boolean _private;
    protected boolean starred;
    protected String[] properties;
    protected int[] audience;
    protected Object audience_contexts;
    protected String avatar_url;
    protected ConversationParticipant[] participants;
    protected boolean visible;
    protected String context_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getWorkflowState() {
        return workflow_state;
    }

    public void setWorkflowState(String workflow_state) {
        this.workflow_state = workflow_state;
    }

    public String getLastMessage() {
        return last_message;
    }

    public void setLastMessage(String last_message) {
        this.last_message = last_message;
    }

    public Date getStartAt() {
        return start_at;
    }

    public void setStartAt(Date start_at) {
        this.start_at = start_at;
    }

    public int getMessageCount() {
        return message_count;
    }

    public void setMessageCount(int message_count) {
        this.message_count = message_count;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public boolean isPrivate() {
        return _private;
    }

    public void setPrivate(boolean _private) {
        this._private = _private;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public String[] getProperties() {
        return properties;
    }

    public void setProperties(String[] properties) {
        this.properties = properties;
    }

    public int[] getAudience() {
        return audience;
    }

    public void setAudience(int[] audience) {
        this.audience = audience;
    }

    public Object getAudienceContexts() {
        return audience_contexts;
    }

    public void setAudienceContexts(Object audience_contexts) {
        this.audience_contexts = audience_contexts;
    }

    public String getAvatarUrl() {
        return avatar_url;
    }

    public void setAvatarUrl(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public ConversationParticipant[] getParticipants() {
        return participants;
    }

    public void setParticipants(ConversationParticipant[] participants) {
        this.participants = participants;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getContextName() {
        return context_name;
    }

    public void setContextName(String context_name) {
        this.context_name = context_name;
    }
}
