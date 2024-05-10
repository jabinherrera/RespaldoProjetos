public class Fresco extends Producto {
    public Fresco(int precio, int temperaturaEnvasado, String nombre, double peso) {
        super(precio, temperaturaEnvasado, nombre, peso);
    }

    @Override
    public String toString() {
        return "Fresco{}";
    }
}
