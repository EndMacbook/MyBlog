package com.ryoua.myblog.entity;

import java.util.Date;

/**
 * @Author ryoua Created on 2019-05-16
 */
public class SysLog {
    private Long id;

    private String ip;

    private Date createBy;

    private String remark;

    private String operateUrl;

    private String operateBy;

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
        this.ip = ip;
    }

    public Date getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOperateUrl() {
        return operateUrl;
    }

    public void setOperateUrl(String operateUrl) {
        this.operateUrl = operateUrl;
    }

    public String getOperateBy() {
        return operateBy;
    }

    public void setOperateBy(String operateBy) {
        this.operateBy = operateBy;
    }

    @Override
    public String toString() {
        return "SysLog{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", createBy=" + createBy +
                ", remark='" + remark + '\'' +
                ", operateUrl='" + operateUrl + '\'' +
                ", operateBy='" + operateBy + '\'' +
                '}';
    }
}
