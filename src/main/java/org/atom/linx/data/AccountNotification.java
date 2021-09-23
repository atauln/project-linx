package org.atom.linx.data;

import java.util.Date;

public class AccountNotification {
    protected String subject;
    protected String message;
    protected Date start_at;
    protected Date end_at;
    protected String icon;
    protected String[] roles;
    protected int[] role_ids;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getStart_at() {
        return start_at;
    }

    public void setStart_at(Date start_at) {
        this.start_at = start_at;
    }

    public Date getEnd_at() {
        return end_at;
    }

    public void setEnd_at(Date end_at) {
        this.end_at = end_at;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public int[] getRoleIds() {
        return role_ids;
    }

    public void setRoleIds(int[] role_ids) {
        this.role_ids = role_ids;
    }
}
