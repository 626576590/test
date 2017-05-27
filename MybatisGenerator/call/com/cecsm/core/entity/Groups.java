package com.cecsm.core.entity;

import com.cecsm.common.bean;

public class Groups extends bean {
    private Long groups_id;

    private String name;

    public Long getGroups_id() {
        return groups_id;
    }

    public void setGroups_id(Long groups_id) {
        this.groups_id = groups_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}