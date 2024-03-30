package presentacion;

import logica.Circulo;
import logica.Cuadrado;
import logica.Cubo;
import logica.Cuerpo;
import logica.Esfera;
import logica.Figura;
import logica.Triangulo;

public class Principal {

	public static void main(String[] args) {
		Figura f;
		f = new Cuadrado(5);
		System.out.println(f.calcularArea());
		System.out.println(f.calcularPerimetro());
		
		f = new Circulo(5);
		System.out.println(f.calcularArea());
		System.out.println(f.calcularPerimetro());

		f = new Triangulo(5, 10);
		System.out.println(f.calcularArea());
		System.out.println(f.calcularPerimetro());
				
		Cuerpo c;
		c = new Cubo(5);
		System.out.println(c.calcularVolumen());
		
		c = new Esfera(5);
		System.out.println(c.calcularVolumen());
		
		
	}
}
