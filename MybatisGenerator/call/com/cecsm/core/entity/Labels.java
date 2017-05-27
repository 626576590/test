package com.cecsm.core.entity;

import com.cecsm.common.bean.Base;

public class Labels extends Base {
    private Long labels_id;

    private String name;

    public Long getLabels_id() {
        return labels_id;
    }

    public void setLabels_id(Long labels_id) {
        this.labels_id = labels_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}