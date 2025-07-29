package com.example.reimbursement.entity;

import lombok.Data;

import jakarta.persistence.*;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "M_STTS_TYP")
public class StatusType {

    @Id
    @Column(name = "STTS_TYP", length = 10)
    private String statusTypeCode;

    @Column(name = "STTS_NM", length = 50)
    private String statusName;

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
