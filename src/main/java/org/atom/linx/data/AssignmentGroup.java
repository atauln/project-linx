package org.atom.linx.data;

public class AssignmentGroup {
    public int id;
    public String name;
    public int position;
    public int group_weight;
    public String sis_source_id;
    public Object integration_data;
    public Assignment[] assignments;
    public Object rules;

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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getGroupWeight() {
        return group_weight;
    }

    public void setGroupWeight(int group_weight) {
        this.group_weight = group_weight;
    }

    public String getSisSourceId() {
        return sis_source_id;
    }

    public void setSisSourceId(String sis_source_id) {
        this.sis_source_id = sis_source_id;
    }

    public Object getIntegrationData() {
        return integration_data;
    }

    public void setIntegrationData(Object integration_data) {
        this.integration_data = integration_data;
    }

    public Assignment[] getAssignments() {
        return assignments;
    }

    public void setAssignments(Assignment[] assignments) {
        this.assignments = assignments;
    }

    public Object getRules() {
        return rules;
    }

    public void setRules(Object rules) {
        this.rules = rules;
    }
}
