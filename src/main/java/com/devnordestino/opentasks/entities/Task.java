package com.devnordestino.opentasks.entities;

import com.devnordestino.opentasks.enums.ClassificationTask;
import com.devnordestino.opentasks.enums.StatusTask;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String protocolNumber;
    private String title;
    private String description;
    private ClassificationTask classification;
    private StatusTask status;
    private Date created;
    private Date lastUpdate;
    private Integer version;
    @ManyToOne
    @JoinColumn(name = "assignee")
    private People assignee;
    @ManyToOne
    @JoinColumn(name = "reporter")
    private People reporter;

    public Task(){
        this.created = new Date();
        this.lastUpdate = new Date();
        this.version = 1;
    }

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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public People getAssignee() {
        return assignee;
    }

    public void setAssignee(People assignee) {
        this.assignee = assignee;
    }

    public People getReporter() {
        return reporter;
    }

    public void setReporter(People reporter) {
        this.reporter = reporter;
    }
}
