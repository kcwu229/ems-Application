package com.study.demo.service;

import com.study.demo.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    // abstract method to create an employee
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    // abstract method to get an employee by id
    EmployeeDto getEmployeeById(Long employeeId);

    // abstract method to get all employees
    List<EmployeeDto> getAllEmployees();

    // abstract method to update an employee
    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);
}
