package org.atom.linx.data;

public class Scope {
    protected String resource;
    protected String resource_name;
    protected String controller;
    protected String action;
    protected String verb;
    protected String scope;

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getResourceName() {
        return resource_name;
    }

    public void setResourceName(String resource_name) {
        this.resource_name = resource_name;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
