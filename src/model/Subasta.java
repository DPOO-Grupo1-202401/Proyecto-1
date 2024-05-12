package model;

public class Subasta {
    private String pieza;
    private String valorInicial;
    private String valorMinimo;
    private Integer oferta;
    private Boolean abierta;
    
    public Subasta(String pieza, String valorInicial, String valorMinimo, Integer oferta, Boolean abierta) {   
        this.setPieza(pieza);
        this.setValorInicial(valorInicial);
        this.setValorMinimo(valorMinimo);
        this.setOferta(oferta);
        this.setAbierta(abierta);
    }

	public String getPieza() {
		return pieza;
	}

	public void setPieza(String pieza) {
		this.pieza = pieza;
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

	public Integer getOferta() {
		return oferta;
	}

	public void setOferta(int oferta) {
		this.oferta = oferta;
	}

	public Boolean getAbierta() {
		return abierta;
	}

	public void setAbierta(Boolean abierta) {
		this.abierta = abierta;
	}
    
    
    
    
    
    
    
    
    
}