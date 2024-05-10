package LOL;

import java.util.ArrayList;
import java.util.List;

public class Habilidad extends ConjuntoHabilidad {

	private int coste;
	private int rango;
	private String efecto;
	private int da�o;

	public Habilidad(int coste, int rango, String efecto, int da�o) {
		this.coste = coste;
		this.rango = rango;
		this.efecto = efecto;
		this.da�o = da�o;
	}

	Habilidad habilidad1 = new Habilidad(50, 2, "Da�a al objetivo", 150);

	Habilidad habilidad2 = new Habilidad(50, 1, "Ignora evacion", 100);

	Habilidad habilidad3 = new Habilidad(100, 1, "Inmoviliza al objetivo durante 1 turno", 150);

	Habilidad habilidad4 = new Habilidad(100, 3, "Da�a al objetivo", 150);

	Habilidad habilidad5 = new Habilidad(50, 1, "Empuja al objetivo 3 casillas", 50);

	Habilidad habilidad6 = new Habilidad(100, 3, "Atrae al enemigo hasta tu lado", 50);

	Habilidad habilidad7 = new Habilidad(100, 1, "Da�a al objetivo", 300);

	Habilidad habilidad8 = new Habilidad(150, 1, "Da�a al objetivo", 450);

	Habilidad habilidad9 = new Habilidad(100, 3, "Inmoviliza al objetivo durante 1 turno", 50);

	Habilidad habilidad10 = new Habilidad(100, 1, "Silencia al objetivo durante 1 turno", 100);

	Habilidad habilidad11 = new Habilidad(150, 1, "El objetivo no puede realizar da�o durante 1 turno", 0);

	Habilidad habilidad12 = new Habilidad(150, 3, "Si hay un enemigo adjecente al objetivo, este tambien recive el da�o", 150);

	//todo agregar habilidades a un conjunto
}