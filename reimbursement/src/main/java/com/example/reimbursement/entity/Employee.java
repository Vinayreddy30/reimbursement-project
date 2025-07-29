package com.example.reimbursement.entity;

import lombok.Data;

import jakarta.persistence.*;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "TPSM_SYIN")
public class Employee {

    @Id
    @Column(name = "SYIN_CD", length = 20)
    private String employeeCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHKKI", referencedColumnName = "SHKKI_CD")
    private Designation designation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHZK_BMN_CD", referencedColumnName = "SHZK_BMN_CD")
    private Department department;

    @Column(name = "SYIN_SHMI", length = 100)
    private String employeeName;

    @Column(name = "CRT_EMP_NO", length = 20)
    private String createdBy;

    @Column(name = "CRT_DT")
    private LocalDate createdDate;

    @Column(name = "UPD_EMP_NO", length = 20)
    private String updatedBy;

    @Column(name = "UPD_DT")
    private LocalDate updatedDate;

    @Column(name = "DEL_FLG", length = 1)
    private String deleteFlag;
}
