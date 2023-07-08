package com.satyascoding.microservices.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"empSal"})
public class Employee {

    private String empFName;

    @Override
    public String toString() {
        return "Employee{" +
                "EmpFName='" + empFName + '\'' +
                ", EmpExp='" + empExp + '\'' +
                ", EmpSal='" + empSal + '\'' +
                ", EmpDept='" + empDept + '\'' +
                ", EmpEmail='" + empEmail + '\'' +
                ", EmpLName='" + empLName + '\'' +
                ", EmpId='" + empId + '\'' +
                '}';
    }

    private String empExp;
    private String empSal;
    private String empDept;
    private String empEmail;
    private String empLName;
    private String empId;

    public String getEmpFName() {
        return empFName;
    }

    public void setEmpFName(String empFName) {
        this.empFName = empFName;
    }

    public String getEmpExp() {
        return empExp;
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
}
