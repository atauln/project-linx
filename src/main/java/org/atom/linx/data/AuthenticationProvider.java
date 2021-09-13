package org.atom.linx.data;

public class AuthenticationProvider {
    private String identifier_format;
    private String auth_type;
    private int id;
    private String log_out_url;
    private String log_in_url;
    private String certificate_fingerprint;
    private Object requested_authn_context;
    private String auth_host;
    private String auth_filter;
    private Object auth_over_tls;
    private Object auth_base;
    private String auth_username;
    private Object auth_port;
    private int position;
    private String idp_entity_id;
    private String login_attribute;
    private String sig_alg;
    private Object jit_provisioning;
    private Object federated_attributes;
    private Object mfa_required;

    public String getIdentifierFormat() {
        return identifier_format;
    }

    public void setIdentifierFormat(String identifier_format) {
        this.identifier_format = identifier_format;
    }

    public String getAuthType() {
        return auth_type;
    }

    public void setAuthType(String auth_type) {
        this.auth_type = auth_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogOutUrl() {
        return log_out_url;
    }

    public void setLogOutUrl(String log_out_url) {
        this.log_out_url = log_out_url;
    }

    public String getLogInUrl() {
        return log_in_url;
    }

    public void setLogInUrl(String log_in_url) {
        this.log_in_url = log_in_url;
    }

    public String getCertificateFingerprint() {
        return certificate_fingerprint;
    }

    public void setCertificateFingerprint(String certificate_fingerprint) {
        this.certificate_fingerprint = certificate_fingerprint;
    }

    public Object getRequestedAuthnContext() {
        return requested_authn_context;
    }

    public void setRequestedAuthnContext(Object requested_authn_context) {
        this.requested_authn_context = requested_authn_context;
    }

    public String getAuthHost() {
        return auth_host;
    }

    public void setAuthHost(String auth_host) {
        this.auth_host = auth_host;
    }

    public String getAuthFilter() {
        return auth_filter;
    }

    public void setAuthFilter(String auth_filter) {
        this.auth_filter = auth_filter;
    }

    public Object getAuthOverTls() {
        return auth_over_tls;
    }

    public void setAuthOverTls(Object auth_over_tls) {
        this.auth_over_tls = auth_over_tls;
    }

    public Object getAuthBase() {
        return auth_base;
    }

    public void setAuthBase(Object auth_base) {
        this.auth_base = auth_base;
    }

    public String getAuthUsername() {
        return auth_username;
    }

    public void setAuthUsername(String auth_username) {
        this.auth_username = auth_username;
    }

    public Object getAuthPort() {
        return auth_port;
    }

    public void setAuthPort(Object auth_port) {
        this.auth_port = auth_port;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getIdpEntityId() {
        return idp_entity_id;
    }

    public void setIdpEntityId(String idp_entity_id) {
        this.idp_entity_id = idp_entity_id;
    }

    public String getLoginAttribute() {
        return login_attribute;
    }

    public void setLoginAttribute(String login_attribute) {
        this.login_attribute = login_attribute;
    }

    public String getSigAlg() {
        return sig_alg;
    }

    public void setSigAlg(String sig_alg) {
        this.sig_alg = sig_alg;
    }

    public Object getJitProvisioning() {
        return jit_provisioning;
    }

    public void setJitProvisioning(Object jit_provisioning) {
        this.jit_provisioning = jit_provisioning;
    }

    public Object getFederatedAttributes() {
        return federated_attributes;
    }

    public void setFederatedAttributes(Object federated_attributes) {
        this.federated_attributes = federated_attributes;
    }

    public Object getMfaRequired() {
        return mfa_required;
    }

    public void setMfaRequired(Object mfa_required) {
        this.mfa_required = mfa_required;
    }
}
