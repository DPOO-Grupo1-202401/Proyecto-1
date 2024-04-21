package logica;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Pintura extends Pieza{
	

	private float alto;
	private float ancho;
	private String tecnica;
	
	public void setAlto(float alto) {
		this.alto = alto;
	}
	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public float getAlto() {
		return alto;
	}
	public float getAncho() {
		return ancho;
	}
	public String getTecnica() {
		return tecnica;
	}
	
	public Pintura(String titulo, String anio, String lugarCreacion, Usuario autor, String estado,
			String fechaConsignacion, Boolean bloqueada, float alto, float ancho, String tecnica, Propietario propietario) {
		super(titulo, anio, lugarCreacion, autor, fechaConsignacion, propietario);

		this.alto = alto;
		this.ancho = ancho;
		this.tecnica = tecnica;
	}

	public void registrarPintura(Pintura pintura) {
        String titulo = pintura.getTitulo();
        String anio = pintura.getAnio();
        String lugarCreacion = pintura.getlugarCreacion();
        String autor = pintura.getAutor().getNombre();
        String fechaConsignacion = pintura.getFechaConsignacion();
		String login = pintura.getPropietario().getLogin();

        String tecnica = pintura.getTecnica();
        String alto = String() pintura.getAlto();
        String ancho = String() pintura.getAncho();
        
	

        agregarPintura(titulo + "," + anio + "," + lugarCreacion + "," + autor + ","

                + fechaConsignacion + "," + login + "," + tecnica + "," + alto + "," + ancho );

    }
	public void agregarPintura(String texto) {

        FileWriter filewriter;

        try {

            filewriter = new FileWriter("./data_inventario/Pintura.txt", true);

            filewriter.write(texto + "\n");

            filewriter.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}
