package service;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class CrudUserImpl implements CrudUser {
    private List<User> users;
    private User user;

    public CrudUserImpl() {
        this.users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void create(String body) {
        // Implementación para crear un nuevo usuario a partir de los datos proporcionados en el cuerpo (body)
    }

    @Override
    public List<User> readAll() {
        return users;
    }

    @Override
    public void updateById(String body, int id) {
        // Implementación para actualizar un usuario existente por su ID usando los datos del cuerpo (body)
    }

    @Override
    public void deleteById(int id) {
        // Implementación para eliminar un usuario por su ID
    }

    @Override
    public void findAll() {
        printUsers(users);
    }

    @Override
    public void findById(int id) {
        // Implementación para encontrar un usuario por su ID
    }

    public void printUsers(List<User> users) {
        for (User user : users) {
            System.out.println(user);
        }
    }


}
