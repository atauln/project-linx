package org.atom.linx.data;

import java.util.Date;

public class ConferenceRecording {
    protected int duration_minutes;
    protected String title;
    protected Date updated_at;
    protected Date created_at;
    protected String playback_url;

    public int getDurationMinutes() {
        return duration_minutes;
    }

    public void setDurationMinutes(int duration_minutes) {
        this.duration_minutes = duration_minutes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getUpdatedAt() {
        return updated_at;
    }

    public void setUpdatedAt(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Date getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(Date created_at) {
        this.created_at = created_at;
    }

    public String getPlaybackUrl() {
        return playback_url;
    }

    public void setPlaybackUrl(String playback_url) {
        this.playback_url = playback_url;
    }
}
