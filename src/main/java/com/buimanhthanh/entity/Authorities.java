package com.buimanhthanh.entity;

import javax.persistence.*;

@Entity
@Table(name = "authorities")
public class Authorities {
    @Id
    @Column(name = "user_name")
    private String userName;

    @Id
    @Column(name = "authority")
    private String authority;

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAuthority() {
        return this.authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}