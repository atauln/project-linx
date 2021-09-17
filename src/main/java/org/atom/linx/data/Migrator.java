package org.atom.linx.data;

public class Migrator {
    private String type;
    private boolean requires_file_upload;
    private String name;
    private String[] required_settings;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRequiresFileUpload() {
        return requires_file_upload;
    }

    public void setRequiresFileUpload(boolean requires_file_upload) {
        this.requires_file_upload = requires_file_upload;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getRequiredSettings() {
        return required_settings;
    }

    public void setRequiredSettings(String[] required_settings) {
        this.required_settings = required_settings;
    }
}
