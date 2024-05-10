import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoProgFuncional {


    public static void removerElemento(List<String> lista,
                                       String palabra) {

        lista.removeIf(x -> x.equalsIgnoreCase(palabra));
        lista.forEach(System.out::println);
    }

    public static void transformarDatos(List<Integer> numeros,
                                        int factor){

        List <Integer> data = numeros.stream()
                .map(n -> n * factor)
                .collect(Collectors.toList());

        data.forEach(System.out::println);
        numeros.forEach(System.out::println);
    }


}
