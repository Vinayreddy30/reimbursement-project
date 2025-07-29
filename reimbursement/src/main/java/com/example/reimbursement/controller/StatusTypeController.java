package com.example.reimbursement.controller;

import com.example.reimbursement.entity.StatusType;
import com.example.reimbursement.service.StatusTypeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/status-types")
public class StatusTypeController {

    private final StatusTypeService statusTypeService;

    public StatusTypeController(StatusTypeService statusTypeService) {
        this.statusTypeService = statusTypeService;
    }

    @GetMapping
    public List<StatusType> getAll() {
        return statusTypeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StatusType> getById(@PathVariable("id") String id) {
        Optional<StatusType> statusType = statusTypeService.findById(id);
        return statusType.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public StatusType createOrUpdate(@RequestBody StatusType statusType) {
        return statusTypeService.save(statusType);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id) {
        statusTypeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
