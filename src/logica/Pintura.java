package logica;

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
	
	public Pintura(String titulo, LocalDate anio, String lugarCreacion, String autor, String estado,
			LocalDate fechaConsignacion, Boolean bloqueada, float alto, float ancho, String tecnica) {
		super(titulo, anio, lugarCreacion, autor, estado, fechaConsignacion, bloqueada);

		this.alto = alto;
		this.ancho = ancho;
		this.tecnica = tecnica;
	}

}
