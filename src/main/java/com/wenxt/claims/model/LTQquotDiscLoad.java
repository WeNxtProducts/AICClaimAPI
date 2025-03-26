package com.wenxt.claims.model;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "LT_QQUOT_DISC_LOAD")
@Data
public class LTQquotDiscLoad {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "disc_load_seq")
    @SequenceGenerator(name = "disc_load_seq", sequenceName = "DISC_LOAD_SEQ", allocationSize = 1)
    @Column(name = "QQDL_TRAN_ID", nullable = false)
    private Long QQDL_TRAN_ID;

    @Column(name = "QQDL_QUOT_TRAN_ID", nullable = false)
    private Long QQDL_QUOT_TRAN_ID;

    @Column(name = "QQDL_DISC_LOAD_TYPE", length = 2, nullable = false)
    private String QQDL_DISC_LOAD_TYPE;

    @Column(name = "QQDL_DISC_LOAD_CODE", length = 12, nullable = false)
    private String QQDL_DISC_LOAD_CODE;

    @Column(name = "QQDL_FC_DISC_LOAD_AMT", precision = 14, scale = 3, nullable = false)
    private BigDecimal QQDL_FC_DISC_LOAD_AMT;

    @Column(name = "QQDL_LC_DISC_LOAD_AMT", precision = 14, scale = 3, nullable = false)
    private BigDecimal QQDL_LC_DISC_LOAD_AMT;

    @Column(name = "QQDL_APPLIED_ON", length = 2, nullable = false)
    private String QQDL_APPLIED_ON;

    @Column(name = "QQDL_APPLY_UPTO_SRNO", precision = 4, scale = 0, nullable = false)
    private Integer QQDL_APPLY_UPTO_SRNO;

    @Column(name = "QQDL_DEF_YN", length = 1, nullable = false)
    private String QQDL_DEF_YN;

    @Column(name = "QQDL_RATE_PER", precision = 10, scale = 0, nullable = false)
    private BigDecimal QQDL_RATE_PER;

    @Column(name = "QQDL_RATE", precision = 14, scale = 5, nullable = false)
    private BigDecimal QQDL_RATE;

    @Column(name = "QQDL_SRNO", precision = 5, scale = 0, nullable = false)
    private Integer QQDL_SRNO;

    @Column(name = "QQDL_APPL_PERC", precision = 3, scale = 0, nullable = false)
    private Integer QQDL_APPL_PERC;

    @Column(name = "QQDL_COVER_CODE", length = 12, nullable = false)
    private String QQDL_COVER_CODE;

    @Column(name = "QQDL_LC_EMR_VAL", precision = 14, scale = 3, nullable = false)
    private BigDecimal QQDL_LC_EMR_VAL;

    @Column(name = "QQDL_FC_EMR_VAL", precision = 14, scale = 3, nullable = false)
    private BigDecimal QQDL_FC_EMR_VAL;

    @Column(name = "QQDL_FLEX_01", length = 240, nullable = false)
    private String QQDL_FLEX_01;

    @Column(name = "QQDL_INS_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date QQDL_INS_DT;

    @Column(name = "QQDL_INS_ID", length = 12, nullable = false)
    private String QQDL_INS_ID;
}
