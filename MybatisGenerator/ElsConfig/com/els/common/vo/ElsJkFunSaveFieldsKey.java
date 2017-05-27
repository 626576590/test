package com.els.common.vo;

public class ElsJkFunSaveFieldsKey {
    private String jkId;

    private String saveTable;

    private String field;

    public String getJkId() {
        return jkId;
    }

    public void setJkId(String jkId) {
        this.jkId = jkId == null ? null : jkId.trim();
    }

    public String getSaveTable() {
        return saveTable;
    }

    public void setSaveTable(String saveTable) {
        this.saveTable = saveTable == null ? null : saveTable.trim();
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }
}