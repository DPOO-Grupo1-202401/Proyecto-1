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
import model.Piece;
import model.Pintura;
import model.Video;

public class PieceReader {

    private static String filename = "Pieces.csv";
    private static String headers;
    public static HashMap<String, Piece> pieces = new HashMap<>();

    private static HashMap<String, Pintura> pinturas = new HashMap<>();
    private static HashMap<String, Foto> fotos = new HashMap<>();
    private static HashMap<String, Video> videos = new HashMap<>();
    private static HashMap<String, Escultura> esculturas = new HashMap<>();

    private void loadPinturas(String path) throws IOException {
        String filename = "pinturas.csv";
        BufferedReader br = new BufferedReader(new FileReader(path + filename));
        String line = br.readLine(); // Salto de primera linea
        headers = line.strip();
        line = br.readLine();
        while (line != null) {
            String[] partes = line.split(",");
            String titulo = partes[0].strip();
            String tecnica = partes[1].strip();
            String estilo = partes[2].strip();
            Integer altura = Integer.parseInt(partes[3].strip());
            Integer ancho = Integer.parseInt(partes[4].strip());

            Pintura pintura = (Pintura) pieces.get(titulo);
            pintura.setTecnica(tecnica);
            pintura.setEstilo(estilo);
            pintura.setAltura(altura);
            pintura.setAncho(ancho);

            pieces.put(titulo, pintura);

            line = br.readLine();

        }
        br.close();

    }

    private void loadFotos(String path) throws IOException {
        String filename = "fotos.csv";
        BufferedReader br = new BufferedReader(new FileReader(path + filename));
        String line = br.readLine(); // Salto de primera linea
        headers = line.strip();
        line = br.readLine();
        while (line != null) {
            String[] partes = line.split(",");
            String titulo = partes[0].strip();
            Integer altura = Integer.parseInt(partes[1].strip());
            Integer ancho = Integer.parseInt(partes[2].strip());

            Foto foto = (Foto) pieces.get(titulo);
            foto.setAltura(altura);
            foto.setAncho(ancho);

            pieces.put(titulo, foto);

            line = br.readLine();
        }

        br.close();
    }

    private void loadVideos(String path) throws IOException {
        String filename = "videos.csv";
        BufferedReader br = new BufferedReader(new FileReader(path + filename));
        String line = br.readLine(); // Salto de primera linea
        headers = line.strip();
        line = br.readLine();
        while (line != null) {
            String[] partes = line.split(",");
            String titulo = partes[0].strip();
            String duracion = partes[1].strip();
            String calidad = partes[2].strip();
            Integer altura = Integer.parseInt(partes[3].strip());
            Integer ancho = Integer.parseInt(partes[4].strip());

            Video video = (Video) pieces.get(titulo);
            video.setDuracion(duracion);
            video.setCalidad(calidad);
            video.setAltura(altura);
            video.setAncho(ancho);

            pieces.put(titulo, video);

            line = br.readLine();
        }

        br.close();
    }

    private void loadEsculturas(String path) throws IOException {
        String filename = "esculturas.csv";
        BufferedReader br = new BufferedReader(new FileReader(path + filename));
        String line = br.readLine(); // Salto de primera linea
        headers = line.strip();
        line = br.readLine();
        while (line != null) {
            String[] partes = line.split(",");
            String titulo = partes[0].strip();
            String material = partes[1].strip();
            Integer altura = Integer.parseInt(partes[2].strip());
            Integer ancho = Integer.parseInt(partes[3].strip());
            Integer profundidad = Integer.parseInt(partes[4].strip());
            Integer peso = Integer.parseInt(partes[5].strip());

            // Piece p = pieces.get(titulo);
            // Escultura escultura = new Escultura(titulo, p.getAnio(), p.getTipo(), p.getLugarCreacion(), p.getAutor(),
            //         p.getFechaConsignacion(), p.getPropietarioEmail(), p.getExposicion(), p.getSubasta(),
            //         p.getBloqueada(), p.getVentaAprobada(), p.getPagada(), p.getVendida(), p.getFechaVenta(),
            //         p.getPrecioVenta(), p.getValorInicial(), p.getValorMinimo(), p.getFechaLimite(), material, altura,
            //         ancho, profundidad, peso);
            Escultura escultura = (Escultura) pieces.get(titulo);
            escultura.setMaterial(material);
            escultura.setAltura(altura);
            escultura.setAncho(ancho);
            escultura.setProfundidad(profundidad);
            escultura.setPeso(peso);
            pieces.put(titulo, escultura);
            line = br.readLine();
        }

        br.close();
    }

    public Integer loadPieces(String path) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(path + filename));
        String line = br.readLine(); // Salto de primera linea
        headers = line.strip();
        line = br.readLine();
        while (line != null) {
            String[] partes = line.split(",");
            String titulo = partes[0].strip();
            String anio = partes[1].strip();
            String tipo = partes[2].strip();
            String lugarCreacion = partes[3].strip();
            String autor = partes[4].strip();
            String fechaConsignacion = partes[5].strip();
            String propietario = partes[6].strip();
            Boolean exposicion = Boolean.parseBoolean(partes[7].strip());
            Boolean subasta = Boolean.parseBoolean(partes[8].strip());
            Boolean bloqueada = Boolean.parseBoolean(partes[9].strip());
            Boolean aprobada = Boolean.parseBoolean(partes[10].strip());
            Boolean pagada = Boolean.parseBoolean(partes[11].strip());
            Boolean vendida = Boolean.parseBoolean(partes[12].strip());
            String fechaVenta = partes[13].strip();
            String precioVenta = partes[14].strip();
            String valorInicial = partes[15].strip();
            String valorMinimo = partes[16].strip();
            String fechaLimite = partes[17].strip();

            switch (tipo) {
                case "ESCULTURA":
                    // AGREGAR CAMPOS FALTANTES
                    Escultura escultura = new Escultura(titulo, anio, tipo, lugarCreacion, autor, fechaConsignacion,
                            propietario, exposicion, subasta, bloqueada, aprobada, pagada, vendida, fechaVenta,
                            precioVenta, valorInicial, valorMinimo, fechaLimite);
                    pieces.put(titulo, escultura);
                    break;
                case "FOTO":
                    // AGREGAR CAMPOS FALTANTES
                    Foto foto = new Foto(titulo, anio, tipo, lugarCreacion, autor, fechaConsignacion, propietario,
                            exposicion, subasta, bloqueada, aprobada, pagada, vendida, fechaVenta, precioVenta,
                            valorInicial, valorMinimo, fechaLimite);
                    pieces.put(titulo, foto);
                    break;
                case "PINTURA":
                    // AGREGAR CAMPOS FALTANTES
                    Pintura pintura = new Pintura(titulo, anio, tipo, lugarCreacion, autor, fechaConsignacion,
                            propietario, exposicion, subasta, bloqueada, aprobada, pagada, vendida, fechaVenta,
                            precioVenta, valorInicial, valorMinimo, fechaLimite);
                    pieces.put(titulo, pintura);
                    break;

                case "VIDEO":

                    // AGREGAR CAMPOS FALTANTES
                    Video video = new Video(titulo, anio, tipo, lugarCreacion, autor, fechaConsignacion, propietario,
                            exposicion, subasta, bloqueada, aprobada, pagada, vendida, fechaVenta, precioVenta,
                            valorInicial, valorMinimo, fechaLimite);
                    pieces.put(titulo, video);
                    break;

                default:
                    throw new Exception("No se pudo interpretar el tipo de pieza");

            }

            line = br.readLine();

        }
        br.close();

        // ESCULTURA
        this.loadEsculturas(path);

        // FOTO
        this.loadFotos(path);

        // PINTURA
        this.loadPinturas(path);

        // VIDEO
        this.loadVideos(path);

        return pieces.size();
    }
    
    
    
    
    
    public Boolean sync(String path) throws FileNotFoundException, IOException {
        FileWriter editor = new FileWriter(path + filename);
        editor.write(headers + "\n");
        // ArrayList<String> data = new ArrayList<>();
        for (Piece piece : pieces.values()) {
            String row = piece.getTitulo() + "," + piece.getAnio() + "," + piece.getLugarCreacion() + ","
                    + piece.getAutor()
                    + "," + piece.getVendida() + "," + piece.getFechaConsignacion() + "," + piece.getBloqueada() + ","
                    + piece.getVentaAprobada() + "," + piece.getPropietarioEmail() + "," + piece.getPagada() + ","
                    + piece.getFechaVenta() + "," + piece.getPrecioVenta();
            // data.add(row + "\n");
            editor.append(row + "\n");
        }
        editor.flush();
        editor.close();
        return false;
    }
}
