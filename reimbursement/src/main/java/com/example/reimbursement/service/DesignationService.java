package com.example.reimbursement.service;

import com.example.reimbursement.entity.Designation;
import com.example.reimbursement.repository.DesignationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DesignationService {
    private final DesignationRepository repository;

    public DesignationService(DesignationRepository repository) {
        this.repository = repository;
    }

    public List<Designation> findAll() {
        return repository.findAll();
    }

    public Optional<Designation> findById(String designationCode) {
        return repository.findById(designationCode);
    }

    public Designation save(Designation designation) {
        return repository.save(designation);
    }

    public void deleteById(String designationCode) {
        repository.deleteById(designationCode);
    }
}
