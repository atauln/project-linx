package org.atom.linx.data;

import java.util.Date;

public class Collaboration {
    private int id;
    private String collaboration_type;
    private String document_id;
    private int user_id;
    private int context_id;
    private String context_type;
    private String url;
    private Date created_at;
    private Date updated_at;
    private String description;
    private String title;
    private String type;
    private String update_url;
    private String user_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollaborationType() {
        return collaboration_type;
    }

    public void setCollaborationType(String collaboration_type) {
        this.collaboration_type = collaboration_type;
    }

    public String getDocumentId() {
        return document_id;
    }

    public void setDocumentId(String document_id) {
        this.document_id = document_id;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public int getContextId() {
        return context_id;
    }

    public void setContextId(int context_id) {
        this.context_id = context_id;
    }

    public String getContextType() {
        return context_type;
    }

    public void setContextType(String context_type) {
        this.context_type = context_type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdateUrl() {
        return update_url;
    }

    public void setUpdateUrl(String update_url) {
        this.update_url = update_url;
    }

    public String getUserName() {
        return user_name;
    }

    public void setUserName(String user_name) {
        this.user_name = user_name;
    }
}
