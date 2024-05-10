import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Kino {

    public static List<Integer> generarNumeros(){

        //List<Integer> numeros;
        return new Random().ints(1,30).limit(15).boxed().distinct().collect(Collectors.toList());
    }
}
