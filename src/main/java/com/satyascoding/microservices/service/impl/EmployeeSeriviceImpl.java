package com.satyascoding.microservices.service.impl;

import com.satyascoding.microservices.model.Employee;
import com.satyascoding.microservices.model.UpdateEmp;
import com.satyascoding.microservices.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class EmployeeSeriviceImpl implements EmployeeService {
    private static List<Employee> allEmployees = new ArrayList<Employee>();
    @Override
    public Employee createEmployee(Employee employee) {
        if( employee.getEmpId() == null || employee.getEmpId().isEmpty()){
            employee.setEmpId(UUID.randomUUID().toString());
        }

        allEmployees.add(employee);

        System.out.println("Employee Created " + employee);
        return employee;
    }

    @Override
    public List<Employee> getEmployeeList() {
        return allEmployees;
    }

    @Override
    public Employee updateEmployee(UpdateEmp updateEmp) {
        List<Employee> employeeList;
        employeeList = allEmployees.stream()
                .filter(emp -> emp.getEmpId().equalsIgnoreCase(updateEmp.getEmpId()))
                .collect(Collectors.toList());
        employeeList.get(0).setEmpEmail(updateEmp.getEmpEmail());
        return employeeList.get(0);
    }
}
