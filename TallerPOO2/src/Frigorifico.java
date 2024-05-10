public class Frigorifico {

    //Define el total de la compra del cliente y luego imprime una factura según los datos de cliente
    public void mostrarFactura(Cliente cliente){
        calcularTotalCompra(cliente);
        System.out.println("Factura:");
        System.out.println(cliente);
    }

    //Obtiene los precios de cada uno de los productos del ArrayList listaProductos
    // de clientes y los suma para definir el total de la compra del cliente
    public void calcularTotalCompra(Cliente cliente){
        int acumulador = 0;
        for (int i = 0; i < cliente.getListaProductoSize(); i++) {
            int aux = cliente.getListaProducto().get(i).getPrecio();
            acumulador = aux + acumulador;
        }
        System.out.println("El precio total de la compra es: " + acumulador + " pesos");
        cliente.setTotalDeCompra(acumulador);
    }

    //Calcula el nuevo precio de un producto según él lo que costo comprárselo a un proveedor
    public int calcularPrecioProducto(Proveedor proveedor, Producto producto){
        int nuevoPrecioProducto = (proveedor.getCostoPorKilo()) + (proveedor.getCostoPorKilo());
        return nuevoPrecioProducto;
    }

    //Define el nuevo precio de un producto según lo que costo comprárselo a un
    // proveedor utilizando el metodo calcularPrecioProducto
    public void definirPrecioProducto(Proveedor proveedor, Producto producto){
        int aux = calcularPrecioProducto(proveedor, producto);
        producto.setPrecio(aux);
    }

    @Override
    public String toString() {
        return "Frigorifico{}";
    }
}
