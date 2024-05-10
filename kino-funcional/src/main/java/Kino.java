import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Kino {

    public static List<Integer> generarNumeros() {

        return new Random().ints(1,30).limit(15).boxed().distinct().collect(Collectors.toList());
    }

    public static List<Integer> ordenarLista(List<Integer> numeros){

        numeros.sort(Comparator.naturalOrder());

        //para orden inverso
        numeros.sort(Comparator.reverseOrder());

        return numeros;
    }

    public static List<Integer> obtenerAciertos(List<Integer> sorteados,
                                                List<Integer> elegidos){

        sorteados.retainAll(elegidos);

        return sorteados;
    }



}
