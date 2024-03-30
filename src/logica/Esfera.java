package logica;

public class Esfera extends Circulo implements Cuerpo {

	public Esfera(double valor1) {
		super(valor1);
	}

	@Override
	public double calcularVolumen() {
		return 4 / 3 * Math.PI * Math.pow(this.valor1, 3);
	}
	
	

}
