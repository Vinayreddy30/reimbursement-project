package com.example.reimbursement.service;

import com.example.reimbursement.entity.ReimbursementSlip;
import com.example.reimbursement.repository.ReimbursementSlipRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReimbursementSlipService {
    private final ReimbursementSlipRepository repository;

    public ReimbursementSlipService(ReimbursementSlipRepository repository) {
        this.repository = repository;
    }

    public List<ReimbursementSlip> findAll() {
        return repository.findAll();
    }

    public Optional<ReimbursementSlip> findById(String pymntNo) {
        return repository.findById(pymntNo);
    }

    public ReimbursementSlip save(ReimbursementSlip slip) {
        return repository.save(slip);
    }

    public void deleteById(String pymntNo) {
        repository.deleteById(pymntNo);
    }
}
