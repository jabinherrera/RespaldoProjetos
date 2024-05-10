public abstract class Articulo implements Arrendable {

	private String titulo;
	private int precio;
	private String autores;
	private int codigo;
	private int disponibilidad;

	public Articulo(String titulo, int precio, String autores, int codigo, int disponibilidad) {
		this.titulo = titulo;
		this.precio = precio;
		this.autores = autores;
		this.codigo = codigo;
		this.disponibilidad = disponibilidad;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getPrecio() {
		return precio;
	}

	public int getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(int disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public void RevisarDisponibilidad(Articulo articulo) {
		int aux = articulo.getDisponibilidad();
		switch (aux){
			case 1:
				System.out.println("El articulo esta disponible");
				break;
			case 2:
				System.out.println("El articulo no esta disponible");
				break;
			case 3:
				System.out.println("El articulo fue prestado");
				break;
		}
	}

	@Override
	public void arrendarArticulo(Articulo articulo, Cliente cliente) {
		if (articulo.getDisponibilidad() == 1) {
			articulo.setDisponibilidad(3);
			cliente.arrendarParaInventarioPersona(articulo);
			System.out.println("El articulo fue prestado con exito");
		}else{
			System.out.println("El articulo no esta disponible");
		}
	}



	@Override
	public void devolverPrestamo(Articulo articulo, Cliente cliente) {
		cliente.retornarPrestamo(articulo);
		articulo.setDisponibilidad(1);
	}

	@Override
	public void arrendarArticulo(Articulo articulo, Empresario empresario) {
		if (articulo.getDisponibilidad() == 1) {
			articulo.setDisponibilidad(3);
			empresario.arrendarParaInventarioPersona(articulo);
			System.out.println("El articulo fue prestado con exito");
		}else{
			System.out.println("El articulo no esta disponible");
		}
	}

	@Override
	public void devolverPrestamo(Articulo articulo, Empresario empresario) {
		empresario.retornarPrestamo(articulo);
		articulo.setDisponibilidad(1);
	}

	@Override
	public String toString() {
		return "Articulo{" +
				"titulo='" + titulo + '\'' +
				", precio=" + precio +
				", autores='" + autores + '\'' +
				", codigo=" + codigo +
				", disponibilidad=" + disponibilidad +
				'}';
	}
}