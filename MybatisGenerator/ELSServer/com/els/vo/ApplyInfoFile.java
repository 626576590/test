package com.els.vo;

import com.els.common.BaseVO;

public class ApplyInfoFile extends BaseVO {
    private String toElsAccount;

    private String fileNumber;

    private String fileType;

    private String fileName;

    private String filePath;

    private String fbk1;

    private String fbk2;

    private String fbk3;

    private String fbk4;

    private String fbk5;

    public String getToElsAccount() {
        return toElsAccount;
    }

    public void setToElsAccount(String toElsAccount) {
        this.toElsAccount = toElsAccount == null ? null : toElsAccount.trim();
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber == null ? null : fileNumber.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getFbk1() {
        return fbk1;
    }

    public void setFbk1(String fbk1) {
        this.fbk1 = fbk1 == null ? null : fbk1.trim();
    }

    public String getFbk2() {
        return fbk2;
    }

    public void setFbk2(String fbk2) {
        this.fbk2 = fbk2 == null ? null : fbk2.trim();
    }

    public String getFbk3() {
        return fbk3;
    }

    public void setFbk3(String fbk3) {
        this.fbk3 = fbk3 == null ? null : fbk3.trim();
    }

    public String getFbk4() {
        return fbk4;
    }

    public void setFbk4(String fbk4) {
        this.fbk4 = fbk4 == null ? null : fbk4.trim();
    }

    public String getFbk5() {
        return fbk5;
    }

    public void setFbk5(String fbk5) {
        this.fbk5 = fbk5 == null ? null : fbk5.trim();
    }
}