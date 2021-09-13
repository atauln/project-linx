package org.atom.linx.data;

public class Account {
    public int id;
    public String name;
    public String uuid;
    public int parent_account_id;
    public int root_account_id;
    public int default_storage_quota_mb;
    public int default_user_storage_quota_mb;
    public int default_group_storage_quota_mb;
    public String default_time_zone;
    public String sis_account_id;
    public String integration_id;
    public int sis_import_id;
    public String lti_guid;
    public String workflow_state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getParent_account_id() {
        return parent_account_id;
    }

    public void setParent_account_id(int parent_account_id) {
        this.parent_account_id = parent_account_id;
    }

    public int getRoot_account_id() {
        return root_account_id;
    }

    public void setRoot_account_id(int root_account_id) {
        this.root_account_id = root_account_id;
    }

    public int getDefault_storage_quota_mb() {
        return default_storage_quota_mb;
    }

    public void setDefault_storage_quota_mb(int default_storage_quota_mb) {
        this.default_storage_quota_mb = default_storage_quota_mb;
    }

    public int getDefault_user_storage_quota_mb() {
        return default_user_storage_quota_mb;
    }

    public void setDefault_user_storage_quota_mb(int default_user_storage_quota_mb) {
        this.default_user_storage_quota_mb = default_user_storage_quota_mb;
    }

    public int getDefault_group_storage_quota_mb() {
        return default_group_storage_quota_mb;
    }

    public void setDefault_group_storage_quota_mb(int default_group_storage_quota_mb) {
        this.default_group_storage_quota_mb = default_group_storage_quota_mb;
    }

    public String getDefault_time_zone() {
        return default_time_zone;
    }

    public void setDefault_time_zone(String default_time_zone) {
        this.default_time_zone = default_time_zone;
    }

    public String getSis_account_id() {
        return sis_account_id;
    }

    public void setSis_account_id(String sis_account_id) {
        this.sis_account_id = sis_account_id;
    }

    public String getIntegration_id() {
        return integration_id;
    }

    public void setIntegration_id(String integration_id) {
        this.integration_id = integration_id;
    }

    public int getSis_import_id() {
        return sis_import_id;
    }

    public void setSis_import_id(int sis_import_id) {
        this.sis_import_id = sis_import_id;
    }

    public String getLti_guid() {
        return lti_guid;
    }

    public void setLti_guid(String lti_guid) {
        this.lti_guid = lti_guid;
    }

    public String getWorkflow_state() {
        return workflow_state;
    }

    public void setWorkflow_state(String workflow_state) {
        this.workflow_state = workflow_state;
    }
}
