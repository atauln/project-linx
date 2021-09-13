package org.atom.linx.data;

import java.util.Date;

public class ExternalFeed {
    public int id;
    public String display_name;
    public String url;
    public String header_match;
    public Date created_at;
    public String verbosity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHeader_match() {
        return header_match;
    }

    public void setHeader_match(String header_match) {
        this.header_match = header_match;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getVerbosity() {
        return verbosity;
    }

    public void setVerbosity(String verbosity) {
        this.verbosity = verbosity;
    }
}
