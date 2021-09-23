package org.atom.linx.data;

import java.util.Date;

class ReservedTime {
    protected int id;
    protected Date start_at;
    protected Date end_at;

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

public class AppointmentGroup {
    protected int id;
    protected String title;
    protected Date start_at;
    protected Date end_at;
    protected String description;
    protected String location_name;
    protected String location_address;
    protected int participant_count;
    protected ReservedTime[] reserved_times;
    protected String[] context_codes;
    protected String[] sub_context_codes;
    protected String workflow_state;
    protected boolean requiring_action;
    protected int appointments_count;
    protected Appointment[] appointments;
    protected Appointment[] new_appointments;
    protected int max_appointments_per_participant;
    protected int min_appointments_per_participant;
    protected int participants_per_appointment;
    protected String participant_visibility;
    protected String participant_type;
    protected String url;
    protected String html_url;
    protected Date created_at;
    protected Date updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocationName() {
        return location_name;
    }

    public void setLocationName(String location_name) {
        this.location_name = location_name;
    }

    public String getLocationAddress() {
        return location_address;
    }

    public void setLocationAddress(String location_address) {
        this.location_address = location_address;
    }

    public int getParticipantCount() {
        return participant_count;
    }

    public void setParticipantCount(int participant_count) {
        this.participant_count = participant_count;
    }

    public ReservedTime[] getReservedTimes() {
        return reserved_times;
    }

    public void setReservedTimes(ReservedTime[] reserved_times) {
        this.reserved_times = reserved_times;
    }

    public String[] getContextCodes() {
        return context_codes;
    }

    public void setContextCodes(String[] context_codes) {
        this.context_codes = context_codes;
    }

    public String[] getSubContextCodes() {
        return sub_context_codes;
    }

    public void setSubContextCodes(String[] sub_context_codes) {
        this.sub_context_codes = sub_context_codes;
    }

    public String getWorkflowState() {
        return workflow_state;
    }

    public void setWorkflowState(String workflow_state) {
        this.workflow_state = workflow_state;
    }

    public boolean isRequiring_action() {
        return requiring_action;
    }

    public void setRequiringAction(boolean requiring_action) {
        this.requiring_action = requiring_action;
    }

    public int getAppointmentsCount() {
        return appointments_count;
    }

    public void setAppointmentsCount(int appointments_count) {
        this.appointments_count = appointments_count;
    }

    public Appointment[] getAppointments() {
        return appointments;
    }

    public void setAppointments(Appointment[] appointments) {
        this.appointments = appointments;
    }

    public Appointment[] getNewAppointments() {
        return new_appointments;
    }

    public void setNewAppointments(Appointment[] new_appointments) {
        this.new_appointments = new_appointments;
    }

    public int getMaxAppointmentsPerParticipant() {
        return max_appointments_per_participant;
    }

    public void setMaxAppointmentsPerParticipant(int max_appointments_per_participant) {
        this.max_appointments_per_participant = max_appointments_per_participant;
    }

    public int getMinAppointmentsPerParticipant() {
        return min_appointments_per_participant;
    }

    public void setMinAppointmentsPerParticipant(int min_appointments_per_participant) {
        this.min_appointments_per_participant = min_appointments_per_participant;
    }

    public int getParticipantsPerAppointment() {
        return participants_per_appointment;
    }

    public void setParticipantsPerAppointment(int participants_per_appointment) {
        this.participants_per_appointment = participants_per_appointment;
    }

    public String getParticipantVisibility() {
        return participant_visibility;
    }

    public void setParticipantVisibility(String participant_visibility) {
        this.participant_visibility = participant_visibility;
    }

    public String getParticipantType() {
        return participant_type;
    }

    public void setParticipantType(String participant_type) {
        this.participant_type = participant_type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtmlUrl() {
        return html_url;
    }

    public void setHtmlUrl(String html_url) {
        this.html_url = html_url;
    }

    public Date getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdatedAt() {
        return updated_at;
    }

    public void setUpdatedAt(Date updated_at) {
        this.updated_at = updated_at;
    }
}
