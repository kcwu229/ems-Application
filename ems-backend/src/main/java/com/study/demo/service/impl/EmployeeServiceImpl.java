package com.study.demo.service.impl;

import com.study.demo.dto.EmployeeDto;
import com.study.demo.entity.Employee;
import com.study.demo.exception.ResourceNotFoundException;
import com.study.demo.mapper.EmployeeMapper;
import com.study.demo.repository.EmployeeRepository;
import com.study.demo.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    // To access the database
    private EmployeeRepository employeeRepository;

    // To save the employee details in the database
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee saveEmployee = employeeRepository.save(employee);

        // To map the saved employee details to EmployeeDto
        return EmployeeMapper.mapToEmployeeDto(saveEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                () -> new ResourceNotFoundException("Employee not found for this id : " + employeeId)
        );
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map((employee) -> EmployeeMapper.mapToEmployeeDto(employee)).toList();
    }

    @Override
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto employeeToUpdate) {
        // search by id and update the employee details
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                () -> new ResourceNotFoundException("Employee not found for this id : " + employeeId)
        );
        employee.setFirstName(employeeToUpdate.getFirstName());
        employee.setLastName(employeeToUpdate.getLastName());
        employee.setEmail(employeeToUpdate.getEmail());
        Employee updatedEmployeeObj = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(updatedEmployeeObj);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                () -> new ResourceNotFoundException("Employee not found for this id : " + employeeId)
        );

        employeeRepository.deleteById(employeeId);
    }
}
