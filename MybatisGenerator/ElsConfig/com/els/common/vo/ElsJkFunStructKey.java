package com.els.common.vo;

public class ElsJkFunStructKey {
    private String jkId;

    private String funStruct;

    private String funStructField;

    public String getJkId() {
        return jkId;
    }

    public void setJkId(String jkId) {
        this.jkId = jkId == null ? null : jkId.trim();
    }

    public String getFunStruct() {
        return funStruct;
    }

    public void setFunStruct(String funStruct) {
        this.funStruct = funStruct == null ? null : funStruct.trim();
    }

    public String getFunStructField() {
        return funStructField;
    }

    public void setFunStructField(String funStructField) {
        this.funStructField = funStructField == null ? null : funStructField.trim();
    }
}