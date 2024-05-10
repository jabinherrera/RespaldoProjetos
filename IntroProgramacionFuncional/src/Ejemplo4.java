import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo4 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Luis", "JAVIER", "ignacio", "DANIELA");
        List<String> nMayuscula;

        nMayuscula = nombres.stream()
                .filter(p -> p.equals(p.toUpperCase()))         //La funcion ya sabe que es un stream, por lo que no es necesario declarar el tipo de p como en el ejemplo anterior, pero ponerlo no afecta en nada
                                                                //Como es la ultima linea, lo tiene que retornar si o si, por lo que no es necesario escribir el "return" como en el ejemplo anterior, pero ponerlo no afecta en nada
                .collect(Collectors.toList());
        System.out.println(nMayuscula);
/*
        nMayuscula = nombres.stream()
                .filter((f, g, p) -> f.equals(f.toUpperCase())) //podria usar mas parametros, pero requiere modificacion, solo asume el tipo del primero
                .collect(Collectors.toList());
        System.out.println(nMayuscula);

 */
    }
}
