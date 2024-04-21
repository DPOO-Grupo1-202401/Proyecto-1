package logica;

import java.util.HashMap;

public class Galeria {
	
    private HashMap<String, Pieza> inventarioPiezas = new HashMap<String, Pieza>();
    private HashMap<String, Usuario> arrayList= new HashMap<String, Usuario>();



    public void cargarEsculturas() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("./data_inventario/Esculturas.txt"));
        String linea = br.readLine();
        while (linea != null) {
            String[] partes = linea.split(";");
            String titulo = partes[0];
            String anio = partes[1];
            String lugarCreacion = partes[2];
            String autor = partes[3];
            String fechaConsignacion = partes[4];
            String login = partes[4];
            String alto = partes[4];
            String ancho = partes[4];
            String profundidad = partes[4];
            String materialesConstruccion = partes[4];
            String peso = partes[4];
            String requiereElectricidad = partes[4];

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

