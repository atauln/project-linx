package org.atom.linx.data;

public class BlueprintRestriction {
    protected boolean content;
    protected boolean points;
    protected boolean due_dates;
    protected boolean availability_dates;

    public boolean isContent() {
        return content;
    }

    public void setContent(boolean content) {
        this.content = content;
    }

    public boolean isPoints() {
        return points;
    }

    public void setPoints(boolean points) {
        this.points = points;
    }

    public boolean isDueDates() {
        return due_dates;
    }

    public void setDueDates(boolean due_dates) {
        this.due_dates = due_dates;
    }

    public boolean isAvailabilityDates() {
        return availability_dates;
    }

    public void setAvailabilityDates(boolean availability_dates) {
        this.availability_dates = availability_dates;
    }
}
