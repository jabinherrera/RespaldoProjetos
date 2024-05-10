import java.util.ArrayList;
import java.util.Collections;

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


}