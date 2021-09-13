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

    public String[] getAvailableTo() {
        return available_to;
    }

    public void setAvailableTo(String[] available_to) {
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

    public boolean isIsFeatured() {
        return is_featured;
    }

    public void setIsFeatured(boolean is_featured) {
        this.is_featured = is_featured;
    }

    public boolean isIsNew() {
        return is_new;
    }

    public void setIsNew(boolean is_new) {
        this.is_new = is_new;
    }

    public String getFeatureHeadline() {
        return feature_headline;
    }

    public void setFeatureHeadline(String feature_headline) {
        this.feature_headline = feature_headline;
    }
}
