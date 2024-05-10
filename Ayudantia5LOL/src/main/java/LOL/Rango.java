package LOL;

import java.util.List;

public class Rango extends Campeon {

	private int rango;

	public Rango(int oroAcumulado, int nivel, int daño, int armadura, int vida, double velocidadDeAtaque, int rango) {
		super(oroAcumulado, nivel, daño, armadura, vida, velocidadDeAtaque);
		this.rango = rango;
	}

	@Override
	void generarConjuntoHabilidades() {

	}
}