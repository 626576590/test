package com.cecsm.core.entity;

import com.cecsm.common.bean.Base;

public class PatientLabels extends Base {
    private Long ID;

    private Long labels_id;

    private Long patient_id;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getLabels_id() {
        return labels_id;
    }

    public void setLabels_id(Long labels_id) {
        this.labels_id = labels_id;
    }

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }
}