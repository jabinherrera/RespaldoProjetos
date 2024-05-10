public class Frio extends Producto {
    private boolean isCongelado;

    public Frio(int precio, int temperaturaEnvasado, String nombre, double peso, boolean isCongelado) {
        super(precio, temperaturaEnvasado, nombre, peso);
        this.isCongelado = isCongelado;
    }

    public boolean isCongelado() {
        return isCongelado;
    }

    public void setCongelado(boolean congelado) {
        isCongelado = congelado;
    }

    @Override
    public String toString() {
        return "Frio{" +
                "isCongelado=" + isCongelado +
                '}';
    }
}
