package org.atom.linx.data;

public class AssignmentExtension {
    public int assignment_id;
    public int user_id;
    public int extra_attempts;

    public int getAssignmentId() {
        return assignment_id;
    }
    public void setAssignmentId(int assignment_id) {
        this.assignment_id = assignment_id;
    }
    public int getUserID() {
        return user_id;
    }
    public void setUserID(int user_id) {
        this.user_id = user_id;
    }
    public int getExtraAttempts() {
        return extra_attempts;
    }
    public void setExtraAttempts(int extra_attempts) {
        this.extra_attempts = extra_attempts;
    }
}
