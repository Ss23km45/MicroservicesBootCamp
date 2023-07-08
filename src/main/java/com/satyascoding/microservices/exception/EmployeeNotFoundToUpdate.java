package com.satyascoding.microservices.exception;

public class EmployeeNotFoundToUpdate extends RuntimeException{
    public EmployeeNotFoundToUpdate(String message) {
        super(message);
    }
}
