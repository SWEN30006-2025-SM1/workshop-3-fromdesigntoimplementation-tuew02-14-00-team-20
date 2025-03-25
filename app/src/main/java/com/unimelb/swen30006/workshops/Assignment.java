package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Assignment {
    private String description;
    private String name;
    private Date dueDate;
    private Integer maxAttempts;

    public Assignment(String description, String name, Date dueDate, Integer maxAttempts) {
        this.description = description;
        this.name = name;
        this.dueDate = dueDate;
        this.maxAttempts = maxAttempts;
    }

    public Submission[] invalidSubmissions() {
        /* Implementation */
        return null;
    }

    public Submission[] validSubmissions() {
        /* Implementation */
        return null;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Integer getMaxAttempts() {
        return maxAttempts;
    }

    public void setMaxAttempts(Integer maxAttempts) {
        this.maxAttempts = maxAttempts;
    }
}
