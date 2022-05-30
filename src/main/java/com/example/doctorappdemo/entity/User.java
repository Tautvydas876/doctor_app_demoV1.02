package com.example.doctorappdemo.entity;

import javax.persistence.*;
import java.text.SimpleDateFormat;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "data")
    String data = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());

    @Column(name = "username", unique = true, length = 64)
    private String userName;

    @Column(name = "email", unique = true, length = 128)
    private String email;

    @Column(name = "password", length = 128)
    private String password;

    @Transient
    private char[] role;


    //------------------------------------------------
    @Transient
    private String passwordConfirm;

    @Transient
    private String oldPassword;

    @Transient
    private String newPassword;

    @Transient
    private String passwordNewConfirm;


    public User() {
    }


    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public User(int id, String data, String userName, String email, String password, String passwordConfirm, String oldPassword, String newPassword, String passwordNewConfirm) {
        this.id = id;
        this.data = data;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
        this.passwordNewConfirm = passwordNewConfirm;

    }

    public User(String data, String userName, String email, String password, String passwordConfirm, String oldPassword, String newPassword, String passwordNewConfirm) {
        this.data = data;
        this.userName = userName;
        this.email = email;
        this.password = password;

        this.passwordConfirm = passwordConfirm;
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
        this.passwordNewConfirm = passwordNewConfirm;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getPasswordNewConfirm() {
        return passwordNewConfirm;
    }

    public void setPasswordNewConfirm(String passwordNewConfirm) {
        this.passwordNewConfirm = passwordNewConfirm;
    }

    public char[] getRole() {
        return role;
    }

    public void setRole(char[] role) {
        this.role = role;
    }
}
