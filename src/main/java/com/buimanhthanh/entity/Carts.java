package com.buimanhthanh.entity;

import javax.persistence.*;

@Entity
@Table(name = "carts")
public class Carts {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "ammount")
    private Double ammount;

    @Column(name = "create_time")
    private java.sql.Timestamp createTime;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Double getAmmount() {
        return this.ammount;
    }

    public void setAmmount(Double ammount) {
        this.ammount = ammount;
    }

    public java.sql.Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.sql.Timestamp createTime) {
        this.createTime = createTime;
    }
}
