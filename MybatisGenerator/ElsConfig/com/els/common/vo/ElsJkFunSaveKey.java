package com.els.common.vo;

public class ElsJkFunSaveKey {
    private String jkId;

    private String saveTable;

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
}