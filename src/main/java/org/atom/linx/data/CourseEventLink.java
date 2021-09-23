package org.atom.linx.data;

public class CourseEventLink {
    protected int course;
    protected int user;
    protected String page_view;
    protected int copied_from;
    protected int copied_to;
    protected int sis_batch;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public String getPageView() {
        return page_view;
    }

    public void setPageView(String page_view) {
        this.page_view = page_view;
    }

    public int getCopiedFrom() {
        return copied_from;
    }

    public void setCopiedFrom(int copied_from) {
        this.copied_from = copied_from;
    }

    public int getCopiedTo() {
        return copied_to;
    }

    public void setCopiedTo(int copied_to) {
        this.copied_to = copied_to;
    }

    public int getSisBatch() {
        return sis_batch;
    }

    public void setSisBatch(int sis_batch) {
        this.sis_batch = sis_batch;
    }
}
