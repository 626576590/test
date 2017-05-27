package com.cecsm.core.entity;

import com.cecsm.common.bean.Base;
import java.util.Date;

public class Task extends Base {
    private Long task_id;

    private Long content_id;

    private Long patient_id;

    private Long user_id;

    private Long type_id;

    private Integer priority;

    private Long receiver;

    private Integer mode;

    private Integer call_status;

    private Date finish_time;

    public Long getTask_id() {
        return task_id;
    }

    public void setTask_id(Long task_id) {
        this.task_id = task_id;
    }

    public Long getContent_id() {
        return content_id;
    }

    public void setContent_id(Long content_id) {
        this.content_id = content_id;
    }

    public Long getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Long patient_id) {
        this.patient_id = patient_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getType_id() {
        return type_id;
    }

    public void setType_id(Long type_id) {
        this.type_id = type_id;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Long getReceiver() {
        return receiver;
    }

    public void setReceiver(Long receiver) {
        this.receiver = receiver;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public Integer getCall_status() {
        return call_status;
    }

    public void setCall_status(Integer call_status) {
        this.call_status = call_status;
    }

    public Date getFinish_time() {
        return finish_time;
    }

    public void setFinish_time(Date finish_time) {
        this.finish_time = finish_time;
    }
}