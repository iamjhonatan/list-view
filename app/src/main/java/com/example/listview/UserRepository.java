package com.example.listview;

import java.util.ArrayList;

public class UserRepository {
    private static UserRepository instance = new UserRepository();
    private ArrayList<User> listUsers = new ArrayList<>();

    private UserRepository() {
        this.listUsers = listUsers;
    }

    public void create(User user) {
        listUsers.add(user);
    }

    public boolean ifContains (String name, String password) {
        for (User user: listUsers) {
            if (user.getName().equals(name) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public static UserRepository getInstance(){
        return instance;
    }

}
