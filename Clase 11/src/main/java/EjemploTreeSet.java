import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        Set<Integer> arr = new TreeSet<>();
        //La cantidad no importa, pues TreeSet no permite que se repita número
        //Además, los ordena de menor a mayor
        //Ordena int de menor a mayor y String alfabeticamente
        //Ordena con un criterio distinto a HashSet
        arr.add(12);
        arr.add(2);
        arr.add(8);
        System.out.println(arr);
    }
}
