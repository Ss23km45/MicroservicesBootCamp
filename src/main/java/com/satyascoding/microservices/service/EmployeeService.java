package com.satyascoding.microservices.service;

import com.satyascoding.microservices.model.UpdateEmp;
import com.satyascoding.microservices.model.Employee;

import java.util.List;


public interface EmployeeService {
    public Employee createEmployee(Employee employee);

    List<Employee> getEmployeeList();

    Employee updateEmployee(UpdateEmp updateEmp);
}
