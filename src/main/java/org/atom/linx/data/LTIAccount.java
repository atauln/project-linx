package org.atom.linx.data;

public class LTIAccount {
    public int id;
    public String name;
    public String uuid;
    public int parent_account_id;
    public int root_account_id;
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

    public String getWorkflowState() {
        return workflow_state;
    }

    public void setWorkflowState(String workflow_state) {
        this.workflow_state = workflow_state;
    }
}
