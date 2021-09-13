package org.atom.linx.data;
public class CourseProgress {
    private int requirement_count;
    private int requirement_completed_count;
    private String next_requirement_url;
    private String completed_at;
    public String toString() {
        String s = "";
        s += "Requirement Count: " + requirement_count;
        s += "\nRequirement Completed Count: " + requirement_completed_count;
        s += "\nNext Requirement URL: " + next_requirement_url;
        s += "\nCompleted At: " + completed_at;
        return s;
    }

    public int getRequirementCount() {
        return requirement_count;
    }

    public void setRequirementCount(int requirement_count) {
        this.requirement_count = requirement_count;
    }

    public int getRequirementCompletedCount() {
        return requirement_completed_count;
    }

    public void setRequirementCompletedCount(int requirement_completed_count) {
        this.requirement_completed_count = requirement_completed_count;
    }

    public String getNextRequirementUrl() {
        return next_requirement_url;
    }

    public void setNextRequirementUrl(String next_requirement_url) {
        this.next_requirement_url = next_requirement_url;
    }

    public String getCompletedAt() {
        return completed_at;
    }

    public void setCompletedAt(String completed_at) {
        this.completed_at = completed_at;
    }
}
