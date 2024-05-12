package model;

public class Foto extends Piece {

	private Integer altura;
	private Integer ancho;

	// Constructor base
	public Foto(String titulo, String anio, String tipo, String lugarCreacion, String autor, String fechaConsignacion,
			String propietario, Boolean exposicion, Boolean subasta, Boolean bloqueada, Boolean aprobada,
			Boolean pagada, Boolean vendida, String fechaVenta, String precioVenta, String valorInicial,
			String valorMinimo, String fechaLimite) {
		super(titulo, anio, tipo, lugarCreacion, autor, fechaConsignacion, propietario, exposicion, subasta, bloqueada,
				aprobada, pagada, vendida, fechaVenta, precioVenta, valorInicial, valorMinimo, fechaLimite);
	}

	// Constructor
	public Foto(String titulo, String anio, String tipo, String lugarCreacion, String autor,
			String fechaConsignacion, String propietario, Boolean exposicion, Boolean subasta,
			Boolean bloqueada, Boolean aprobada, Boolean pagada, Boolean vendida, String fechaVenta,
			String precioVenta, String valorInicial, String valorMinimo, String fechaLimite, Integer altura,
			Integer ancho) {
		super(titulo, anio, tipo, lugarCreacion, autor, fechaConsignacion, propietario, exposicion,
				subasta, bloqueada, aprobada, pagada, vendida, fechaVenta, precioVenta, valorInicial,
				valorMinimo, fechaLimite);

		this.altura = altura;
		this.ancho = ancho;

	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Integer getAncho() {
		return ancho;
	}

	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}
}
