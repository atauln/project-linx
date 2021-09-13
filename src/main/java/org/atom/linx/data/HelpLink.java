package org.atom.linx.data;

public class HelpLink {
    public String[] available_to;
    public String text;
    public String subtext;
    public String url;
    public String type;
    public String id;
    public boolean is_featured;
    public boolean is_new;
    public String feature_headline;

    public String[] getAvailable_to() {
        return available_to;
    }

    public void setAvailable_to(String[] available_to) {
        this.available_to = available_to;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSubtext() {
        return subtext;
    }

    public void setSubtext(String subtext) {
        this.subtext = subtext;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isIs_featured() {
        return is_featured;
    }

    public void setIs_featured(boolean is_featured) {
        this.is_featured = is_featured;
    }

    public boolean isIs_new() {
        return is_new;
    }

    public void setIs_new(boolean is_new) {
        this.is_new = is_new;
    }

    public String getFeature_headline() {
        return feature_headline;
    }

    public void setFeature_headline(String feature_headline) {
        this.feature_headline = feature_headline;
    }
}
