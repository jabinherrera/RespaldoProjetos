import java.util.ArrayList;
import java.util.Random;

public class Mazo {
    private ArrayList<Carta> mazo = new ArrayList<>();

    public Mazo(int nMazo) {
        generarMazo(this.mazo, nMazo);
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public static void generarMazo(ArrayList<Carta> mazo, int nMazo) {
        //Datos ingresados manualmente
        String[] pintas = {"Trébol", "Diamante", "Corazon", "Pica"};
        String[] símbolos = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        int[] valores = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        //Ciclo para crear cartas con los arreglos creados anteriormente
        for (int k = 0; k < nMazo; k++) {
            for (int i = 0; i < pintas.length; i++) {
                for (int j = 0; j < símbolos.length; j++) {
                    //new Carta(); donde Cara() es el constructor de la clase Carta y dentro del () están sus atributos
                    mazo.add(new Carta(valores[j], símbolos[j], pintas[i]));
                }
            }
        }

    }

    public void sacarCarta(ArrayList<Carta> mano, int nCartas) {
        Random rnum = new Random();
        for (int i = 0; i < nCartas; i++) {
            int numero = rnum.nextInt(mazo.size());
            //Se debe agregar una carta del mazo a la mano
            mano.add(mazo.get(numero));
            //Como se agrega una carta a la mano, una carta debe desaparecer del mazo y debe ser la misma que se agregó, número en este caso.
            mazo.remove(numero);
        }
    }
}
