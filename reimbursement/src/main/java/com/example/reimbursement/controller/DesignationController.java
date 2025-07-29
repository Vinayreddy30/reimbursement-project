package com.example.reimbursement.controller;

import com.example.reimbursement.entity.Designation;
import com.example.reimbursement.service.DesignationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/designations")
public class DesignationController {

    private final DesignationService designationService;

    public DesignationController(DesignationService designationService) {
        this.designationService = designationService;
    }

    @GetMapping
    public List<Designation> getAll() {
        return designationService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Designation> getById(@PathVariable("id") String id) {
        Optional<Designation> desig = designationService.findById(id);
        return desig.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Designation createOrUpdate(@RequestBody Designation desig) {
        return designationService.save(desig);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id) {
        designationService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
