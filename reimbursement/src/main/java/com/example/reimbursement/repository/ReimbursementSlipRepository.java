package com.example.reimbursement.repository;

import com.example.reimbursement.entity.ReimbursementSlip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReimbursementSlipRepository extends JpaRepository<ReimbursementSlip, String> {
    // Add custom queries if needed, e.g.:
    // List<ReimbursementSlip> findByEmployee_EmployeeCode(String empNo);
}
