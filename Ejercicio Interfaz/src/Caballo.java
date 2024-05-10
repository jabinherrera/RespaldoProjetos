import java.util.ArrayList;
import java.util.Arrays;

public class Caballo implements PuedeMontarse{
    public int capacidad;
    public int ocupación;
    public Guerrero[] ocupantes;

    public Caballo(int capacidad, int ocupación, Guerrero[] ocupantes) {
        this.capacidad = capacidad;
        this.ocupación = ocupación;
        this.ocupantes = ocupantes;
        comprobarGriegos();
    }

    private void comprobarGriegos(){
        Guerrero griegoComprobante = new Guerrero("", "Griego", 1);
        for (int i = 0; i < ocupantes.length; i++) {
            Guerrero guerrero = ocupantes[i];
            if (griegoComprobante.getNacionalidad().equals(guerrero.getNacionalidad())){
                Caballo caballoDeGriegos = new Caballo(ocupantes.length, ocupación, ocupantes);
                System.out.println("Se ha generado un caballo lleno de griegos");
            }else{
                Caballo CaballoSinOcupantes = new Caballo(100, ocupación, ocupantes);
                System.out.println("Se ha generado un caballo vacío sin griegos");
            }
        }
    }

    public void ordenar(){
        Arrays.sort(ocupantes);
        for (Guerrero g: ocupantes) {
            System.out.println(g);
        }
    }

    public int buscar(String nombre){
        int aux = 0;
        for (int i = 0; i < ocupantes.length; i++) {
            Guerrero guerrero = ocupantes[i];
            if (nombre.equals(guerrero.getNombre())){
                aux = i;
            }else{
                aux = -1;
            }
        }
        return aux;
    }

    @Override
    public int montar(Guerrero g) {
        if(ocupantes.length < capacidad){}
        //todo crear retorno
    }

    @Override
    public void desmontar() {

    }
}
