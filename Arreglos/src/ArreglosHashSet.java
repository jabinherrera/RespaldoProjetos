import java.util.HashSet;
import java.util.Set;

public class ArreglosHashSet {
    public static void main(String[] args) {
        Set<String> arr = new HashSet<String>();            //los elementos no se repiten con HashSet
        //Set<tipo> nombre = new HasSet<tipo>();
        arr.add("Pikachu");
        arr.add("Charmander");
        arr.add("Haxorus");
        arr.add("Pikachu");                                 //solo considera 1 de los 2, ya que se repite
        arr.add("Persian");

        System.out.println(arr.size());
    }

}
