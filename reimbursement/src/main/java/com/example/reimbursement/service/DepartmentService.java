package com.example.reimbursement.service;

import com.example.reimbursement.entity.Department;
import com.example.reimbursement.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    private final DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    public List<Department> findAll() {
        return repository.findAll();
    }

    public Optional<Department> findById(String departmentCode) {
        return repository.findById(departmentCode);
    }

    public Department save(Department department) {
        return repository.save(department);
    }

    public void deleteById(String departmentCode) {
        repository.deleteById(departmentCode);
    }
}
