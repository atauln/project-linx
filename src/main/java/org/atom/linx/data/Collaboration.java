package org.atom.linx.data;

import java.util.Date;

public class Collaboration {
    protected int id;
    protected String collaboration_type;
    protected String document_id;
    protected int user_id;
    protected int context_id;
    protected String context_type;
    protected String url;
    protected Date created_at;
    protected Date updated_at;
    protected String description;
    protected String title;
    protected String type;
    protected String update_url;
    protected String user_name;

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
