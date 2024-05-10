import java.util.ArrayList;

public class Producto {
    private int precio;
    private int temperaturaEnvasado;
    private String nombre;
    private double peso;
    private ArrayList<Producto> registroProductos;
    private ArrayList<Producto> registroVentas;

    public Producto(int precio, int temperaturaEnvasado, String nombre, double peso) {
        this.precio = precio;
        this.temperaturaEnvasado = temperaturaEnvasado;
        this.nombre = nombre;
        this.peso = peso;
    }

    public Producto() {
    }

    //Agrega productos a un ArrayList
    public void registrarProducto(Producto producto){
        registroProductos.add(producto);
        System.out.println("El producto:");
        System.out.println(producto);
        System.out.println("Fue registrado exitosamente");
    }

    //Imprime el ArrayList de productos
    public void consultarRegistroProductos(){
        for (int i = 0; i < registroProductos.size(); i++) {
            System.out.println(registroProductos.get(i));
            System.out.println(" ");
        }
    }

    //Imprime el ArrayList de ventas
    public void consultarRegistroVentas(){
        for (int i = 0; i < registroVentas.size(); i++) {
            System.out.println(registroVentas.get(i));
            System.out.println(" ");
        }
    }

    //Agrega el producto que va a ser removido del ArrayList para agregarlo
    // a otro ArrayList que contendrá el registro de las ventas
    private Producto registrarVenta(int indiceProducto){
        return registroProductos.get(indiceProducto);
    }

    //Remueve un producto del ArrayList usando el índice para simular una venta
    public void venderProducto(int indiceProducto){
        registroVentas.add(registrarVenta(indiceProducto));
        registroProductos.remove(indiceProducto);
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                ", temperaturaEnvasado=" + temperaturaEnvasado +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", registroProductos=" + registroProductos +
                ", registroVentas=" + registroVentas +
                '}';
    }
}
