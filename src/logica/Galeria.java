package logica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class Galeria {
	
    private HashMap<String, Pieza> inventarioPiezas = new HashMap<String, Pieza>();
    private HashMap<String, Usuario> arrayList= new HashMap<String, Usuario>();



    public void cargarEsculturas() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("./data_inventario/Esculturas.txt"));
        String linea = br.readLine();
        String linea = br.readLine();
        while (linea != null) {
            String[] partes = linea.split(";");
            String titulo = partes[0];
            String anio = partes[1];
            String lugarCreacion = partes[2];
            String autor = partes[3];
            String estado = partes[3];
            String fechaConsignacion = partes[4];
            boolean bloqueada = partes[5]
            String alto = partes[6];
            String ancho = partes[7];
            String profundidad = partes[8];
            String materialesConstruccion = partes[9];
            String peso = partes[10];
            String requiereElectricidad = partes[10];
            String login = partes[5];
            Escultura escultura = new Escultura(titulo,anio,lugarCreacion,autor,estado,fechaConsignacion,bloqueada,alto,ancho,profundidad,materialesConstruccion,peso,requiereElectricidad,login);

            linea = br.readLine();
        }
        br.close();
    }

    public void cargarFotografias() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("./data_inventario/Fotografias.txt"));
        String linea = br.readLine();
        String linea = br.readLine();
        while (linea != null) {
            String[] partes = linea.split(";");
            String titulo = partes[0];
            String anio = partes[1];
            String lugarCreacion = partes[2];
            String autor = partes[3];
            String fechaConsignacion = partes[4];
            String tecnica = partes[5];
            String tipoImpresion = partes[6];
            String edicion = partes[7];
            String login = partes[8];


            Escultura escultura = new Escultura(titulo, anio, login, lugarCreacion, autor,fechaConsignacion,login,alto,ancho,profundidad,materialesConstruccion,peso,requiereElectricidad);
            this.adminsedes.add(adminSede);
            linea = br.readLine();
        }
        br.close();
    }


}

for (Propietario  unPropietario: propiertarios){

    if (unPropietario.getLogin().equals(login)){

        Escultura escultura = new Escultura(nombre, cedula, unPropietario, contraseña, sede);

    }

}

this.esculturas.add(escultura);

linea = br.readLine();

}

br.close();

}

