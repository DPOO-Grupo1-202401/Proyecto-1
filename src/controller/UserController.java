package controller;
import java.util.HashMap;

import data.PieceReader;
import data.UserReader;
import model.Piece;
import model.User;

public class UserController {
	private String batabase = "db/";
    private UserReader userReader = new UserReader();

    public HashMap<String, User> getUsers() {
        return UserReader.users;
    }

    public static User getUser(String email) {
        return UserReader.users.get(email);
    }
    
    public void agregarUsuario(String login, User nuevoUsuario) {
    	
    	UserReader.users.put(login, nuevoUsuario);
    	try {
            userReader.sync(batabase);
        } catch (Exception e) {
            System.out.println("Error al sincronizar");
        }
    }
    
}
