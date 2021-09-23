package org.atom.linx.data;

public class SSOSettings {
    protected String login_handle_name;
    protected String change_password_url;
    protected String auth_discovery_url;
    protected String unknown_user_url;

    public String getLoginHandleName() {
        return login_handle_name;
    }

    public void setLoginHandleName(String login_handle_name) {
        this.login_handle_name = login_handle_name;
    }

    public String getChangePasswordUrl() {
        return change_password_url;
    }

    public void setChangePasswordUrl(String change_password_url) {
        this.change_password_url = change_password_url;
    }

    public String getAuthDiscoveryUrl() {
        return auth_discovery_url;
    }

    public void setAuthDiscoveryUrl(String auth_discovery_url) {
        this.auth_discovery_url = auth_discovery_url;
    }

    public String getUnknownUserUrl() {
        return unknown_user_url;
    }

    public void setUnknownUserUrl(String unknown_user_url) {
        this.unknown_user_url = unknown_user_url;
    }
}
