package org.atom.linx.data;

public class TermsOfService {
    protected int id;
    protected String terms_type;
    protected boolean passive;
    protected int account_id;
    protected String content;
    protected String[] self_registration_type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTermsType() {
        return terms_type;
    }

    public void setTermsType(String terms_type) {
        this.terms_type = terms_type;
    }

    public boolean isPassive() {
        return passive;
    }

    public void setPassive(boolean passive) {
        this.passive = passive;
    }

    public int getAccountId() {
        return account_id;
    }

    public void setAccountId(int account_id) {
        this.account_id = account_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String[] getSelfRegistrationType() {
        return self_registration_type;
    }

    public void setSelfRegistrationType(String[] self_registration_type) {
        this.self_registration_type = self_registration_type;
    }
}
