package com.example.reimbursement.service;

import com.example.reimbursement.entity.ApplicationCategory;
import com.example.reimbursement.repository.ApplicationCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationCategoryService {
    private final ApplicationCategoryRepository repository;

    public ApplicationCategoryService(ApplicationCategoryRepository repository) {
        this.repository = repository;
    }

    public List<ApplicationCategory> findAll() {
        return repository.findAll();
    }

    public Optional<ApplicationCategory> findById(String requestTypeCode) {
        return repository.findById(requestTypeCode);
    }

    public ApplicationCategory save(ApplicationCategory category) {
        return repository.save(category);
    }

    public void deleteById(String requestTypeCode) {
        repository.deleteById(requestTypeCode);
    }
}
