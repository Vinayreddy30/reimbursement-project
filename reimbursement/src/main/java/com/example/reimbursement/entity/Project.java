package com.example.reimbursement.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "TPSM_PROJECT")
public class Project {

    @Id
    @Column(name = "PRJCT_CD", length = 20)
    private String projectCode;

    @Column(name = "USR_CD", length = 20)
    private String userCode;

    @Column(name = "SHZK_BMN_CD", length = 20)
    private String departmentCode;

    @Column(name = "PRJCT_NM", length = 100)
    private String projectName;

    @Column(name = "PRJCT_STRT_DT")
    private LocalDate projectStartDate;

    @Column(name = "PRJCT_END_DT")
    private LocalDate projectEndDate;

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
