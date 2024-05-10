public class Revista extends Articulo {

	private String tematica;

	public Revista(String titulo, int precio, String autores, int codigo, int disponibilidad, String tematica) {
		super(titulo, precio, autores, codigo, disponibilidad);
		this.tematica = tematica;
	}

	@Override
	public String toString() {
		return "Revista{" +
				"tematica='" + tematica + '\'' +
				'}';
	}
}