package com.cecsm.core.entity;

import com.cecsm.common.bean.Base;
import java.util.Date;

public class PatientLabelsHistory extends Base {
    private Long ID;

    private Long patient_id;

    private Long labels_id;

    private Date append_time;

    private Date remove_time;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }

    public Long getLabels_id() {
        return labels_id;
    }

    public void setLabels_id(Long labels_id) {
        this.labels_id = labels_id;
    }

    public Date getAppend_time() {
        return append_time;
    }

    public void setAppend_time(Date append_time) {
        this.append_time = append_time;
    }

    public Date getRemove_time() {
        return remove_time;
    }

    public void setRemove_time(Date remove_time) {
        this.remove_time = remove_time;
    }
}