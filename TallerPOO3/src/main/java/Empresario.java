//ORGANIZACION/EMPRESA = EMPRESARIO

import java.util.HashMap;

public class Empresario extends Persona {

	private String Clasificacion;
	private int porcentajeDescuentoCompra;
	private int porcentajeDescuentoArriendo;
	private HashMap arriendosEmpresario;
	private HashMap comprasEmpresario;
	private HashMap registroPrestamos;

	public Empresario(String nombre, String rut, int dinero, String clasificacion, int porcentajeDescuentoCompra, int porcentajeDescuentoArriendo) {
		super(nombre, rut, dinero);
		Clasificacion = clasificacion;
		this.porcentajeDescuentoCompra = porcentajeDescuentoCompra;
		this.porcentajeDescuentoArriendo = porcentajeDescuentoArriendo;
	}

	//Constructor para autor
	public Empresario(String nombre, String rut, int dinero, String clasificacion) {
		super(nombre, rut, dinero);
		Clasificacion = clasificacion;
	}

	public void setPorcentajeDescuentoCompra(int porcentajeDescuentoCompra) {
		this.porcentajeDescuentoCompra = porcentajeDescuentoCompra;
	}

	public void setPorcentajeDescuentoArriendo(int porcentajeDescuentoArriendo) {
		this.porcentajeDescuentoArriendo = porcentajeDescuentoArriendo;
	}

	public int getPorcentajeDescuentoCompra() {
		return porcentajeDescuentoCompra;
	}

	public int getPorcentajeDescuentoArriendo() {
		return porcentajeDescuentoArriendo;
	}

	public int calcularDescuentoArriendo(Articulo articulo){
		int precioFinal = (porcentajeDescuentoArriendo * articulo.getPrecio())/100;
		return precioFinal;
	}

	public int calcularDescuentoCompra(Articulo articulo){
		int precioFinal = (porcentajeDescuentoCompra * articulo.getPrecio())/100;
		return precioFinal;
	}

	public void mostrarRegistroPrestamos(){
		System.out.println("Registro: ");
		System.out.println(registroPrestamos);
	}

	@Override
	public void arrendarParaInventarioPersona(Articulo articulo) {
		int aux = calcularDescuentoArriendo(articulo);
		if (getDinero() >= aux) {
			arriendosEmpresario.put(articulo.getCodigo(), articulo);
			setDinero(getDinero()-aux);
			System.out.println("Arriendo exitoso");
			System.out.println("Su total de dinero actualmente es: " + getDinero());
		}else{
			System.out.println("Dinero insuficiente para esta accion");
		}
	}

	@Override
	public void comprarParaInventarioPersona(Articulo articulo) {
		int aux = calcularDescuentoCompra(articulo);
		if (getDinero() >= aux) {
			comprasEmpresario.put(articulo.getCodigo(), articulo);
			registroPrestamos.put(articulo.getCodigo(), articulo);
			setDinero(getDinero()-aux);
			System.out.println("Compra Exitosa");
			System.out.println("Su total de dinero actualmente es: " + getDinero());
		}else{
			System.out.println("Dinero insuficiente para esta accion");
		}
	}

	@Override
	public void retornarPrestamo(Articulo articulo) {
		arriendosEmpresario.remove(articulo);
		System.out.println("Se ha retornado un articulo");
	}

	@Override
	public String toString() {
		return "Empresario{" +
				"Clasificacion='" + Clasificacion + '\'' +
				", porcentajeDescuentoCompra=" + porcentajeDescuentoCompra +
				", porcentajeDescuentoArriendo=" + porcentajeDescuentoArriendo +
				'}';
	}
}