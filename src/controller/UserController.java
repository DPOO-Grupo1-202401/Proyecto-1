package controller;
import java.util.HashMap;

import data.UserReader;
import model.User;

public class UserController {

    public HashMap<String, User> getUsers() {
        return UserReader.users;
    }

    public User getUser(String email) {
        return UserReader.users.get(email);
    }
    
}
