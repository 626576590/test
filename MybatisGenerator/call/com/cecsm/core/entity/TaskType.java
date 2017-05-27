package com.cecsm.core.entity;

import com.cecsm.common.bean.Base;

public class TaskType extends Base {
    private Long type_id;

    private String name;

    public Long getType_id() {
        return type_id;
    }

    public void setType_id(Long type_id) {
        this.type_id = type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}