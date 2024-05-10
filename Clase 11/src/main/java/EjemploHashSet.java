import java.util.HashSet;
import java.util.Set;

public class EjemploHashSet {
    public static void main(String[] args) {
        Set<Integer> arr = new HashSet<>();
        //La cantidad no importa, pues HashSet no permite que se repita número
        //Además, los ordena de menor a mayor
        //Ordena int de menor a mayor y String alfabeticamente
        arr.add(10);
        arr.add(10);
        arr.add(10);
        arr.add(10);
        arr.add(10);
        System.out.println(arr);
    }
}

