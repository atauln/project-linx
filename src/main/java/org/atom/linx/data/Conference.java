package org.atom.linx.data;

import java.util.Date;

class UserSettings {
    protected boolean record;
}

public class Conference {
    protected int id;
    protected String conference_type;
    protected String conference_key;
    protected String description;
    protected int duration;
    protected Date ended_at;
    protected Date started_at;
    protected String title;
    protected int[] users;
    protected boolean has_advanced_settings;
    protected boolean long_running;
    protected UserSettings user_settings;
    protected ConferenceRecording[] recordings;
    protected String url;
    protected String join_url;
    protected Object context_type;
    protected Object context_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConferenceType() {
        return conference_type;
    }

    public void setConferenceType(String conference_type) {
        this.conference_type = conference_type;
    }

    public String getConferenceKey() {
        return conference_key;
    }

    public void setConferenceKey(String conference_key) {
        this.conference_key = conference_key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getEndedAt() {
        return ended_at;
    }

    public void setEndedAt(Date ended_at) {
        this.ended_at = ended_at;
    }

    public Date getStartedAt() {
        return started_at;
    }

    public void setStartedAt(Date started_at) {
        this.started_at = started_at;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int[] getUsers() {
        return users;
    }

    public void setUsers(int[] users) {
        this.users = users;
    }

    public boolean isHas_advanced_settings() {
        return has_advanced_settings;
    }

    public void setHasAdvancedSettings(boolean has_advanced_settings) {
        this.has_advanced_settings = has_advanced_settings;
    }

    public boolean isLong_running() {
        return long_running;
    }

    public void setLongRunning(boolean long_running) {
        this.long_running = long_running;
    }

    public UserSettings getUserSettings() {
        return user_settings;
    }

    public void setUserSettings(UserSettings user_settings) {
        this.user_settings = user_settings;
    }

    public ConferenceRecording[] getRecordings() {
        return recordings;
    }

    public void setRecordings(ConferenceRecording[] recordings) {
        this.recordings = recordings;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getJoinUrl() {
        return join_url;
    }

    public void setJoinUrl(String join_url) {
        this.join_url = join_url;
    }

    public Object getContextType() {
        return context_type;
    }

    public void setContextType(Object context_type) {
        this.context_type = context_type;
    }

    public Object getContextId() {
        return context_id;
    }

    public void setContextId(Object context_id) {
        this.context_id = context_id;
    }
}
