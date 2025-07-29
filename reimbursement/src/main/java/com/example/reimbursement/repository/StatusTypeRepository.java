package com.example.reimbursement.repository;

import com.example.reimbursement.entity.StatusType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusTypeRepository extends JpaRepository<StatusType, String> {
}
