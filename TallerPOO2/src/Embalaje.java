public class Embalaje {
    private String tipoEmbalaje;
    private double capacidadEnLitros;

    public Embalaje(String tipoEmbalaje, double capacidadEnLitros) {
        this.tipoEmbalaje = tipoEmbalaje;
        this.capacidadEnLitros = capacidadEnLitros;
    }

    @Override
    public String toString() {
        return "Embalaje{" +
                "tipoEmbalaje='" + tipoEmbalaje + '\'' +
                ", capacidadEnLitros=" + capacidadEnLitros +
                '}';
    }
}
