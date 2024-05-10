import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal a0 = new Terrestre("Juguito", 1, 4);                     //polimorfismo por asignacion
        Animal a1 = new Animal("Leopoldo", 4);

        Terrestre t0 = new Terrestre("chayanne", 2, 4);                 //todas funcionan por el polimorfiismo
        
        mostrar(a0);
        mostrar(a1);
        mostrar(t0);                                                                       //sin importar como este hecho muestra el nombre

        //ArrayList<Clase> nombreArbitrario = new ArrayList();
        ArrayList<Integer> arr = new ArrayList();
        //una interfaz no puede crear instanscias, pero no hay ningun problema con los polimorfismos
        List<Integer> arr0 = new ArrayList<>();
        //Esta forma permite usar un arrayList con una interfaz como siempre

    }

    private static void mostrar(Animal a) {
        System.out.println("a = "+ a.getNombre());
    }
}
