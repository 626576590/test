package com.els.common.vo;

import java.math.BigDecimal;

public class ElsJkRelationKey {
    private BigDecimal elsno;

    private String reqCode;

    public BigDecimal getElsno() {
        return elsno;
    }

    public void setElsno(BigDecimal elsno) {
        this.elsno = elsno;
    }

    public String getReqCode() {
        return reqCode;
    }

    public void setReqCode(String reqCode) {
        this.reqCode = reqCode == null ? null : reqCode.trim();
    }
}