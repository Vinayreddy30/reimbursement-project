package com.example.reimbursement.controller;

import com.example.reimbursement.entity.ApplicationCategory;
import com.example.reimbursement.service.ApplicationCategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/application-categories")
public class ApplicationCategoryController {

    private final ApplicationCategoryService applicationCategoryService;

    public ApplicationCategoryController(ApplicationCategoryService applicationCategoryService) {
        this.applicationCategoryService = applicationCategoryService;
    }

    @GetMapping
    public List<ApplicationCategory> getAll() {
        return applicationCategoryService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApplicationCategory> getById(@PathVariable("id") String id) {
        Optional<ApplicationCategory> category = applicationCategoryService.findById(id);
        return category.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ApplicationCategory createOrUpdate(@RequestBody ApplicationCategory category) {
        return applicationCategoryService.save(category);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id) {
        applicationCategoryService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
