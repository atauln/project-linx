package org.atom.linx.data;

import java.util.Date;

public class ExternalFeed {
    protected int id;
    protected String display_name;
    protected String url;
    protected String header_match;
    protected Date created_at;
    protected String verbosity;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHeaderMatch() {
        return header_match;
    }

    public void setHeaderMatch(String header_match) {
        this.header_match = header_match;
    }

    public Date getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(Date created_at) {
        this.created_at = created_at;
    }

    public String getVerbosity() {
        return verbosity;
    }

    public void setVerbosity(String verbosity) {
        this.verbosity = verbosity;
    }
}
