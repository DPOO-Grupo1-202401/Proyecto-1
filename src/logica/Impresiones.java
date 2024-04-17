package logica;

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
	
	public Impresiones(String titulo, LocalDate anio, String lugarCreacion, String autor, String estado,
			LocalDate fechaConsignacion, Boolean bloqueada, String tecnica, String tipoPapelSoporte,
			String edicion) {
		super(titulo, anio, lugarCreacion, autor, estado, fechaConsignacion, bloqueada);
		
		this.tecnica = tecnica;
		this.tipoPapelSoporte = tipoPapelSoporte;
		this.edicion = edicion;
	}
}
