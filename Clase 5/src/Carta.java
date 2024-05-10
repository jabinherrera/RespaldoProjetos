import java.util.ArrayList;

public class Carta {
    private String pinta;
    private String símbolo;
    private int valor;

    public Carta(String pinta, String símbolo, int valor) {
        this.pinta = pinta;
        this.símbolo = símbolo;
        this.valor = valor;
    }

    public Carta(int valore, String símbolo, String pinta) {
    }

    @Override
    public String toString() {
        return "Carta{" +
                "pinta='" + pinta + '\'' +
                ", símbolo='" + símbolo + '\'' +
                ", valor=" + valor +
                '}';
    }
}
