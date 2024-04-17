package logica;

import java.time.LocalDate;

public class Video extends Pieza{


	private String duracion;
	private String formato;
	private String dispositivoReproduccion;
	
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public void setDispositivoReproduccion(String dispositivoReproduccion) {
		this.dispositivoReproduccion = dispositivoReproduccion;
	}
	
	public Video(String titulo, LocalDate anio, String lugarCreacion, String autor, String estado,
			LocalDate fechaConsignacion, Boolean bloqueada, String duracion, String formato, 
			String dispositivoReproduccion) {
		super(titulo, anio, lugarCreacion, autor, estado, fechaConsignacion, bloqueada);
		
		this.duracion = duracion;
		this.formato = formato;
		this.dispositivoReproduccion = dispositivoReproduccion;
	}
}
