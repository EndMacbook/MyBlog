package com.ryoua.myblog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @Author ryoua Created on 2019-05-16
 */
public class SysView {
    private Long id;

    private String ip;

    private Date createBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }

    @Override
    public String toString() {
        return "SysView{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", createBy=" + createBy +
                '}';
    }
}
