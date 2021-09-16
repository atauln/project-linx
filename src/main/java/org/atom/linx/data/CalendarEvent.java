package org.atom.linx.data;

import java.util.Date;

public class CalendarEvent {
    private int id;
    private String title;
    private Date start_at;
    private Date end_at;
    private String description;
    private String location_name;
    private String location_address;
    private String context_code;
    private Object effective_context_code;
    private String context_name;
    private String all_context_codes;
    private String workflow_state;
    private boolean hidden;
    private Object parent_event_id;
    private int child_events_count;
    private Object child_events;
    private String url;
    private String html_url;
    private String all_day_date;
    private boolean all_day;
    private Date created_at;
    private Date updated_at;
    private Object appointment_group_id;
    private Object appointment_group_url;
    private boolean own_reservation;
    private Object reserve_url;
    private boolean reserved;
    private String participant_type;
    private Object participants_per_appointment;
    private Object available_slots;
    private User user;
    private Object group;
    private boolean important_dates;

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

    public String getContextCode() {
        return context_code;
    }

    public void setContextCode(String context_code) {
        this.context_code = context_code;
    }

    public Object getEffectiveContextCode() {
        return effective_context_code;
    }

    public void setEffectiveContextCode(Object effective_context_code) {
        this.effective_context_code = effective_context_code;
    }

    public String getContextName() {
        return context_name;
    }

    public void setContextName(String context_name) {
        this.context_name = context_name;
    }

    public String getAllContextCodes() {
        return all_context_codes;
    }

    public void setAllContextCodes(String all_context_codes) {
        this.all_context_codes = all_context_codes;
    }

    public String getWorkflowState() {
        return workflow_state;
    }

    public void setWorkflowState(String workflow_state) {
        this.workflow_state = workflow_state;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public Object getParentEventId() {
        return parent_event_id;
    }

    public void setParentEventId(Object parent_event_id) {
        this.parent_event_id = parent_event_id;
    }

    public int getChildEventsCount() {
        return child_events_count;
    }

    public void setChildEventsCount(int child_events_count) {
        this.child_events_count = child_events_count;
    }

    public Object getChildEvents() {
        return child_events;
    }

    public void setChildEvents(Object child_events) {
        this.child_events = child_events;
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

    public String getAllDayDate() {
        return all_day_date;
    }

    public void setAllDayDate(String all_day_date) {
        this.all_day_date = all_day_date;
    }

    public boolean isAllDay() {
        return all_day;
    }

    public void setAllDay(boolean all_day) {
        this.all_day = all_day;
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

    public Object getAppointmentGroupId() {
        return appointment_group_id;
    }

    public void setAppointmentGroupId(Object appointment_group_id) {
        this.appointment_group_id = appointment_group_id;
    }

    public Object getAppointmentGroupUrl() {
        return appointment_group_url;
    }

    public void setAppointmentGroupUrl(Object appointment_group_url) {
        this.appointment_group_url = appointment_group_url;
    }

    public boolean isOwnReservation() {
        return own_reservation;
    }

    public void setOwnReservation(boolean own_reservation) {
        this.own_reservation = own_reservation;
    }

    public Object getReserveUrl() {
        return reserve_url;
    }

    public void setReserveUrl(Object reserve_url) {
        this.reserve_url = reserve_url;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public String getParticipantType() {
        return participant_type;
    }

    public void setParticipantType(String participant_type) {
        this.participant_type = participant_type;
    }

    public Object getParticipantsPerAppointment() {
        return participants_per_appointment;
    }

    public void setParticipantsPerAppointment(Object participants_per_appointment) {
        this.participants_per_appointment = participants_per_appointment;
    }

    public Object getAvailableSlots() {
        return available_slots;
    }

    public void setAvailableSlots(Object available_slots) {
        this.available_slots = available_slots;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Object getGroup() {
        return group;
    }

    public void setGroup(Object group) {
        this.group = group;
    }

    public boolean hasImportantDates() {
        return important_dates;
    }

    public void setImportantDates(boolean important_dates) {
        this.important_dates = important_dates;
    }
}
