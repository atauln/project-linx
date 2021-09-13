package org.atom.linx.data;

public class BlueprintRestrictions {
    private boolean content;
    private boolean points;
    private boolean due_dates;
    private boolean availability_dates;

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
