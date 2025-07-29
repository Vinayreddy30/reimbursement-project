package com.example.reimbursement.service;

import com.example.reimbursement.entity.Project;
import com.example.reimbursement.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    private final ProjectRepository repository;

    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    public List<Project> findAll() {
        return repository.findAll();
    }

    public Optional<Project> findById(String projectCode) {
        return repository.findById(projectCode);
    }

    public Project save(Project project) {
        return repository.save(project);
    }

    public void deleteById(String projectCode) {
        repository.deleteById(projectCode);
    }
}
