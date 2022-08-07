package com.buimanhthanh.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    private Boolean enabled;

    @OneToOne(mappedBy = "users")
    private Customers customers;

    @OneToOne(mappedBy = "users")
    private Staff staff;

    @OneToMany(mappedBy = "users")
    private Set<Authorities> authoritiesSet;

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

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

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }
    public Set<Authorities> getAuthoritiesSet() {
        return authoritiesSet;
    }

    public void setAuthoritiesSet(Set<Authorities> authoritiesSet) {
        this.authoritiesSet = authoritiesSet;
    }

    public void addAuthorities(Authorities authorities){
        if(this.authoritiesSet == null){
            authoritiesSet = new HashSet<>();
        }
        authoritiesSet.add(authorities);
        authorities.setUsers(this);
    }

}
