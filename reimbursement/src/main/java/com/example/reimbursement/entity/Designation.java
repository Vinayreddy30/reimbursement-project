package com.example.reimbursement.entity;

import lombok.Data;

import jakarta.persistence.*;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "TPSM_SHKKI")
public class Designation {

    @Id
    @Column(name = "SHKKI_CD", length = 20)
    private String designationCode;

    @Column(name = "SHKKI_NM", length = 100)
    private String designationName;

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
