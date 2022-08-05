package com.buimanhthanh.dto;

public class UsersDTO {
    private String userName;
    private String password;
    private Byte enabled;

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }
}
