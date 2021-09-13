package org.atom.linx.data;
public class CourseProgress {
    private int requirement_count;    private int requirement_completed_count;    private String next_requirement_url;    private String completed_at;
    public String toString() {
        String s = "";        s += "Requirement Count: " + requirement_count;        s += "\nRequirement Completed Count: " + requirement_completed_count;        s += "\nNext Requirement URL: " + next_requirement_url;        s += "\nCompleted At: " + completed_at;        return s;    }

    public int getRequirement_count() {
        return requirement_count;    }

    public void setRequirement_count(int requirement_count) {
        this.requirement_count = requirement_count;    }

    public int getRequirement_completed_count() {
        return requirement_completed_count;    }

    public void setRequirement_completed_count(int requirement_completed_count) {
        this.requirement_completed_count = requirement_completed_count;    }

    public String getNext_requirement_url() {
        return next_requirement_url;    }

    public void setNext_requirement_url(String next_requirement_url) {
        this.next_requirement_url = next_requirement_url;    }

    public String getCompleted_at() {
        return completed_at;    }

    public void setCompleted_at(String completed_at) {
        this.completed_at = completed_at;    }
}
