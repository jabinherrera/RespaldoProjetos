public class Congelado extends Producto {
    private String metodoCongelado;

    public Congelado(int precio, int temperaturaEnvasado, String nombre, double peso, String metodoCongelado) {
        super(precio, temperaturaEnvasado, nombre, peso);
        this.metodoCongelado = metodoCongelado;
    }

    @Override
    public String toString() {
        return "Congelado{" +
                "metodoCongelado='" + metodoCongelado + '\'' +
                '}';
    }
}
