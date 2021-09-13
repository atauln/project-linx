package org.atom.linx.data;

import java.util.Date;

public class AssignmentOverride {
    private int id;
    private int assignment_id;
    private int[] student_ids;
    private int group_id;
    private int course_section_id;
    private String title;
    private Date due_at;
    private boolean all_day;
    private String all_day_date;
    private Date unlock_at;
    private Date lock_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAssignment_id() {
        return assignment_id;
    }

    public void setAssignment_id(int assignment_id) {
        this.assignment_id = assignment_id;
    }

    public int[] getStudent_ids() {
        return student_ids;
    }

    public void setStudent_ids(int[] student_ids) {
        this.student_ids = student_ids;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getCourse_section_id() {
        return course_section_id;
    }

    public void setCourse_section_id(int course_section_id) {
        this.course_section_id = course_section_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDue_at() {
        return due_at;
    }

    public void setDue_at(Date due_at) {
        this.due_at = due_at;
    }

    public boolean isAll_day() {
        return all_day;
    }

    public void setAll_day(boolean all_day) {
        this.all_day = all_day;
    }

    public String getAll_day_date() {
        return all_day_date;
    }

    public void setAll_day_date(String all_day_date) {
        this.all_day_date = all_day_date;
    }

    public Date getUnlock_at() {
        return unlock_at;
    }

    public void setUnlock_at(Date unlock_at) {
        this.unlock_at = unlock_at;
    }

    public Date getLock_at() {
        return lock_at;
    }

    public void setLock_at(Date lock_at) {
        this.lock_at = lock_at;
    }
}
