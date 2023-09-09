package service;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class CrudUserImpl implements CrudUser {
    private List<User> users;
    private User user;

    public CrudUserImpl() {
        // USUARIOS de prueba
        User user1 = new User("Fabi Owl, fowl@gmail.com, 5482449");
        User user2 = new User("Jhon Doe, fdoe@gmail.com, 6942047");
        List<User> testUsers = new ArrayList<>();
        testUsers.add(user1);
        testUsers.add(user2);
        this.users = testUsers;
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
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
        User user = new User(body);
        addUser(user);
        printUsers(users);
    }

    @Override
    public List<User> readAll() {
        printUsers(users);
        return users;
    }

    @Override
    public void updateById(String body, int id) {
        User updatedUser = new User(body);

        User usuarioEncontrado = null;

        for (User user : users) {
            if (user.getId() == id) {
                user.setNames(updatedUser.getNames());
                user.setEmail(updatedUser.getEmail());
                user.setPhone(updatedUser.getPhone());
                usuarioEncontrado = user;
                break;
            }
        }

        if (usuarioEncontrado != null) {
            System.out.println("Usuario editado: ID = " + usuarioEncontrado.getId() + ", Nombre = " + usuarioEncontrado.getNames());

        } else {
            System.out.println("Usuario con ID " + id + " no encontrado.");
        }
        printUsers(users);
    }

    @Override
    public void deleteById(int id) {
        User usuarioEncontrado = null;

        for (User user : users) {
            if (user.getId() == id) {
                usuarioEncontrado = user;
                break;
            }
        }

        if (usuarioEncontrado != null) {
            System.out.println("Usuario eliminado: ID = " + usuarioEncontrado.getId() + ", Nombre = " + usuarioEncontrado.getNames());
            users.remove(usuarioEncontrado);
        } else {
            System.out.println("Usuario con ID " + id + " no encontrado.");
        }
        printUsers(users);
    }

    @Override
    public void findAll() {
        printUsers(users);
    }

    @Override
    public void findById(int id) {
        User usuarioEncontrado = null;

        for (User user : users) {
            if (user.getId() == id) {
                usuarioEncontrado = user;
                break;
            }
        }

        if (usuarioEncontrado != null) {
            System.out.println("Usuario encontrado: ID = " + usuarioEncontrado.getId() + ", Nombre = " + usuarioEncontrado.getNames());
        } else {
            System.out.println("Usuario con ID " + id + " no encontrado.");
        }
        printUsers(users);
    }

    public void printUsers(List<User> users) {
        for (User user : users) {
            System.out.println(user);
        }
    }


}
