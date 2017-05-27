package com.cecsm.core.entity;

import com.cecsm.common.bean.Base;
import java.util.Date;

public class GlycemiaRecord extends Base {
    private Long record_id;

    private Long patient_id;

    private String measure_test;

    private String estimate;

    private Integer time_interval;

    private Date measure_time;

    public Long getRecord_id() {
        return record_id;
    }

    public void setRecord_id(Long record_id) {
        this.record_id = record_id;
    }

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }

    public String getMeasure_test() {
        return measure_test;
    }

    public void setMeasure_test(String measure_test) {
        this.measure_test = measure_test == null ? null : measure_test.trim();
    }

    public String getEstimate() {
        return estimate;
    }

    public void setEstimate(String estimate) {
        this.estimate = estimate == null ? null : estimate.trim();
    }

    public Integer getTime_interval() {
        return time_interval;
    }

    public void setTime_interval(Integer time_interval) {
        this.time_interval = time_interval;
    }

    public Date getMeasure_time() {
        return measure_time;
    }

    public void setMeasure_time(Date measure_time) {
        this.measure_time = measure_time;
    }
}