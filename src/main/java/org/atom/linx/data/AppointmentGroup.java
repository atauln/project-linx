package org.atom.linx.data;

import java.util.Date;

class ReservedTime {
    public int id;
    public Date start_at;
    public Date end_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStart_at() {
        return start_at;
    }

    public void setStart_at(Date start_at) {
        this.start_at = start_at;
    }

    public Date getEnd_at() {
        return end_at;
    }

    public void setEnd_at(Date end_at) {
        this.end_at = end_at;
    }
}

public class AppointmentGroup {
    public int id;
    public String title;
    public Date start_at;
    public Date end_at;
    public String description;
    public String location_name;
    public String location_address;
    public int participant_count;
    public ReservedTime[] reserved_times;
    public String[] context_codes;
    public String[] sub_context_codes;
    public String workflow_state;
    public boolean requiring_action;
    public int appointments_count;
    public Appointment[] appointments;
    public Appointment[] new_appointments;
    public int max_appointments_per_participant;
    public int min_appointments_per_participant;
    public int participants_per_appointment;
    public String participant_visibility;
    public String participant_type;
    public String url;
    public String html_url;
    public Date created_at;
    public Date updated_at;

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

    public Date getStart_at() {
        return start_at;
    }

    public void setStart_at(Date start_at) {
        this.start_at = start_at;
    }

    public Date getEnd_at() {
        return end_at;
    }

    public void setEnd_at(Date end_at) {
        this.end_at = end_at;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public String getLocation_address() {
        return location_address;
    }

    public void setLocation_address(String location_address) {
        this.location_address = location_address;
    }

    public int getParticipant_count() {
        return participant_count;
    }

    public void setParticipant_count(int participant_count) {
        this.participant_count = participant_count;
    }

    public ReservedTime[] getReserved_times() {
        return reserved_times;
    }

    public void setReserved_times(ReservedTime[] reserved_times) {
        this.reserved_times = reserved_times;
    }

    public String[] getContext_codes() {
        return context_codes;
    }

    public void setContext_codes(String[] context_codes) {
        this.context_codes = context_codes;
    }

    public String[] getSub_context_codes() {
        return sub_context_codes;
    }

    public void setSub_context_codes(String[] sub_context_codes) {
        this.sub_context_codes = sub_context_codes;
    }

    public String getWorkflow_state() {
        return workflow_state;
    }

    public void setWorkflow_state(String workflow_state) {
        this.workflow_state = workflow_state;
    }

    public boolean isRequiring_action() {
        return requiring_action;
    }

    public void setRequiring_action(boolean requiring_action) {
        this.requiring_action = requiring_action;
    }

    public int getAppointments_count() {
        return appointments_count;
    }

    public void setAppointments_count(int appointments_count) {
        this.appointments_count = appointments_count;
    }

    public Appointment[] getAppointments() {
        return appointments;
    }

    public void setAppointments(Appointment[] appointments) {
        this.appointments = appointments;
    }

    public Appointment[] getNew_appointments() {
        return new_appointments;
    }

    public void setNew_appointments(Appointment[] new_appointments) {
        this.new_appointments = new_appointments;
    }

    public int getMax_appointments_per_participant() {
        return max_appointments_per_participant;
    }

    public void setMax_appointments_per_participant(int max_appointments_per_participant) {
        this.max_appointments_per_participant = max_appointments_per_participant;
    }

    public int getMin_appointments_per_participant() {
        return min_appointments_per_participant;
    }

    public void setMin_appointments_per_participant(int min_appointments_per_participant) {
        this.min_appointments_per_participant = min_appointments_per_participant;
    }

    public int getParticipants_per_appointment() {
        return participants_per_appointment;
    }

    public void setParticipants_per_appointment(int participants_per_appointment) {
        this.participants_per_appointment = participants_per_appointment;
    }

    public String getParticipant_visibility() {
        return participant_visibility;
    }

    public void setParticipant_visibility(String participant_visibility) {
        this.participant_visibility = participant_visibility;
    }

    public String getParticipant_type() {
        return participant_type;
    }

    public void setParticipant_type(String participant_type) {
        this.participant_type = participant_type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
