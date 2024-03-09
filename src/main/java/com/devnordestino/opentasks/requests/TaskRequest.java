package com.devnordestino.opentasks.requests;

import com.devnordestino.opentasks.enums.ClassificationTask;
import com.devnordestino.opentasks.enums.StatusTask;

import java.util.Date;

public class TaskRequest {
    private Long id;
    private String protocolNumber;
    private String title;
    private String description;
    private ClassificationTask classification;
    private StatusTask status;
    private Long assignee_id;
    private Long reporter_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProtocolNumber() {
        return protocolNumber;
    }

    public void setProtocolNumber(String protocolNumber) {
        this.protocolNumber = protocolNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ClassificationTask getClassification() {
        return classification;
    }

    public void setClassification(ClassificationTask classification) {
        this.classification = classification;
    }

    public StatusTask getStatus() {
        return status;
    }

    public void setStatus(StatusTask status) {
        this.status = status;
    }

    public Long getAssignee_id() {
        return assignee_id;
    }

    public void setAssignee_id(Long assignee_id) {
        this.assignee_id = assignee_id;
    }

    public Long getReporter_id() {
        return reporter_id;
    }

    public void setReporter_id(Long reporter_id) {
        this.reporter_id = reporter_id;
    }
}
