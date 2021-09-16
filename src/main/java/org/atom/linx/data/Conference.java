package org.atom.linx.data;

import java.util.Date;

class UserSettings {
    private boolean record;
}

public class Conference {
    private int id;
    private String conference_type;
    private String conference_key;
    private String description;
    private int duration;
    private Date ended_at;
    private Date started_at;
    private String title;
    private int[] users;
    private boolean has_advanced_settings;
    private boolean long_running;
    private UserSettings user_settings;
    private ConferenceRecording[] recordings;
    private String url;
    private String join_url;
    private Object context_type;
    private Object context_id;

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
