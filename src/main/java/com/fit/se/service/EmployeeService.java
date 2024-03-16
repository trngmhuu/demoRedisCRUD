package com.fit.se.service;

import com.fit.se.entity.Employee;
import com.fit.se.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees(){

        List<Employee> employees = new ArrayList<>();
        for (Employee tempEmployee : employeeRepository.findAll()) {
            employees.add(tempEmployee);
        }
        return employees;
    }

    public Employee getEmployeeById(int id){
        Optional<Employee> optionalEmployee = employeeRepository.findById(String.valueOf(id));
        return optionalEmployee.orElse(null);
    }

    public void deleteEmployeeById(int id){
        employeeRepository.deleteById(String.valueOf(id));
    }
}
