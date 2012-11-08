package test;

import puntoPlano.*;

public class TestPunto extends Test {
	public static void main(String[] args) {
		Punto p = new PuntoImpl(2.0, 3.0);
		mostrar("Punto:", p);
		p.setX(3.0);
		mostrar("Punto:", p);
		p.setY(2.0);
		mostrar("Punto:", p);
	}
}