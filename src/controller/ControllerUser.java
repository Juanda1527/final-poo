package controller;

import service.CrudUserImpl;

public class ControllerUser {

    private String url;
    private String metodo;
    private String headers;
    private String body;
    private int id;
    private CrudUserImpl crud;

    public ControllerUser(String metodo, String url, String headers, String body, CrudUserImpl crud) {
        this.metodo = metodo;
        this.url = url;
        this.headers = headers;
        this.body = body;
        this.crud = crud;
    }

    public ControllerUser(String metodo, String url, String headers, String body, int id, CrudUserImpl crud) {
        this.metodo = metodo;
        this.url = url;
        this.headers = headers;
        this.body = body;
        this.id = id;
        this.crud = crud;
    }

    private String getUsers() {

        return "Careculo";
    }

    private String getUsersById(int id) {
        return "Careverga";
    }

    private String postUser(String body) {
        return "Carepicha";
    }

    private String deleteUserById(int id) {
        return "Caredelete";
    }

    private String putUserId(String body, int id) {
        return "Careputa";
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CrudUser getUser() {
        return user;
    }

    public void setUser(CrudUser user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ControllerUser{" +
                "url='" + url + '\'' +
                ", headers='" + headers + '\'' +
                ", body='" + body + '\'' +
                ", id=" + id +
                ", user=" + user +
                '}';
    }
}
