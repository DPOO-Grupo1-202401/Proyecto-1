package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import model.Piece;

public class PieceReader {
    
    private static String filename = "Pieces.csv";
    private static String headers;
    public static HashMap<String, Piece> pieces = new HashMap<>();

    public Integer loadPieces(String path) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(path + filename));
        String line = br.readLine(); // Salto de primera linea
        headers = line.strip();
        line = br.readLine();
        while (line != null) {
            String[] partes = line.split(",");
            String titulo = partes[0].strip();
            String anio = partes[1].strip();
            String lugarCreacion = partes[2].strip();
            String autor = partes[3].strip();
            Boolean vendida = Boolean.parseBoolean(partes[4].strip());
            String fechaConsignacion = partes[5].strip();
            Boolean bloqueada = Boolean.parseBoolean(partes[6].strip());
            Boolean aprobada = Boolean.parseBoolean(partes[7].strip());
            String propietario = partes[8].strip();
            Boolean pagada = Boolean.parseBoolean(partes[9].strip());
            String fechaVenta = partes[10].strip();
            String precioVenta = partes[11].strip();

            Piece piece = new Piece(titulo, anio, lugarCreacion, autor, vendida, fechaConsignacion, bloqueada, aprobada,
                    propietario, pagada, fechaVenta,precioVenta);

            pieces.put(titulo, piece);

            line = br.readLine();

        }
        br.close();

        return pieces.size();
    }

    public Boolean sync(String path) throws FileNotFoundException, IOException {
        FileWriter editor = new FileWriter(path + filename);
        editor.write(headers + "\n");
        // ArrayList<String> data = new ArrayList<>();
        for (Piece piece : pieces.values()) {
            String row = piece.getTitulo() + "," + piece.getAnio() + "," + piece.getLugarCreacion() + "," + piece.getAutor()
                    + "," + piece.getVendida() + "," + piece.getFechaConsignacion() + "," + piece.getBloqueada() + ","
                    + piece.getVentaAprobada() + "," + piece.getPropietarioEmail() + "," + piece.getPagada() + "," + piece.getFechaVenta() + "," + piece.getPrecioVenta();
            // data.add(row + "\n");
            editor.append(row + "\n");
        }
        editor.flush();
		editor.close();
        return false;
    }
}
