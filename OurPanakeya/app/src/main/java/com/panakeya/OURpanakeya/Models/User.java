package com.panakeya.OURpanakeya.Models;

public class User {
    private String name, email, rol, pass;

    public User() {}

    public User(String name, String email, String rol, String phone) {
        this.name = name;
        this.email = email;
        this.rol = rol;
        this.pass = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String phone) {
        this.pass = phone;
    }
}
