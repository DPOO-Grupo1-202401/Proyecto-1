package logica;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Impresiones extends Pieza{
	

	private String tecnica;
	private String tipoPapelSoporte;
	private String edicion;
	
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}
	public void setTipoPapelSoporte(String tipoPapelSoporte) {
		this.tipoPapelSoporte = tipoPapelSoporte;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getTecnica() {
		return tecnica;
	}

	public String getTipoPapelSoporte() {
		return tipoPapelSoporte;
	}

	public String getEdicion() {
		return edicion;
	}
	
	public Impresiones(String titulo, LocalDate anio, String lugarCreacion, Usuario autor, String estado,
			LocalDate fechaConsignacion, Boolean bloqueada, String tecnica, String tipoPapelSoporte,
			String edicion, Propietario propietario) {
		super(titulo, anio, lugarCreacion, autor, fechaConsignacion, propietario);
		
		this.tecnica = tecnica;
		this.tipoPapelSoporte = tipoPapelSoporte;
		this.edicion = edicion;
	}


	public void registrarImpresiones(Impresiones impresion) {
        String titulo = impresion.getTitulo();
        String anio = impresion.getAnio();
        String lugarCreacion = impresion.getlugarCreacion();
        String autor = impresion.getAutor().getNombre();
        String fechaConsignacion = impresion.getFechaConsignacion();
		String login = impresion.getPropietario().getLogin();

        String tecnica = impresion.getTecnica();
        String tipoPapelSoporte = impresion.getipoImpresion();
        String edicion = impresion.getEdicion();
        
	

        agregarFotografia(titulo + "," + anio + "," + lugarCreacion + "," + autor + ","

                + fechaConsignacion + "," + login + "," + tecnica + "," + tipoPapelSoporte + "," + edicion );

    }
	public void agregarFotografia(String texto) {

        FileWriter filewriter;

        try {

            filewriter = new FileWriter("./data_inventario/Impreiones.txt", true);

            filewriter.write(texto + "\n");

            filewriter.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}
