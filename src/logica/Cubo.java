package logica;

public class Cubo extends Cuadrado implements Cuerpo {

	public Cubo(double valor1) {
		super(valor1);
	}

	public double calcularVolumen() {		
		return Math.pow(this.valor1, 3);
	}

}
