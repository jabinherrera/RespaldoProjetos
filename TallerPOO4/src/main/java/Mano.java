import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Mano implements Mostrable{
    private String nombre;
    private int puntos;
    private ArrayList<Carta> mano = new ArrayList<>();

    public Mano(String nombre) {
        this.nombre = nombre;
    }

    public void añadir(Carta c){
        mano.add(c);
    }

    public void mostrarCartas() {
        for (int i = 0; i < mano.size(); i++) {
            System.out.println(mano.get(i));
        }
        puntos = sumarPuntos();

    }
    public int sumarPuntos(){
        if(mano.size()==0){
            return 0;
        }else{
            int suma = 0;
            for (Carta c:mano) {
                suma+=c.getPuntos();
            }
            return suma;
        }
    }

    public void ordenarSegunNumero(){
        Collections.sort(mano);
    }

    //Pregunta2
    public void buscarTrios(){
        ArrayList<Carta> trios = new ArrayList<>();
        ArrayList<Carta> duos = new ArrayList<>();
        ArrayList<Carta> comparador = new ArrayList();
        int contador;
        for (int i = 0; i < mano.size(); i++) {
            comparador.add(mano.get(i));
        }
        for (int i = 0; i < mano.size(); i++) {
            var aux = comparador.get(i);
            contador = 0;
            for (int j = i; j < 0; j++) {
                if(aux.equals(mano.get(j))) {
                    contador++;
                    duos.add(mano.get(j));
                    for (int k = j; k < mano.size(); k++) {
                        if (duos.equals(mano.get(k))) {
                            contador++;
                            if(contador==2){
                                trios.add(comparador.get(i));
                            }
                        }
                    }
                }
            }
        }
        if (trios.isEmpty()) {
            System.out.println("No hay trios");
        }else{
            System.out.println("Los trios son:");
            System.out.println(trios);
        }
    }

    public void buscarEscala(){
        ArrayList<Carta> escala = new ArrayList<>();
        int contador;
        for (int i = 0; i < mano.size(); i++) {
            int valorCarta1 = mano.get(i).getPuntos();
            contador = 0;
            for (int j = i; j < 0; j++) {
                int valorCarta2 = mano.get(j).getPuntos();
                if (valorCarta1 == (valorCarta2-1)){
                    contador++;
                    for (int k = j; k < mano.size(); k++) {
                        int valorCarta3 = mano.get(k).getPuntos();
                        if (valorCarta3 == (valorCarta2-1)) {
                            contador++;
                            for (int l = k; l < mano.size(); l++) {
                                int valorCarta4 = mano.get(l).getPuntos();
                                if (valorCarta4 == (valorCarta3-1)) {
                                    contador++;
                                    if (contador == 3) {
                                        escala.add(mano.get(i));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (escala.isEmpty()) {
            System.out.println("No hay escala");
        }else{
            System.out.println("Las escalas son:");
            System.out.println(escala);
        }
    }

    public void recojerCartaNueva(Mazo mazo){
        int selecion = (int)(Math.random()*mazo.getMazo().size());
        Carta c = mazo.getMazo().get(selecion);
        mazo.getMazo().remove(selecion);
        mano.add(c);
    }

    public void botarCarta(int cartaParaBotar){
        mano.remove(cartaParaBotar);
    }


}