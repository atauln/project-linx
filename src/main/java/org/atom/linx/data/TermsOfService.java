package org.atom.linx.data;

public class TermsOfService {
    public int id;
    public String terms_type;
    public boolean passive;
    public int account_id;
    public String content;
    public String[] self_registration_type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTerms_type() {
        return terms_type;
    }

    public void setTerms_type(String terms_type) {
        this.terms_type = terms_type;
    }

    public boolean isPassive() {
        return passive;
    }

    public void setPassive(boolean passive) {
        this.passive = passive;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String[] getSelf_registration_type() {
        return self_registration_type;
    }

    public void setSelf_registration_type(String[] self_registration_type) {
        this.self_registration_type = self_registration_type;
    }
}
