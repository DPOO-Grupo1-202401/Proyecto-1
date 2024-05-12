package model;

public class Pintura extends Piece{
	private String tecnica;
	private String estilo;
    private Integer altura;
    private Integer ancho;
    

	// Constructor base
    public Pintura(String titulo, String anio, String tipo, String lugarCreacion, String autor,
			String fechaConsignacion, String propietario, Boolean exposicion, Boolean subasta, Boolean bloqueada,
			Boolean aprobada, Boolean pagada, Boolean vendida, String fechaVenta, String precioVenta,
			String valorInicial, String valorMinimo, String fechaLimite) {
		super(titulo, anio, tipo, lugarCreacion, autor, fechaConsignacion, propietario, exposicion, subasta, bloqueada,
				aprobada, pagada, vendida, fechaVenta, precioVenta, valorInicial, valorMinimo, fechaLimite);
	}


	// Constructor
    public Pintura(String titulo, String anio, String tipo,String lugarCreacion, String autor,
            String fechaConsignacion,String propietario,Boolean exposicion,Boolean subasta,
            Boolean bloqueada, Boolean aprobada,Boolean pagada,Boolean vendida,String fechaVenta,
            String precioVenta,String valorInicial,String valorMinimo,String fechaLimite,String tecnica,String estilo, Integer altura, Integer ancho) {
        super(titulo, anio, tipo, lugarCreacion, autor, fechaConsignacion, propietario, exposicion,
        	subasta, bloqueada, aprobada, pagada,vendida,fechaVenta, precioVenta, valorInicial,
        	valorMinimo, fechaLimite);
        this.tecnica=tecnica;
        this.estilo=estilo;
        this.altura=altura;
        this.ancho=ancho;
        
    }
    
    
    public String getTecnica() {
		return tecnica;
	}


	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}


	public String getEstilo() {
		return estilo;
	}


	public void setEstilo(String estilo) {
		this.estilo = estilo;
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
