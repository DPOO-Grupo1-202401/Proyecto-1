package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import model.Role;
import model.User;

public class UserReader {
    private static String filename = "Users.csv";
    private static String[] headers;
    public static HashMap<String, User> users = new HashMap<>();

    public Integer loadUsers(String path) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(path+filename));
		String line = br.readLine(); // Salto de primera linea
        headers = line.split(",");
		line = br.readLine();
		while (line != null) 
		{
			String[] partes = line.split(","); 
			String login = partes[0].strip();
            String password = partes[1].strip();
            String nombre = partes[2].strip();
            String numeroTelefono = partes[3].strip();
            String role = partes[4].strip();

            User user = new User(login, password, nombre, numeroTelefono, Role.valueOf(role));
            
            users.put(login, user);

            line = br.readLine();
                
		}
		br.close();
		
		return users.size();
    }

    public Boolean sync(String path) throws FileNotFoundException, IOException{
        FileWriter editor = new FileWriter(path + filename, true);

        return false;
    }

    public boolean writeUser(){
        return true;
    }

    
}
