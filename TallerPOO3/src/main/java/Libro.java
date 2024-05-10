public class Libro extends Articulo implements Comprable {

	private String tematica;
	private String genero;

	public Libro(String titulo, int precio, String autores, int codigo, int disponibilidad, String tematica, String genero) {
		super(titulo, precio, autores, codigo, disponibilidad);
		this.tematica = tematica;
		this.genero = genero;
	}

	@Override
	public void comprarArticulo(Articulo articulo, Cliente cliente) {
		if (articulo.getDisponibilidad() == 1) {
			articulo.setDisponibilidad(2);
			cliente.comprarParaInventarioPersona(articulo);
			System.out.println("El articulo fue comprado con exito");
			System.out.println("Se ha cambiado la disponibilidad de un articulo");
		}else{
			System.out.println("El articulo no esta disponible");
		}
	}

	@Override
	public void comprarArticulo(Articulo articulo, Empresario empresario) {
		if (articulo.getDisponibilidad() == 1) {
			articulo.setDisponibilidad(2);
			empresario.comprarParaInventarioPersona(articulo);
			System.out.println("El articulo fue comprado con exito");
			System.out.println("Se ha cambiado la disponibilidad de un articulo");
		}else{
			System.out.println("El articulo no esta disponible");
		}
	}

	@Override
	public String toString() {
		return "Libro{" +
				"tematica='" + tematica + '\'' +
				", genero='" + genero + '\'' +
				'}';
	}
}