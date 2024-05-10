import java.util.ArrayList;

public class Proveedor {
    private String tipoProveedor;
    private double cantidadEnKilogramos;
    private int costoPorKilo;
    private ArrayList<Proveedor> registroProveedores;

    public Proveedor(String tipoProveedor, double cantidadEnKilogramos, int costoPorKilo) {
        this.tipoProveedor = tipoProveedor;
        this.cantidadEnKilogramos = cantidadEnKilogramos;
        this.costoPorKilo = costoPorKilo;
    }

    public Proveedor() {
    }

    //Agrega proveedores a un ArrayList
    public void registrarProveedor(Proveedor proveedor) {
        registroProveedores.add(proveedor);
        System.out.println("El proveedor:");
        System.out.println(proveedor);
        System.out.println("Fue registrado exitosamente");
    }

    public double getCantidadEnKilogramos() {
        return cantidadEnKilogramos;
    }

    public int getCostoPorKilo() {
        return costoPorKilo;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "tipoProveedor='" + tipoProveedor + '\'' +
                ", cantidadEnKilogramos=" + cantidadEnKilogramos +
                ", costoPorKilo=" + costoPorKilo +
                ", registroProveedores=" + registroProveedores +
                '}';
    }
}
