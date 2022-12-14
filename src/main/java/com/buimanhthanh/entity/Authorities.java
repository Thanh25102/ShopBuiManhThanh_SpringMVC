package com.buimanhthanh.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "authorities")
public class Authorities implements Serializable{
    @Id
    @Column(name = "user_name")
    private String userName;

    @Id
    @Column(name = "authority")
    private String authority;

    @ManyToOne
    @JoinColumn(name = "user_name")
    private Users users;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

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
