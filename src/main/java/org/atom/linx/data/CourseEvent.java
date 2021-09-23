package org.atom.linx.data;

import java.util.Date;

public class CourseEvent {
    protected String id;
    protected Date created_at;
    protected String event_type;
    protected Object event_data;
    protected String event_source;
    protected CourseEventLink[] links;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(Date created_at) {
        this.created_at = created_at;
    }

    public String getEventType() {
        return event_type;
    }

    public void setEventType(String event_type) {
        this.event_type = event_type;
    }

    public Object getEventData() {
        return event_data;
    }

    public void setEventData(Object event_data) {
        this.event_data = event_data;
    }

    public String getEventSource() {
        return event_source;
    }

    public void setEventSource(String event_source) {
        this.event_source = event_source;
    }

    public CourseEventLink[] getLinks() {
        return links;
    }

    public void setLinks(CourseEventLink[] links) {
        this.links = links;
    }
}
