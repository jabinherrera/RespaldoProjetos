public class Producto {
    private int codigo;
    private String nombre;
    private int precio;
    private int cantidadEnBoletas;

    public Producto(int codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidadEnBoletas() {
        return cantidadEnBoletas;
    }

    public void setCantidadEnBoletas(int cantidadEnBoletas) {
        this.cantidadEnBoletas = cantidadEnBoletas;
    }
}
