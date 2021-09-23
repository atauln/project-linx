package org.atom.linx.data;

class BlueprintCourse {
    protected int id;
    protected String name;
    protected String course_code;
    protected String term_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseCode() {
        return course_code;
    }

    public void setCourseCode(String course_code) {
        this.course_code = course_code;
    }

    public String getTermName() {
        return term_name;
    }

    public void setTermName(String term_name) {
        this.term_name = term_name;
    }
}

public class BlueprintSubscription {
    protected int id;
    protected int template_id;
    protected BlueprintCourse blueprint_course;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTemplateId() {
        return template_id;
    }

    public void setTemplateId(int template_id) {
        this.template_id = template_id;
    }

    public BlueprintCourse getBlueprintCourse() {
        return blueprint_course;
    }

    public void setBlueprintCourse(BlueprintCourse blueprint_course) {
        this.blueprint_course = blueprint_course;
    }
}
