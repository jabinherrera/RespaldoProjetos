import java.util.ArrayList;

public class Empresa extends Cliente {
    private String giro;

    public Empresa(String nombre, String rut, int totalDeCompra, Embalaje embalajeSolicitado, ArrayList<Producto> listaProducto, String giro) {
        super(nombre, rut, totalDeCompra, embalajeSolicitado, listaProducto);
        this.giro = giro;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "giro='" + giro + '\'' +
                '}';
    }
}
