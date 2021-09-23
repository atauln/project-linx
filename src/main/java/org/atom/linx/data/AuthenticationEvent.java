package org.atom.linx.data;

import java.util.Date;

public class AuthenticationEvent {
    protected Date created_at;
    protected String event_type;
    protected int pseudonym_id;
    protected int account_id;
    protected int user_id;

    public Date getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(Date created_at) {
        this.created_at = created_at;
    }

    public String getEventType() {
        return event_type;
    }

    public void setEventType(String event_type) {
        this.event_type = event_type;
    }

    public int getPseudonymId() {
        return pseudonym_id;
    }

    public void setPseudonymId(int pseudonym_id) {
        this.pseudonym_id = pseudonym_id;
    }

    public int getAccountId() {
        return account_id;
    }

    public void setAccountId(int account_id) {
        this.account_id = account_id;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }
}
