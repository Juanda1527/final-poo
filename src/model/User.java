package model;

import service.CrudUser;

public class User {
    private static int nextId = 1;

    private int id;
    private String names;
    private String email;
    private String phone;

    public User(String names, String email, String phone) {
        this.id = nextId++;
        this.names = names;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", names='" + names + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
