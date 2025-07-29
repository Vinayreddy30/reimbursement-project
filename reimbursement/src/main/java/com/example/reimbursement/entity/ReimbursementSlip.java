package com.example.reimbursement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "T_PYMNT")
public class ReimbursementSlip {

    @Id
    @Column(name = "PYMNT_NO", nullable = false, length = 20)
    private String pymntNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMP_NO", referencedColumnName = "SYIN_CD")
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STTS_TYP", referencedColumnName = "STTS_TYP")
    private StatusType statusType;

    @Column(name = "ACCNT_DPT_CD", length = 10)
    private String accountingDepartmentCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RQST_TYP", referencedColumnName = "RQST_TYP")
    private ApplicationCategory applicationCategory;

    @Column(name = "PAYEE", length = 200)
    private String payee;

    @Column(name = "PYMNT_DT")
    private LocalDate paymentDate;

    @Column(name = "USR_CD", length = 20)
    private String userCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRJCT_CD", referencedColumnName = "PRJCT_CD")
    private Project project;

    @Column(name = "PYMNT_RMRKS", length = 200)
    private String paymentRemarks;

    @Column(name = "TTL_AMNT", precision = 15, scale = 2)
    private BigDecimal totalAmount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "APPRV_EMP_NO", referencedColumnName = "SYIN_CD")
    private Employee approverEmployee;

    @Column(name = "APPRV_DT")
    private LocalDate approvalDate;

    @Column(name = "RJCT_RMRKS", length = 200)
    private String rejectRemarks;

    @Column(name = "CRT_EMP_NO", length = 20)
    private String createdBy;

    @Column(name = "CRT_DT")
    private LocalDate createdDate;

    @Column(name = "UPD_EMP_NO", length = 20)
    private String updatedBy;

    @Column(name = "UPD_DT")
    private LocalDate updatedDate;

    @Column(name = "DEL_FLG", length = 1)
    private String deleteFlag; // usually '0' or '1'
}
