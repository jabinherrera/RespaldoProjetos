import java.util.HashMap;

public abstract class Persona {

	private String nombre;
	private String rut;
	private int dinero;
	private HashMap inventarioPersonaArriendo;
	private HashMap inventarioPersonaCompra;


	public Persona(String nombre, String rut, int dinero) {
		this.nombre = nombre;
		this.rut = rut;
		this.dinero = dinero;
	}

	public String getRut() {
		return rut;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public abstract void comprarParaInventarioPersona(Articulo articulo);

	public abstract void arrendarParaInventarioPersona(Articulo articulo);

	public abstract void retornarPrestamo(Articulo articulo);

	@Override
	public String toString() {
		return "Persona{" +
				"nombre='" + nombre + '\'' +
				", rut='" + rut + '\'' +
				", dinero=" + dinero +
				'}';
	}
}