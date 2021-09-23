package org.atom.linx.data;

class ExceptionRecord {
    protected int course_id;
    protected String[] conflicting_changes;

    public int getCourseId() {
        return course_id;
    }

    public void setCourseId(int course_id) {
        this.course_id = course_id;
    }

    public String[] getConflictingChanges() {
        return conflicting_changes;
    }

    public void setConflictingChanges(String[] conflicting_changes) {
        this.conflicting_changes = conflicting_changes;
    }
}

public class ChangeRecord {
    protected int asset_id;
    protected String asset_type;
    protected String asset_name;
    protected String change_type;
    protected String html_url;
    protected boolean locked;
    protected ExceptionRecord[] exceptions;

    public int getAssetId() {
        return asset_id;
    }

    public void setAssetId(int asset_id) {
        this.asset_id = asset_id;
    }

    public String getAssetType() {
        return asset_type;
    }

    public void setAssetType(String asset_type) {
        this.asset_type = asset_type;
    }

    public String getAssetName() {
        return asset_name;
    }

    public void setAssetName(String asset_name) {
        this.asset_name = asset_name;
    }

    public String getChangeType() {
        return change_type;
    }

    public void setChangeType(String change_type) {
        this.change_type = change_type;
    }

    public String getHtmlUrl() {
        return html_url;
    }

    public void setHtmlUrl(String html_url) {
        this.html_url = html_url;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public ExceptionRecord[] getExceptions() {
        return exceptions;
    }

    public void setExceptions(ExceptionRecord[] exceptions) {
        this.exceptions = exceptions;
    }
}
