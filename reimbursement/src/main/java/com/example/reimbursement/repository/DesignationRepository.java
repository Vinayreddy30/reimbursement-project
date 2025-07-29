package com.example.reimbursement.repository;

import com.example.reimbursement.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepository extends JpaRepository<Designation, String> {
}
