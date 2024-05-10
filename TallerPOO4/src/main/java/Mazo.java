import java.util.ArrayList;

public class Mazo implements Mostrable{
    ArrayList<Carta> mazo = new ArrayList<>();

    public Mazo(){
    }

    public Mazo(String color){
        generarMazo(color);
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void revolverMazo(int veces) {
        for (int i = 0; i < veces; i++) {
            int selecion = (int)(Math.random()*mazo.size());
            Carta c = mazo.get(selecion);
            mazo.remove(selecion);

            int insercion = (int)(Math.random()*mazo.size());
            mazo.add(insercion,c);
        }
    }

    public void mostrarCartas() {
        for (int i = 0; i < mazo.size(); i++) {
            System.out.println(mazo.get(i));
        }
    }
    public void generarMazo(String color) {
        String[] pintas = {"pica", "corazon","diamante","trebol"};
        String[] numeros = {"A","2","3","4","5","6","7","8","9","10","J","Q","K" };
        int[] puntos = {20, 2, 3, 4, 5, 6, 7, 8, 9,10,10,10,10};
        for (int i = 0; i < pintas.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                mazo.add(new Carta(numeros[j], pintas[i],puntos[j],color));
            }
        }

        mazo.add(new Carta("Joker", "Color", 30, color));
        mazo.add(new Carta("Joker", "Negro", 30, color));
    }

    public void repartir(int cantidad,Mano mano){
        if(mazo.size()>=cantidad){
            for (int i = 0; i < cantidad; i++) {
                mano.añadir(mazo.get(0));
                mazo.remove(0);
            }
        }else{
            System.out.println("no se pueden repartir más cartas");
        }
    }
}