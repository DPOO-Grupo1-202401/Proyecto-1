package view;

import java.util.HashMap;

import controller.UserController;
import model.User;

public class ConsultaDeUsuarios {

    private UserController  userController = new UserController();

    public void consultarUsuarios() {
        HashMap<String, User> users = userController.getUsers();
        for(User user : users.values()) {
            System.out.println("Nombre: " + user.getNombre() + " Email: " + user.getLogin() + " Rol: " + user.getRole());
        }
    }
    
}
