package com.cs.frm.user;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by deiveehannallazhagappan on 3/25/17.
 */

@Entity
@Table(name = "user")
public
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

    private String firstName;
    private String lastName;

    private String userid;
    private String password;



    public User() {

    }

    public User(String firstName, String lastName, String userid, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userid = userid;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
