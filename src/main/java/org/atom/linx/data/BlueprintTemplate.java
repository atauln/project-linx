package org.atom.linx.data;

import java.util.Date;

public class BlueprintTemplate {
    protected int id;
    protected int course_id;
    protected Date last_export_completed_at;
    protected int associated_course_count;
    protected BlueprintMigration latest_migration;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseId() {
        return course_id;
    }

    public void setCourseId(int course_id) {
        this.course_id = course_id;
    }

    public Date getLastExportCompletedAt() {
        return last_export_completed_at;
    }

    public void setLastExportCompletedAt(Date last_export_completed_at) {
        this.last_export_completed_at = last_export_completed_at;
    }

    public int getAssociatedCourseCount() {
        return associated_course_count;
    }

    public void setAssociatedCourseCount(int associated_course_count) {
        this.associated_course_count = associated_course_count;
    }

    public BlueprintMigration getLatestMigration() {
        return latest_migration;
    }

    public void setLatestMigration(BlueprintMigration latest_migration) {
        this.latest_migration = latest_migration;
    }
}
