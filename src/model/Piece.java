package model;

public class Piece {
    private String titulo;
	private String anio;
	private String tipo;
    //ESCULTURA, FOTO, PINTURA, VIDEO
	private String lugarCreacion;
	private String autor;
	private String fechaConsignacion;
	private String propietarioEmail;
	private Boolean exposicion; //Si no esta en exposicion esta en bodega
	private Boolean subasta; // Si no esta en subasta esta en venta
	private Boolean bloqueada;
    private Boolean ventaAprobada;
    private Boolean pagada;
    private Boolean vendida;
    private String fechaVenta;
    private String precioVenta;
    private String valorInicial;//Para la subasta
    private String valorMinimo;
    private String fechaLimite;//Cuando deja de estar disponible la pieza en la galeria
    

    public Piece(String titulo, String anio, String tipo,String lugarCreacion, String autor,
            String fechaConsignacion,String propietario,Boolean exposicion,Boolean subasta,
            Boolean bloqueada, Boolean aprobada,Boolean pagada,Boolean vendida,String fechaVenta,
            String precioVenta,String valorInicial,String valorMinimo,String fechaLimite) {
        this.titulo = titulo;
        this.anio = anio;
        this.tipo = tipo;
        this.lugarCreacion = lugarCreacion;
        this.autor = autor;
        this.fechaConsignacion = fechaConsignacion;
        this.propietarioEmail = propietario;
        this.exposicion = exposicion;
        this.subasta = subasta;
        this.bloqueada = bloqueada;
        this.ventaAprobada = aprobada;
        this.pagada = pagada;
        this.vendida = vendida;
        this.fechaVenta=fechaVenta;
        this.precioVenta=precioVenta;
        this.valorInicial=valorInicial;
        this.valorMinimo = valorMinimo;
        this.fechaLimite = fechaLimite;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAnio() {
        return anio;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }
    public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLugarCreacion() {
        return lugarCreacion;
    }
    public void setLugarCreacion(String lugarCreacion) {
        this.lugarCreacion = lugarCreacion;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Boolean getVendida() {
        return vendida;
    }
    public void setVendida(Boolean vendida) {
        this.vendida = vendida;
    }
    public String getFechaConsignacion() {
        return fechaConsignacion;
    }
    public void setFechaConsignacion(String fechaConsignacion) {
        this.fechaConsignacion = fechaConsignacion;
    }
    
    public String getPropietarioEmail() {
        return propietarioEmail;
    }
    public void setPropietarioEmail(String propietario) {
        this.propietarioEmail = propietario;
    }
    
    public Boolean getExposicion() {
		return exposicion;
	}

	public void setExposicion(Boolean exposicion) {
		this.exposicion = exposicion;
	}

	public Boolean getSubasta() {
		return subasta;
	}

	public void setSubasta(Boolean subasta) {
		this.subasta = subasta;
	}

	public Boolean getBloqueada() {
        return bloqueada;
    }
    public void setBloqueada(Boolean bloqueada) {
        this.bloqueada = bloqueada;
    }
    
    public Boolean getVentaAprobada() {
        return ventaAprobada;
    }
    public void setVentaAprobada(Boolean ventaAprobada) {
        this.ventaAprobada = ventaAprobada;
    }

	public Boolean getPagada() {
		return pagada;
	}

	public void setPagada(Boolean pagada) {
		this.pagada = pagada;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public String getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(String precioVenta) {
		this.precioVenta = precioVenta;
	}

	public String getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(String valorInicial) {
		this.valorInicial = valorInicial;
	}

	public String getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(String valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public String getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(String fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

    
}
