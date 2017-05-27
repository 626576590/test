package com.cecsm.core.entity;

import com.cecsm.common.bean.Base;

public class Followup extends Base {
    private Long followup_id;

    private Long task_id;

    private Long patient_id;

    private Long user_id;

    private String content;

    private String keyword;

    public Long getFollowup_id() {
        return followup_id;
    }

    public void setFollowup_id(Long followup_id) {
        this.followup_id = followup_id;
    }

    public Long getTask_id() {
        return task_id;
    }

    public void setTask_id(Long task_id) {
        this.task_id = task_id;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }
}