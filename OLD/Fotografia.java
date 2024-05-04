package OLD;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Fotografia extends Pieza{
	

	private String tecnica;
	private String tipoImpresion;
	private String edicion;
	
	
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}
	public String getTecnica() {
		return tecnica;
	}
	public void setTipoImpresion(String tipoImpresion) {
		this.tipoImpresion = tipoImpresion;
	}
	public String getipoImpresion() {
		return tipoImpresion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public String getEdicion() {
		return edicion;
	}
	
	
	public Fotografia(String titulo, String anio, String lugarCreacion, Usuario autor, String estado,
	String fechaConsignacion, Boolean bloqueada, Propietario propietario, String tecnica, String tipoImpresion, String edicion) {
		super(titulo, anio, lugarCreacion, autor, fechaConsignacion, propietario);
		
		this.tecnica = tecnica;
		this.tipoImpresion = tipoImpresion;
		this.edicion = edicion;
	}

	public void registrarFotografia(Fotografia fotografia) {
        String titulo = fotografia.getTitulo();
        String anio = fotografia.getAnio();
        String lugarCreacion = fotografia.getlugarCreacion();
        String autor = fotografia.getAutor().getNombre();
        String fechaConsignacion = fotografia.getFechaConsignacion();
		String login = fotografia.getPropietario().getLogin();

        String tecnica = fotografia.getTecnica();
        String tipoImpresion = fotografia.getipoImpresion();
        String edicion = fotografia.getEdicion();
        
	

        agregarFotografia(titulo + "," + anio + "," + lugarCreacion + "," + autor + ","

                + fechaConsignacion + "," + login + "," + tecnica + "," + tipoImpresion + "," + edicion );

    }
	public void agregarFotografia(String texto) {

        FileWriter filewriter;

        try {

            filewriter = new FileWriter("./data_inventario/Fotografias.txt", true);

            filewriter.write(texto + "\n");

            filewriter.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}
