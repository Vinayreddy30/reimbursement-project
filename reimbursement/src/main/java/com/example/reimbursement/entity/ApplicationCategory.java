package com.example.reimbursement.entity;

import lombok.Data;

import jakarta.persistence.*;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "M_RQST_TYP")
public class ApplicationCategory {

    @Id
    @Column(name = "RQST_TYP", length = 10)
    private String requestTypeCode;

    @Column(name = "RQST_NM", length = 100)
    private String requestName;

    @Column(name = "DSPLY_ORDR")
    private Integer displayOrder;

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
