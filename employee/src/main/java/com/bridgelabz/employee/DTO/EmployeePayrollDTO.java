package com.bridgelabz.employee.DTO;

public class EmployeePayrollDTO {
    
    public int empId;
    public String name;
    public long salary;

    /**
     *
     * @param name
     * @param salary
     */

    public EmployeePayrollDTO(String name, long salary) {
        // this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    
    @Override
    public String toString() {
        return (/* "empId=" + empId+ */ "name=" + name + ":salary=" + salary);
    }

}
