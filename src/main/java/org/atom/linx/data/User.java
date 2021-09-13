package org.atom.linx.data;
public class User {
    private Integer id;
    private String name;
    private String sortable_name;
    private String short_name;
    private String sis_user_id;
    private Integer sis_import_id;
    private String integration_id;
    private String login_id;
    private String avatar_url;
    private Enrollment[] enrollments;
    private String email;
    private String locale;
    private String last_login;
    private String time_zone;
    private String bio;
    public String toString() {
        String s = "";        s += "Name: " + sortable_name;        s += "  Short Name: " + short_name;        s += "  ID: " + id;        return s;    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSortableName() {
        return sortable_name;
    }

    public void setSortableName(String sortable_name) {
        this.sortable_name = sortable_name;
    }

    public String getShortName() {
        return short_name;
    }

    public void setShortName(String short_name) {
        this.short_name = short_name;
    }

    public String getSisUserId() {
        return sis_user_id;
    }

    public void setSisUserId(String sis_user_id) {
        this.sis_user_id = sis_user_id;
    }

    public Integer getSisImportId() {
        return sis_import_id;
    }

    public void setSisImportId(Integer sis_import_id) {
        this.sis_import_id = sis_import_id;
    }

    public String getIntegrationId() {
        return integration_id;
    }

    public void setIntegrationId(String integration_id) {
        this.integration_id = integration_id;
    }

    public String getLoginId() {
        return login_id;
    }

    public void setLoginId(String login_id) {
        this.login_id = login_id;
    }

    public String getAvatarUrl() {
        return avatar_url;
    }

    public void setAvatarUrl(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public Enrollment[] getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(Enrollment[] enrollments) {
        this.enrollments = enrollments;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getLastLogin() {
        return last_login;
    }

    public void setLastLogin(String last_login) {
        this.last_login = last_login;
    }

    public String getTimeZone() {
        return time_zone;
    }

    public void setTimeZone(String time_zone) {
        this.time_zone = time_zone;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
