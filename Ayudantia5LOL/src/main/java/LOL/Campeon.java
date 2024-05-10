package LOL;

import java.util.List;

public abstract class Campeon {

	private int oroAcumulado;
	private int nivel;
	private int daño;
	private int armadura;
	private int vida;
	private double velocidadDeAtaque;
	private List<ConjuntoHabilidad> habilidades;

	public Campeon(int oroAcumulado, int nivel, int daño, int armadura, int vida, double velocidadDeAtaque) {
		this.oroAcumulado = oroAcumulado;
		this.nivel = nivel;
		this.daño = daño;
		this.armadura = armadura;
		this.vida = vida;
		this.velocidadDeAtaque = velocidadDeAtaque;
	}

	abstract void generarConjuntoHabilidades();
}