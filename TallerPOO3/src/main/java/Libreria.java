import java.util.HashMap;

public class Libreria {

	private HashMap inventario;
	private HashMap registroPersonas;


	public void agregarArticulo(Articulo articulo) {
		inventario.put(articulo.getCodigo(), articulo);
		System.out.println("El articulo fue agregado exitosamente");
	}

	public void removerArticulo(Articulo articulo) {
		inventario.remove(articulo.getCodigo());
		System.out.println("El articulo fue removido exitosamente");
	}

	public void agregarCliente(Cliente cliente) {
		registroPersonas.put(cliente.getRut(), cliente);
		System.out.println("Se agrego el cliente exitosamente");
	}

	public void agregarEmpresario(Empresario empresario) {
		registroPersonas.put(empresario.getRut(), empresario);
		System.out.println("Se agrego el empresario exitosamente");
	}

	public void removerPersona(Persona persona) {
		registroPersonas.remove(persona.getRut());
		System.out.println("La persona fue removida exitosamente");
	}

	public void consultarDisponibles(){
		System.out.println("Inventario: ");
		System.out.println(inventario);
	}

	@Override
	public String toString() {
		return "Libreria{" +
				"inventario=" + inventario +
				", registroPersonas=" + registroPersonas +
				'}';
	}
}