package com.example.reimbursement.controller;

import com.example.reimbursement.entity.Password;
import com.example.reimbursement.service.PasswordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/passwords")
public class PasswordController {

    private final PasswordService passwordService;

    public PasswordController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    @GetMapping
    public List<Password> getAll() {
        return passwordService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Password> getById(@PathVariable("id") String id) {
        Optional<Password> password = passwordService.findById(id);
        return password.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Password createOrUpdate(@RequestBody Password password) {
        return passwordService.save(password);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id) {
        passwordService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
