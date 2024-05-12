package model;

public class Video extends Piece{
	private String duracion;
	private String calidad;
    private Integer altura;
    private Integer ancho;
    

	// Constructor base
    public Video(String titulo, String anio, String tipo, String lugarCreacion, String autor, String fechaConsignacion,
			String propietario, Boolean exposicion, Boolean subasta, Boolean bloqueada, Boolean aprobada,
			Boolean pagada, Boolean vendida, String fechaVenta, String precioVenta, String valorInicial,
			String valorMinimo, String fechaLimite) {
		super(titulo, anio, tipo, lugarCreacion, autor, fechaConsignacion, propietario, exposicion, subasta, bloqueada,
				aprobada, pagada, vendida, fechaVenta, precioVenta, valorInicial, valorMinimo, fechaLimite);
	}


	// Constructor
    public Video(String titulo, String anio, String tipo,String lugarCreacion, String autor,
            String fechaConsignacion,String propietario,Boolean exposicion,Boolean subasta,
            Boolean bloqueada, Boolean aprobada,Boolean pagada,Boolean vendida,String fechaVenta,
            String precioVenta,String valorInicial,String valorMinimo,String fechaLimite,String duracion,
            String calidad, Integer altura, Integer ancho) {
        super(titulo, anio, tipo, lugarCreacion, autor, fechaConsignacion, propietario, exposicion,
        	subasta, bloqueada, aprobada, pagada,vendida,fechaVenta, precioVenta, valorInicial,
        	valorMinimo, fechaLimite);
        this.duracion=duracion;
        this.calidad=calidad;
        this.altura=altura;
        this.ancho=ancho;
        
    }


	public String getDuracion() {
		return duracion;
	}


	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}


	public String getCalidad() {
		return calidad;
	}


	public void setCalidad(String calidad) {
		this.calidad = calidad;
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