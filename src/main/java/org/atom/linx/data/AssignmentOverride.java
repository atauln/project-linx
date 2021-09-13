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

    public int getAssignmentId() {
        return assignment_id;
    }

    public void setAssignmentId(int assignment_id) {
        this.assignment_id = assignment_id;
    }

    public int[] getStudentIds() {
        return student_ids;
    }

    public void setStudentIds(int[] student_ids) {
        this.student_ids = student_ids;
    }

    public int getGroupId() {
        return group_id;
    }

    public void setGroupId(int group_id) {
        this.group_id = group_id;
    }

    public int getCourseSectionId() {
        return course_section_id;
    }

    public void setCourseSectionId(int course_section_id) {
        this.course_section_id = course_section_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDueAt() {
        return due_at;
    }

    public void setDueAt(Date due_at) {
        this.due_at = due_at;
    }

    public boolean isAllDay() {
        return all_day;
    }

    public void setAllDay(boolean all_day) {
        this.all_day = all_day;
    }

    public String getAllDayDate() {
        return all_day_date;
    }

    public void setAllDayDate(String all_day_date) {
        this.all_day_date = all_day_date;
    }

    public Date getUnlockAt() {
        return unlock_at;
    }

    public void setUnlockAt(Date unlock_at) {
        this.unlock_at = unlock_at;
    }

    public Date getLockAt() {
        return lock_at;
    }

    public void setLockAt(Date lock_at) {
        this.lock_at = lock_at;
    }
}
