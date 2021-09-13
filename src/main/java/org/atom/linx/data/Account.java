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

    public int getParentAccountId() {
        return parent_account_id;
    }

    public void setParentAccountId(int parent_account_id) {
        this.parent_account_id = parent_account_id;
    }

    public int getRootAccountId() {
        return root_account_id;
    }

    public void setRootAccountId(int root_account_id) {
        this.root_account_id = root_account_id;
    }

    public int getDefaultStorageQuotaMb() {
        return default_storage_quota_mb;
    }

    public void setDefaultStorageQuotaMb(int default_storage_quota_mb) {
        this.default_storage_quota_mb = default_storage_quota_mb;
    }

    public int getDefaultUserStorageQuotaMb() {
        return default_user_storage_quota_mb;
    }

    public void setDefaultUserStorageQuotaMb(int default_user_storage_quota_mb) {
        this.default_user_storage_quota_mb = default_user_storage_quota_mb;
    }

    public int getDefaultGroupStorageQuotaMb() {
        return default_group_storage_quota_mb;
    }

    public void setDefaultGroupStorageQuotaMb(int default_group_storage_quota_mb) {
        this.default_group_storage_quota_mb = default_group_storage_quota_mb;
    }

    public String getDefaultTimeZone() {
        return default_time_zone;
    }

    public void setDefaultTimeZone(String default_time_zone) {
        this.default_time_zone = default_time_zone;
    }

    public String getSisAccountId() {
        return sis_account_id;
    }

    public void setSisAccountId(String sis_account_id) {
        this.sis_account_id = sis_account_id;
    }

    public String getIntegrationId() {
        return integration_id;
    }

    public void setIntegrationId(String integration_id) {
        this.integration_id = integration_id;
    }

    public int getSisImportId() {
        return sis_import_id;
    }

    public void setSisImportId(int sis_import_id) {
        this.sis_import_id = sis_import_id;
    }

    public String getLtiGuid() {
        return lti_guid;
    }

    public void setLtiGuid(String lti_guid) {
        this.lti_guid = lti_guid;
    }

    public String getWorkflowState() {
        return workflow_state;
    }

    public void setWorkflowState(String workflow_state) {
        this.workflow_state = workflow_state;
    }
}
