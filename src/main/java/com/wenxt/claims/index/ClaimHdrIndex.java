package com.wenxt.claims.index;

import java.util.Date;

import org.elasticsearch.core.Nullable;
import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonProperty;


@Document(indexName = "claimheader")
public class ClaimHdrIndex {

    @JsonProperty("CH_TRAN_ID")
    @Nullable
    private Integer CH_TRAN_ID;

    @JsonProperty("CH_CLAIM_TYPE")
    @Nullable
    private String CH_CLAIM_TYPE;

    @JsonProperty("CH_CLAIM_BAS")
    @Nullable
    private String CH_CLAIM_BAS;

    @JsonProperty("CH_LOSS_DT")
    @Nullable
    private Date CH_LOSS_DT;

    @JsonProperty("CH_INTIM_DT")
    @Nullable
    private Date CH_INTIM_DT;

    @JsonProperty("CH_CLAIM_BAS_VAL")
    @Nullable
    private String CH_CLAIM_BAS_VAL;

    @JsonProperty("CH_INS_DT")
    @Nullable
    private Date CH_INS_DT;

    @JsonProperty("CH_INS_ID")
    @Nullable
    private String CH_INS_ID;

    @JsonProperty("CH_STATUS")
    @Nullable
    private String CH_STATUS;

    @JsonProperty("CH_STATUS_DT")
    @Nullable
    private Date CH_STATUS_DT;

    @JsonProperty("CH_REF_NO")
    @Nullable
    private String CH_REF_NO;

}
