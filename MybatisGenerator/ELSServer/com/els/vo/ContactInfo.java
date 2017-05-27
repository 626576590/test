package com.els.vo;

import com.els.common.BaseVO;

public class ContactInfo extends BaseVO {
    private Long id;

    private String isPublic;

    private String isSale;

    private String isFinance;

    private String isEnterprise;

    private String salePerson;

    private String saleMobile;

    private String saleMail;

    private String financePerson;

    private String financeMobile;

    private String financeMail;

    private String enterprisePerson;

    private String enterpriseMobile;

    private String enterpriseMail;

    private String fbk1;

    private String fbk2;

    private String fbk3;

    private String fbk4;

    private String fbk5;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic == null ? null : isPublic.trim();
    }

    public String getIsSale() {
        return isSale;
    }

    public void setIsSale(String isSale) {
        this.isSale = isSale == null ? null : isSale.trim();
    }

    public String getIsFinance() {
        return isFinance;
    }

    public void setIsFinance(String isFinance) {
        this.isFinance = isFinance == null ? null : isFinance.trim();
    }

    public String getIsEnterprise() {
        return isEnterprise;
    }

    public void setIsEnterprise(String isEnterprise) {
        this.isEnterprise = isEnterprise == null ? null : isEnterprise.trim();
    }

    public String getSalePerson() {
        return salePerson;
    }

    public void setSalePerson(String salePerson) {
        this.salePerson = salePerson == null ? null : salePerson.trim();
    }

    public String getSaleMobile() {
        return saleMobile;
    }

    public void setSaleMobile(String saleMobile) {
        this.saleMobile = saleMobile == null ? null : saleMobile.trim();
    }

    public String getSaleMail() {
        return saleMail;
    }

    public void setSaleMail(String saleMail) {
        this.saleMail = saleMail == null ? null : saleMail.trim();
    }

    public String getFinancePerson() {
        return financePerson;
    }

    public void setFinancePerson(String financePerson) {
        this.financePerson = financePerson == null ? null : financePerson.trim();
    }

    public String getFinanceMobile() {
        return financeMobile;
    }

    public void setFinanceMobile(String financeMobile) {
        this.financeMobile = financeMobile == null ? null : financeMobile.trim();
    }

    public String getFinanceMail() {
        return financeMail;
    }

    public void setFinanceMail(String financeMail) {
        this.financeMail = financeMail == null ? null : financeMail.trim();
    }

    public String getEnterprisePerson() {
        return enterprisePerson;
    }

    public void setEnterprisePerson(String enterprisePerson) {
        this.enterprisePerson = enterprisePerson == null ? null : enterprisePerson.trim();
    }

    public String getEnterpriseMobile() {
        return enterpriseMobile;
    }

    public void setEnterpriseMobile(String enterpriseMobile) {
        this.enterpriseMobile = enterpriseMobile == null ? null : enterpriseMobile.trim();
    }

    public String getEnterpriseMail() {
        return enterpriseMail;
    }

    public void setEnterpriseMail(String enterpriseMail) {
        this.enterpriseMail = enterpriseMail == null ? null : enterpriseMail.trim();
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