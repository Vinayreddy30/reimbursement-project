package com.example.reimbursement.service;

import com.example.reimbursement.entity.Password;
import com.example.reimbursement.repository.PasswordRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PasswordService {
    private final PasswordRepository repository;

    public PasswordService(PasswordRepository repository) {
        this.repository = repository;
    }

    public List<Password> findAll() {
        return repository.findAll();
    }

    public Optional<Password> findById(String employeeCode) {
        return repository.findById(employeeCode);
    }

    public Password save(Password password) {
        return repository.save(password);
    }

    public void deleteById(String employeeCode) {
        repository.deleteById(employeeCode);
    }
}
