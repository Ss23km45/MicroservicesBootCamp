package com.satyascoding.microservices.controller;

import com.satyascoding.microservices.model.UpdateEmp;
import com.satyascoding.microservices.model.Employee;
import com.satyascoding.microservices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee createEmployee(@RequestBody Employee employee){
        System.out.println(employee);

        Employee emp = employeeService.createEmployee(employee);

        return emp;
    }

    @GetMapping("/allEmployees")
    public List<Employee> getAllEmployee(){
        List<Employee> empList = employeeService.getEmployeeList();

        return empList;
    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody UpdateEmp updateEmp){
        Employee employee = employeeService.updateEmployee(updateEmp);


        return employee;
    }

    @GetMapping("/returnEmployee/{empID}")
    public Employee returnEmployee(@PathVariable String empID){
        Employee employee = employeeService.returnEmployee(empID);


        return employee;
    }
}
