//Juego de cartas 20 blackjack

import java.util.ArrayList;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Mazo m0 = new Mazo(1);
        Jugador j1 = new Jugador("Juan");
        m0.sacarCarta(j1.getmano(),1);
        System.out.println(j1.getmano());
    }
}
