package com.els.common.vo;

public class ElsJkFunExportKey {
    private String jkId;

    private String funParam;

    public String getJkId() {
        return jkId;
    }

    public void setJkId(String jkId) {
        this.jkId = jkId == null ? null : jkId.trim();
    }

    public String getFunParam() {
        return funParam;
    }

    public void setFunParam(String funParam) {
        this.funParam = funParam == null ? null : funParam.trim();
    }
}