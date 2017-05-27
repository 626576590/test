package com.cecsm.core.entity;

import com.cecsm.common.bean.Base;
import java.util.Date;

public class CallLog extends Base {
    private Long log_id;

    private Long task_id;

    private Long patient_id;

    private Long seat_id;

    private Long user_id;

    private String record_id;

    private Date call_time;

    private Integer mode;

    private String extension;

    private String telephone;

    private Integer total_duration;

    private Integer call_duration;

    private String url;

    private String queue;

    private String agent_id;

    private String level;

    private String queue_wait_time;

    private String queue_duration;

    private String queue_dest;

    private String ivr_selection;

    private String account_code;

    private String is_file;

    public Long getLog_id() {
        return log_id;
    }

    public void setLog_id(Long log_id) {
        this.log_id = log_id;
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

    public Long getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(Long seat_id) {
        this.seat_id = seat_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getRecord_id() {
        return record_id;
    }

    public void setRecord_id(String record_id) {
        this.record_id = record_id == null ? null : record_id.trim();
    }

    public Date getCall_time() {
        return call_time;
    }

    public void setCall_time(Date call_time) {
        this.call_time = call_time;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Integer getTotal_duration() {
        return total_duration;
    }

    public void setTotal_duration(Integer total_duration) {
        this.total_duration = total_duration;
    }

    public Integer getCall_duration() {
        return call_duration;
    }

    public void setCall_duration(Integer call_duration) {
        this.call_duration = call_duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue == null ? null : queue.trim();
    }

    public String getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(String agent_id) {
        this.agent_id = agent_id == null ? null : agent_id.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getQueue_wait_time() {
        return queue_wait_time;
    }

    public void setQueue_wait_time(String queue_wait_time) {
        this.queue_wait_time = queue_wait_time == null ? null : queue_wait_time.trim();
    }

    public String getQueue_duration() {
        return queue_duration;
    }

    public void setQueue_duration(String queue_duration) {
        this.queue_duration = queue_duration == null ? null : queue_duration.trim();
    }

    public String getQueue_dest() {
        return queue_dest;
    }

    public void setQueue_dest(String queue_dest) {
        this.queue_dest = queue_dest == null ? null : queue_dest.trim();
    }

    public String getIvr_selection() {
        return ivr_selection;
    }

    public void setIvr_selection(String ivr_selection) {
        this.ivr_selection = ivr_selection == null ? null : ivr_selection.trim();
    }

    public String getAccount_code() {
        return account_code;
    }

    public void setAccount_code(String account_code) {
        this.account_code = account_code == null ? null : account_code.trim();
    }

    public String getIs_file() {
        return is_file;
    }

    public void setIs_file(String is_file) {
        this.is_file = is_file == null ? null : is_file.trim();
    }
}