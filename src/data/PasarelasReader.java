package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import model.Escultura;
import model.Foto;
import model.Pasarela;
import model.Piece;
import model.Pintura;
import model.Role;
import model.User;
import model.Video;

public class PasarelasReader {

	private static String filename = "Pasarelas.csv";
	private static String[] headers;
	public static HashMap<String, Pasarela> pasarelas = new HashMap<>();
	
	public Integer loadPasarelas(String path) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(path+filename));
		String line = br.readLine(); // Salto de primera linea
        headers = line.split(",");
		line = br.readLine();
		while (line != null) 
		{
			String[] partes = line.split(","); 
			String nombreClasePasarela = partes[0].strip();
            
			Pasarela pasarela ;
            try {
				Class clase = Class.forName(nombreClasePasarela); 
				pasarela = (Pasarela) clase.getDeclaredConstructor(null).newInstance(null);
				pasarelas.put(pasarela.getNombre(),pasarela);
				
				System.out.println("Se cargó correctamente la pasarela de pago " + pasarela.getNombre() + " de manera dinámica.");
			} catch (Exception e) {
				e.printStackTrace();
			}

            line = br.readLine();
                
		}
		br.close();
		return pasarelas.size();
    }
    
    
   
}