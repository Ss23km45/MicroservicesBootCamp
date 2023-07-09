package com.satyascoding.microservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_data")
public class EmployeeEntity {

    private String empExp;
    private String empSal;
    private String empDept;
    private String empEmail;
    private String empLName;
    @Id
    private String empId;
    private String empFName;

    public String getEmpExp() {
        return empExp;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "empExp='" + empExp + '\'' +
                ", empSal='" + empSal + '\'' +
                ", empDept='" + empDept + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empLName='" + empLName + '\'' +
                ", empId='" + empId + '\'' +
                ", empFName='" + empFName + '\'' +
                '}';
    }

    public void setEmpExp(String empExp) {
        this.empExp = empExp;
    }

    public String getEmpSal() {
        return empSal;
    }

    public void setEmpSal(String empSal) {
        this.empSal = empSal;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpLName() {
        return empLName;
    }

    public void setEmpLName(String empLName) {
        this.empLName = empLName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpFName() {
        return empFName;
    }

    public void setEmpFName(String empFName) {
        this.empFName = empFName;
    }

}
