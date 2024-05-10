import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2,32,1,4,5,6,2,4,6);
        Collections.sort(numeros);
        System.out.println("numeros = " + numeros);
    }
}
