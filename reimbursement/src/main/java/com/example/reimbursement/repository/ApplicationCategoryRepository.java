package com.example.reimbursement.repository;

import com.example.reimbursement.entity.ApplicationCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationCategoryRepository extends JpaRepository<ApplicationCategory, String> {
}
