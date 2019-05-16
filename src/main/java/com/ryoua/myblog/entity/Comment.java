package com.ryoua.myblog.entity;

import java.util.Date;

/**
 * @Author ryoua Created on 2019-05-16
 */
public class Comment {
    private Long id;

    private String content;

    private Date createBy;

    private String email;

    private String name;

    private String ip;

    private Boolean isEffective;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Boolean getEffective() {
        return isEffective;
    }

    public void setEffective(Boolean effective) {
        isEffective = effective;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", createBy=" + createBy +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", ip='" + ip + '\'' +
                ", isEffective=" + isEffective +
                '}';
    }
}
