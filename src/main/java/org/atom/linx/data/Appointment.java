package org.atom.linx.data;

import java.util.Date;

public class Appointment {
    public int id;
    public Date start_at;
    public Date end_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartAt() {
        return start_at;
    }

    public void setStartAt(Date start_at) {
        this.start_at = start_at;
    }

    public Date getEndAt() {
        return end_at;
    }

    public void setEndAt(Date end_at) {
        this.end_at = end_at;
    }
}
