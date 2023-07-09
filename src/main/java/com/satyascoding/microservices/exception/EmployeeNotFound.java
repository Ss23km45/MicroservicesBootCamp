package com.satyascoding.microservices.exception;

import org.springframework.http.HttpStatus;

public class EmployeeNotFound {
    private String reason;
    private HttpStatus status;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public EmployeeNotFound() {
    }

    public EmployeeNotFound(String reason, HttpStatus status) {
        this.reason = reason;
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
