import java.util.Collection;

public class Producto {
    String producto;
    String caracteristicas;
    int costo;
    int precio;


    public Producto(String producto, String caracteristicas) {
        this.producto = producto;
        this.caracteristicas = caracteristicas;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void calcularPrecio(int i) {
    }

    public void añadirCaracteristica(String s) {
    }
}
