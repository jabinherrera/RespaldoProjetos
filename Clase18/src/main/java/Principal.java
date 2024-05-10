
import java.util.Arrays;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        int[] numerosAleatorios = new Random().ints(0,1000)
                .limit(1000)
                .toArray();

        System.out.println(Arrays.toString(numerosAleatorios));

        int maximo;
        int minimo;

        maximo = Arrays.stream(numerosAleatorios).max().getAsInt();
        System.out.println("maximo = " + maximo);
        minimo = Arrays.stream(numerosAleatorios).min().getAsInt();
        System.out.println("minimo = " + minimo);

        //Reduce devuelve solo 1 elemento
        //Filter devuelve mas de 1 elemento

        //Forma de profe
        int max = Arrays.stream(numerosAleatorios)
                .reduce((n1, n2) ->
                        n1>n2 ? n1:n2).getAsInt();

        //Forma que pense yo que haria
        int max2 = Arrays.stream(numerosAleatorios)
                .reduce((n1, n2) ->{
                    if (n1>n2){
                        return n1;
                    }else {
                        return n2;
                    }
                }).getAsInt();

        System.out.println("max = " + max);
    }
}
/*
Datos aparte

(Clase::Metodo)
(Parametro -> {})
 */
