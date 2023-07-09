package com.satyascoding.microservices.exception;

import org.springframework.dao.DataAccessException;

public class UnableToInsertToDbException extends DataAccessException {
    public UnableToInsertToDbException(String msg) {
        super(msg);
    }
}
