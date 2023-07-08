package com.satyascoding.microservices.errorhandler;

import com.satyascoding.microservices.exception.EmployeeNotFound;
import com.satyascoding.microservices.exception.EmployeeNotFoundException;
import com.satyascoding.microservices.exception.EmployeeNotFoundToUpdate;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerEntityExceptionHandler extends ResponseEntityExceptionHandler {



    //As and when EmployeeNotFoundException.class thrown below method will be triggered to
    //respond back with proper details.
    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public EmployeeNotFound returnStatusofEmployeeSearch(EmployeeNotFoundException exception){
            EmployeeNotFound employeeNotFound = new EmployeeNotFound(exception.getMessage(), HttpStatus.NOT_FOUND);
        return employeeNotFound;
    }

    @ExceptionHandler(EmployeeNotFoundToUpdate.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.ALREADY_REPORTED)
    public EmployeeNotFound returnStatusofEmployeetoUpdate(EmployeeNotFoundToUpdate exception){
        EmployeeNotFound employeeNotFound = new EmployeeNotFound(exception.getMessage(), HttpStatus.NOT_FOUND);
        return employeeNotFound;
    }
}
