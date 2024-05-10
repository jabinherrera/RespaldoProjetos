package LOL;

import java.util.List;

public abstract class Campeon {

	private int oroAcumulado;
	private int nivel;
	private int da�o;
	private int armadura;
	private int vida;
	private double velocidadDeAtaque;
	private List<ConjuntoHabilidad> habilidades;

	public Campeon(int oroAcumulado, int nivel, int da�o, int armadura, int vida, double velocidadDeAtaque) {
		this.oroAcumulado = oroAcumulado;
		this.nivel = nivel;
		this.da�o = da�o;
		this.armadura = armadura;
		this.vida = vida;
		this.velocidadDeAtaque = velocidadDeAtaque;
	}

	abstract void generarConjuntoHabilidades();
}