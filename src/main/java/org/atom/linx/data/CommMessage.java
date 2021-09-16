package org.atom.linx.data;

import java.util.Date;

public class CommMessage {
    private int id;
    private Date created_at;
    private Date sent_at;
    private String workflow_state;
    private String from;
    private String from_name;
    private String to;
    private String reply_to;
    private String subject;
    private String body;
    private String html_body;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(Date created_at) {
        this.created_at = created_at;
    }

    public Date getSentAt() {
        return sent_at;
    }

    public void setSentAt(Date sent_at) {
        this.sent_at = sent_at;
    }

    public String getWorkflowState() {
        return workflow_state;
    }

    public void setWorkflowState(String workflow_state) {
        this.workflow_state = workflow_state;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFromName() {
        return from_name;
    }

    public void setFromName(String from_name) {
        this.from_name = from_name;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getReplyTo() {
        return reply_to;
    }

    public void setReplyTo(String reply_to) {
        this.reply_to = reply_to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHtmlBody() {
        return html_body;
    }

    public void setHtmlBody(String html_body) {
        this.html_body = html_body;
    }
}
