package com.ryoua.myblog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Author ryoua Created on 2019-05-16
 */
@Entity
@Table(name = "tbl_category_info")
public class CategoryInfo {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private Byte number;

    @Column(name = "create_by")
    private Date createBy;

    @Column(name = "modified_by")
    private Date modifiedBy;

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
        this.name = name;
    }

    public Byte getNumber() {
        return number;
    }

    public void setNumber(Byte number) {
        this.number = number;
    }

    public Date getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }

    public Date getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Date modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public String toString() {
        return "CategoryInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", createBy=" + createBy +
                ", modifiedBy=" + modifiedBy +
                '}';
    }
}
