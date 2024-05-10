import jdk.incubator.foreign.CLinker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto producto0 = new Congelado(1000, 0, "Manzana", 2, "metodoCongelado");
        Producto producto1 = new Fresco(1000, 0, "Manzana", 30);
        Producto producto2 = new Frio(1000, 0, "Manzana", 2, true);
        Proveedor proveedor0 = new Proveedor("Persona natural", 23, 2000);
        Embalaje caja = new Embalaje("caja", 4);
        Embalaje bolsa = new Embalaje("bolsa", 2);
        Embalaje pallet = new Embalaje("Pallet", 15);
        ArrayList<Producto> arrP = new ArrayList<>();
        Cliente cliente0 = new Persona("Jabin", "204899169, ", 10000, pallet, arrP);
        Cliente empresa0 = new Empresa("Jabin", "204899169, ", 10000, pallet, arrP, "Servicios privados");
        Producto producto = new Producto();
        Cliente cliente = new Cliente();
        Proveedor proveedor = new Proveedor();

        proveedor.registrarProveedor(proveedor0);
        cliente.registrarCliente(cliente0);
        producto.registrarProducto(producto1);
        producto.venderProducto(1);
        producto.consultarRegistroProductos();
        producto.consultarRegistroVentas();
    }
}
