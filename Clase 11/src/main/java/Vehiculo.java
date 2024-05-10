public class Vehiculo {
    private String patente;
    private int nRuedas;
    private String color;

    public Vehiculo(String patente, int nRuedas, String color) {
        this.patente = patente;
        this.nRuedas = nRuedas;
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", nRuedas=" + nRuedas +
                ", color='" + color + '\'' +
                '}';
    }
}
