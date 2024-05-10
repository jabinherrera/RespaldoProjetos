import java.util.Arrays;
import java.util.List;

public class Principal1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        //for each, para cada elemento del arr ejecuta el contenido de for
        for (int e : arr) {
            System.out.println(e);
        }

        //lo mismo que antes pero en 1 linea
        for (int e : arr) {
            System.out.println(" " + e);
        }

        //lo mismo que antes, lo muestra como lo haria el arrayList
        System.out.println(Arrays.toString(arr));

        //lo mismo que antes usando Array.asList
        List<Integer> arrL = Arrays.asList(1,2,3,4);
        System.out.println(arrL);


    }
}
