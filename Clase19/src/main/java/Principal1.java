import java.util.Arrays;
import java.util.Random;

public class Principal1 {
    public static void main(String[] args) {
        //numero aleatorios sin repetir
        int[] aleatorios = Arrays.stream(new Random().ints(0, 100)
                        .limit(100)
                        .toArray())
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(aleatorios));

        //Forma profe
        int[] aleatorios2 = Arrays.stream(new Random().ints(0, 100)
                        .limit(100)
                        .toArray())
                .boxed()
                .distinct()
                .toList()
                .stream()
                .mapToInt(i->i)
                .toArray();
        System.out.println(Arrays.toString(aleatorios));
    }
}

