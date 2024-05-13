package controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.engine.Constants;

import  data.UserReader;
import model.Role;
import model.User;

public class LoginController {
	

    public boolean login(String login, String password, ArrayList<Role> roles) {
        HashMap<String, User> users =  UserReader.users;
        if(users.containsKey(login)) {
            User user = users.get(login);
            if(user.getPassword().equals(password) && roles.contains(user.getRole())) {
                return true;
            }
        }
        return false;
    }
}
