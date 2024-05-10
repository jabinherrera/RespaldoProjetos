import java.util.Set;
import java.util.TreeSet;

public class ArreglosTreeSet {
    public static void main(String[] args) {
        Set<String> arr = new TreeSet<>();          //los elementos no se repiten y los elementos los ordena utilizando "Collection.sort<>"
        arr.add("Javier");
        arr.add("Maximiliano");
        arr.add("joaquin");
        arr.add("German");
        arr.add("Joaquin");

        System.out.println(arr.size());             //muestra la cantidad de elementos no repetidos en el arreglo
        System.out.println("arr = " + arr);         //muestra el contenido del arreglo
    }
}
