import java.util.ArrayList;
import java.util.Random;

public class Jugador {
    private String nombre;
    private ArrayList<Carta> mano = new ArrayList<>();

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carta> getmano(){
        return mano;
    }
}
