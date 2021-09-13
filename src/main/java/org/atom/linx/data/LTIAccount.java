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

    public String getWorkflow_state() {
        return workflow_state;
    }

    public void setWorkflow_state(String workflow_state) {
        this.workflow_state = workflow_state;
    }
}
