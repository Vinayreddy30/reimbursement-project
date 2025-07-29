package com.example.reimbursement.service;

import com.example.reimbursement.entity.StatusType;
import com.example.reimbursement.repository.StatusTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusTypeService {
    private final StatusTypeRepository repository;

    public StatusTypeService(StatusTypeRepository repository) {
        this.repository = repository;
    }

    public List<StatusType> findAll() {
        return repository.findAll();
    }

    public Optional<StatusType> findById(String statusTypeCode) {
        return repository.findById(statusTypeCode);
    }

    public StatusType save(StatusType statusType) {
        return repository.save(statusType);
    }

    public void deleteById(String statusTypeCode) {
        repository.deleteById(statusTypeCode);
    }
}
