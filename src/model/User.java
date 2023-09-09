package model;

import service.CrudUser;

public class User {
    private static int nextId = 1;

    private int id;
    private String names;
    private String email;
    private String phone;

    public User(String body) {
        String[] data = parseBody(body);
        this.id = nextId++;
        this.names = data[0];
        this.email = data[1];
        this.phone = data[2];
    }

    String[] parseBody(String body) {
        String[] values = body.split(",");
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i].trim();
        }
        return values;
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
