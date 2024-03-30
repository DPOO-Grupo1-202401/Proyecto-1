package logica;

public class Cuadrado extends Figura {

	public Cuadrado(double valor1) {
		super(valor1);
	}

	@Override
	public double calcularArea() {
		return Math.pow(this.valor1, 2);
	}

	@Override
	public double calcularPerimetro() {		
		return this.valor1 * 4;
	}

	
	
}
