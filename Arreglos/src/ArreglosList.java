import java.util.ArrayList;
import java.util.List;

public class ArreglosList {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();           //lista de arreglos, se pueden agregar y modificar elementos en cualquier posicion
        arr.add("Joaquin");
        arr.add("Gabriel");
        arr.add("Jorge");
        arr.add("Jorge");
        arr.add(3, "Jose");                 //agrega un elemento en la posicion 3 del ArrayList

        System.out.println(arr);
    }
}
