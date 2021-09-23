package org.atom.linx.data;

import java.util.Date;

class Sender{
    protected int id;
    protected String display_name;
    protected String avatar_image_url;
    protected String html_url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisplayName() {
        return display_name;
    }

    public void setDisplayName(String display_name) {
        this.display_name = display_name;
    }

    public String getAvatarImageUrl() {
        return avatar_image_url;
    }

    public void setAvatarImageUrl(String avatar_image_url) {
        this.avatar_image_url = avatar_image_url;
    }

    public String getHtmlUrl() {
        return html_url;
    }

    public void setHtmlUrl(String html_url) {
        this.html_url = html_url;
    }
}

class Receiver{
    protected int id;
    protected String display_name;
    protected String avatar_image_url;
    protected String html_url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisplayName() {
        return display_name;
    }

    public void setDisplayName(String display_name) {
        this.display_name = display_name;
    }

    public String getAvatarImageUrl() {
        return avatar_image_url;
    }

    public void setAvatarImageUrl(String avatar_image_url) {
        this.avatar_image_url = avatar_image_url;
    }

    public String getHtmlUrl() {
        return html_url;
    }

    public void setHtmlUrl(String html_url) {
        this.html_url = html_url;
    }
}

class SourceCourse{
    protected int id;
    protected String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ContentShare {
    protected int id;
    protected String name;
    protected String content_type;
    protected Date created_at;
    protected Date updated_at;
    protected int user_id;
    protected Sender sender;
    protected Receiver[] receivers;
    protected SourceCourse source_course;
    protected String read_state;
    protected ContentExport content_export;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContentType() {
        return content_type;
    }

    public void setContentType(String content_type) {
        this.content_type = content_type;
    }

    public Date getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdatedAt() {
        return updated_at;
    }

    public void setUpdatedAt(Date updated_at) {
        this.updated_at = updated_at;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Receiver[] getReceivers() {
        return receivers;
    }

    public void setReceivers(Receiver[] receivers) {
        this.receivers = receivers;
    }

    public SourceCourse getSourceCourse() {
        return source_course;
    }

    public void setSourceCourse(SourceCourse source_course) {
        this.source_course = source_course;
    }

    public String getReadState() {
        return read_state;
    }

    public void setReadState(String read_state) {
        this.read_state = read_state;
    }

    public ContentExport getContentExport() {
        return content_export;
    }

    public void setContentExport(ContentExport content_export) {
        this.content_export = content_export;
    }
}