package com.example.reimbursement.controller;

import com.example.reimbursement.entity.Department;
import com.example.reimbursement.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<Department> getAll() {
        return departmentService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getById(@PathVariable("id") String id) {
        Optional<Department> dep = departmentService.findById(id);
        return dep.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Department createOrUpdate(@RequestBody Department dep) {
        return departmentService.save(dep);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id) {
        departmentService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
