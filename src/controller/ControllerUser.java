package controller;

import model.User;
import service.CrudUser;
import service.CrudUserImpl;

import java.util.List;

public class ControllerUser {

    private String url;
    private String metodo;
    private String headers;
    private String body;
    private int id;

    public CrudUserImpl crud;

    public String response;
    private CrudUser user;

    public ControllerUser(String metodo, String url, String headers, String body, CrudUserImpl crud) {
        this.metodo = metodo;
        this.url = url;
        this.headers = headers;
        this.body = body;
        this.crud = crud;
        if (metodo.equals("GET")) {
            getUsers();
        }
        else if (metodo.equals("POST")) {
            postUser(body);
        }
    }

    public ControllerUser(String metodo, String url, String headers, String body, int id, CrudUserImpl crud) {
        this.metodo = metodo;
        this.url = url;
        this.headers = headers;
        this.body = body;
        this.id = id;
        this.crud = crud;
        switch (metodo) {
            case "GET" -> {
                getUsersById(id);
            }
            case "PUT" -> {
                putUserId(body, id);
            }
            case "DELETE" -> {
                deleteUserById(id);
            }
        }
    }

    private void getUsers() {
        crud.readAll();
    }

    private void getUsersById(int id) {
        crud.findById(id);
    }

    private void postUser(String body) {
        crud.create(body);
    }

    private void deleteUserById(int id) {
        crud.deleteById(id);
    }

    private void putUserId(String body, int id) {
        crud.updateById(body, id);
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
