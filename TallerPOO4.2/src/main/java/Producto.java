import java.util.ArrayList;

public class Producto {

    private String nombre;
    private String tipo;
    private ArrayList<String> caracteristicas;
    private int costo;
    private int precio;

    public Producto() {
    }

    public Producto(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public ArrayList<String> getCaracteristicas() {
        return caracteristicas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCosto() {
        return costo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void añadirCaracteristica(String nuevaCaracteristica) {
        if(caracteristicas.size()<3 && caracteristicas.size()>1){
            caracteristicas.add(nuevaCaracteristica);
        }
    }

    public void calcularPrecio(int porcentaje) {
        var xPorcientoDeCosto = (porcentaje/100)*getCosto();
        setPrecio(xPorcientoDeCosto+getCosto());
    }

    public String verDescripcion(){
        var aux = this.toString();
        return aux;
    }

    @Override
    public String toString() {
        return nombre +
                ":" +
                tipo;
    }
}
