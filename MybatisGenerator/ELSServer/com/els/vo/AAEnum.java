package com.els.vo;

import com.els.common.BaseVO;

public class AAEnum extends BaseVO {
    private String enumType;

    private String localeId;

    private Integer enumIndex;

    private String enumCode;

    private String enumName;

    public String getEnumType() {
        return enumType;
    }

    public void setEnumType(String enumType) {
        this.enumType = enumType == null ? null : enumType.trim();
    }

    public String getLocaleId() {
        return localeId;
    }

    public void setLocaleId(String localeId) {
        this.localeId = localeId == null ? null : localeId.trim();
    }

    public Integer getEnumIndex() {
        return enumIndex;
    }

    public void setEnumIndex(Integer enumIndex) {
        this.enumIndex = enumIndex;
    }

    public String getEnumCode() {
        return enumCode;
    }

    public void setEnumCode(String enumCode) {
        this.enumCode = enumCode == null ? null : enumCode.trim();
    }

    public String getEnumName() {
        return enumName;
    }

    public void setEnumName(String enumName) {
        this.enumName = enumName == null ? null : enumName.trim();
    }
}