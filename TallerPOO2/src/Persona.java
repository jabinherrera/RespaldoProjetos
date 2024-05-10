import java.util.ArrayList;

public class Persona extends Cliente {
    public Persona(String nombre, String rut, int totalDeCompra, Embalaje embalajeSolicitado, ArrayList<Producto> listaProducto) {
        super(nombre, rut, totalDeCompra, embalajeSolicitado, listaProducto);
    }

    @Override
    public String toString() {
        return "Persona{}";
    }
}
