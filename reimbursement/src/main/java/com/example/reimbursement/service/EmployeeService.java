package com.example.reimbursement.service;

import com.example.reimbursement.entity.Employee;
import com.example.reimbursement.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> findAll() {
        return repository.findAll();
    }

    public Optional<Employee> findById(String employeeCode) {
        return repository.findById(employeeCode);
    }

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public void deleteById(String employeeCode) {
        repository.deleteById(employeeCode);
    }
}
