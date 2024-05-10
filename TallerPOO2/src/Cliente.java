import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String rut;
    private int totalDeCompra;
    private Embalaje embalajeSolicitado;
    private ArrayList<Producto> listaProducto;
    private ArrayList<Cliente> registroClientes;

    public Cliente(String nombre, String rut, int totalDeCompra, Embalaje embalajeSolicitado, ArrayList<Producto> listaProducto) {
        this.nombre = nombre;
        this.rut = rut;
        this.totalDeCompra = totalDeCompra;
        this.embalajeSolicitado = embalajeSolicitado;
        this.listaProducto = listaProducto;
    }

    public Cliente() {
    }

    public void setTotalDeCompra(int totalDeCompra) {
        this.totalDeCompra = totalDeCompra;
    }

    public int getListaProductoSize(){
        return listaProducto.size();
    }

    public ArrayList<Producto> getListaProducto() {
        return listaProducto;
    }

    //Agrega clientes a un ArrayList
    public void registrarCliente(Cliente cliente) {
        registroClientes.add(cliente);
        System.out.println("El cliente:");
        System.out.println(cliente);
        System.out.println("Fue registrado exitosamente");
    }

    //Agrega un producto al ArrayList listaProducto
    public void agregarProducto(Producto producto){
        this.listaProducto.add(producto);
        System.out.println("El producto:");
        System.out.println(producto);
        System.out.println("fue agregado");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", totalDeCompra=" + totalDeCompra +
                ", embalajeSolicitado=" + embalajeSolicitado +
                ", listaProducto=" + listaProducto +
                ", registroClientes=" + registroClientes +
                '}';
    }
}
