package com.devnordestino.opentasks.requests;

import com.devnordestino.opentasks.enums.ClassificationTask;
import com.devnordestino.opentasks.enums.StatusTask;

public class TaskRequest {
    private Long id;
    private String protocolNumber;
    private String title;
    private String description;
    private ClassificationTask classification;
    private StatusTask status;
    private Long user;

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

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }
}
