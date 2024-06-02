package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import model.Purchase;
import model.TipoPagoEnum;

public class PurchasesReader {
	private static String filename = "Purchases.csv";
    private static String[] headers;
    public static HashMap<String, Purchase> purchases = new HashMap<>();

    public String[] getHeaders() {
        return headers;
    }

    public Integer loadCompras(String path) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(path+filename));
		String line = br.readLine();
        headers = line.split(",");
		line = br.readLine();
		while (line != null) 
		{
			try {
                String[] partes = line.split(","); 
                String pieza = partes[0].strip();
                String comprador = partes[1].strip();
                String precio = partes[2].strip();
                TipoPagoEnum tipoPago = TipoPagoEnum.valueOf(partes[3].strip());
                String fechaVenta = partes[4].strip();

                Purchase purchase = new Purchase(pieza,comprador,tipoPago,fechaVenta, precio);
                
                purchases.put(pieza, purchase);

                line = br.readLine();
            } catch (IOException e) {
                System.out.println("Error al leer una línea del archivo de ventas.");
                e.printStackTrace();
                continue;
            }
                
		}
		br.close();
		
		return purchases.size();
    }
    
    
    public Boolean sync(String path) throws FileNotFoundException, IOException{
        FileWriter editor = new FileWriter(path + filename);
        editor.write(String.join(",", headers) + "\n");
        // ArrayList<String> data = new ArrayList<>();
        for (Purchase purchase : purchases.values()) {
            String row = purchase.getPieza() + "," + purchase.getComprador() + "," + purchase.getPrecio() + ","
            + purchase.getTipoPago()+ "," + purchase.getFecha();
            // data.add(row + "\n");
            editor.write(row + "\n");
        }
        editor.flush();
        editor.close();
        return false;
    }
}
