package logica;

public class Circulo extends Figura {

	public Circulo(double valor1) {
		super(valor1);
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(this.valor1, 2);
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * this.valor1;
	}

}
