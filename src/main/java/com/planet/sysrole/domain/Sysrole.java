package com.planet.sysrole.domain;

import java.util.Date;

public class Sysrole {
    private Long id;

    private String name;

    private Integer type;

    private Date createTime;

    private Integer status;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Sysrole(String name, Integer type, Date createTime, Integer status, String description) {
        this.name = name;
        this.type = type;
        this.createTime = createTime;
        this.status = status;
        this.description = description;
    }
    public Sysrole() {

    }
}