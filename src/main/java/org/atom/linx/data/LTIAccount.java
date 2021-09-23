package org.atom.linx.data;

public class LTIAccount {
    protected int id;
    protected String name;
    protected String uuid;
    protected int parent_account_id;
    protected int root_account_id;
    protected String workflow_state;

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
