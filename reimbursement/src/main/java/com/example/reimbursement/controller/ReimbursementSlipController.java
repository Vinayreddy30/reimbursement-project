package com.example.reimbursement.controller;

import com.example.reimbursement.entity.ReimbursementSlip;
import com.example.reimbursement.service.ReimbursementSlipService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reimbursement-slips")
public class ReimbursementSlipController {

    private final ReimbursementSlipService reimbursementSlipService;

    public ReimbursementSlipController(ReimbursementSlipService reimbursementSlipService) {
        this.reimbursementSlipService = reimbursementSlipService;
    }

    // Get all slips
    @GetMapping
    public List<ReimbursementSlip> getAll() {
        return reimbursementSlipService.findAll();
    }

    // Get slip by ID
    @GetMapping("/{id}")
    public ResponseEntity<ReimbursementSlip> getById(@PathVariable("id") String id) {
        Optional<ReimbursementSlip> slip = reimbursementSlipService.findById(id);
        return slip.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create or update slip
    @PostMapping
    public ReimbursementSlip createOrUpdate(@RequestBody ReimbursementSlip slip) {
        return reimbursementSlipService.save(slip);
    }

    // Delete slip by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id) {
        reimbursementSlipService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
