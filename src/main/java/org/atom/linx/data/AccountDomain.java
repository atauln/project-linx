package org.atom.linx.data;

public class AccountDomain {
    protected String name;
    protected String domain;
    protected int distance;
    protected String authentication_provider;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getAuthenticationProvider() {
        return authentication_provider;
    }

    public void setAuthenticationProvider(String authentication_provider) {
        this.authentication_provider = authentication_provider;
    }
}
