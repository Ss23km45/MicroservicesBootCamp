package com.satyascoding.microservices.service.impl;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.satyascoding.microservices.entity.EmployeeEntity;
import com.satyascoding.microservices.exception.EmployeeNotFoundException;
import com.satyascoding.microservices.exception.EmployeeNotFoundToUpdate;
import com.satyascoding.microservices.exception.UnableToInsertToDbException;
import com.satyascoding.microservices.model.Employee;
import com.satyascoding.microservices.model.UpdateEmp;
import com.satyascoding.microservices.repository.EmployeeEntityRepository;
import com.satyascoding.microservices.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImplV2 implements EmployeeService {

    @Autowired
    EmployeeEntityRepository employeeEntityRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        employee.setEmpId(UUID.randomUUID().toString());
        EmployeeEntity employeeEntity = new EmployeeEntity();
        System.out.println("Employee Created " + employee);
        BeanUtils.copyProperties(employee, employeeEntity);
        System.out.println("Employee Created " + employeeEntity);
        try{
            employeeEntityRepository.save(employeeEntity);
        }catch(DataAccessException e){
            throw new UnableToInsertToDbException("Unable to Insert Values some issue occured." + HttpStatus.UNPROCESSABLE_ENTITY);
        }



        return employee;
    }

    @Override
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee();
        List<EmployeeEntity> empList = employeeEntityRepository.findAll();

        employees = empList.stream().map(emp-> { BeanUtils.copyProperties(emp, employee);
            return employee;
        }).collect(Collectors.toList());
        System.out.println(employees);

        return employees;

    }

    @Override
    public Employee updateEmployee(UpdateEmp updateEmp) {

        Employee emp = new Employee();
        EmployeeEntity employee = getEmployeeById(updateEmp.getEmpId());
        employee.setEmpEmail(updateEmp.getEmpEmail());
        employeeEntityRepository.save(employee);
        BeanUtils.copyProperties(employee, emp);
        return emp;
    }

    @Override
    public Employee returnEmployee(String empID) {
        Employee emp = new Employee();
        EmployeeEntity employee = getEmployeeById(empID);
        BeanUtils.copyProperties(employee, emp);
        return emp;
    }

    private EmployeeEntity getEmployeeById(String empID){
        Optional<EmployeeEntity> empEntity = employeeEntityRepository.findById(empID);
        EmployeeEntity employee = empEntity.get();

        return employee;
    }
}
