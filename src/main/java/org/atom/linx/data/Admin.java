package org.atom.linx.data;

public class Admin {
    protected int id;
    protected String role;
    protected Object user;
    protected String workflow_state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }

    public String getWorkflowState() {
        return workflow_state;
    }

    public void setWorkflowState(String workflow_state) {
        this.workflow_state = workflow_state;
    }
}
