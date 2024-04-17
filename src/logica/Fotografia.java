package logica;

import java.time.LocalDate;

public class Fotografia extends Pieza{
	

	private String tecnica;
	private String tipoImpresion;
	private String edicion;
	
	
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}
	public void setTipoImpresion(String tipoImpresion) {
		this.tipoImpresion = tipoImpresion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	
	public Fotografia(String titulo, LocalDate anio, String lugarCreacion, String autor, String estado,
			LocalDate fechaConsignacion, Boolean bloqueada, String tecnica, String tipoImpresion, 
			String edicion) {
		super(titulo, anio, lugarCreacion, autor, estado, fechaConsignacion, bloqueada);
		
		this.tecnica = tecnica;
		this.tipoImpresion = tipoImpresion;
		this.edicion = edicion;
	}
}
