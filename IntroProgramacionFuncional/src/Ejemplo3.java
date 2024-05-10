import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo3 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Luis", "JAVIER", "ignacio", "DANIELA");
        List<String> nMayuscula;

        nMayuscula = nombres.stream()
                            .filter((String p) -> {return p.equals(p.toUpperCase());})          //Se creo el metodo "esMayuscula" dentro del mismo stream
                                                                                                //La funcion NO TIENE NOMBRE, se identifica por el "->"
                                                                                                //A este tipo de funcion se le conoce como funcion anonima o funcion lambda
                                                                                                //COMO NO TIENE NOMBRE, NO HAY POR QUE PONERLA EN EL DIAGRAMA UML
                                                                                                //Las funciones lambda solo se puede usar en el lugar asignado, no puden ser llamadas como los otros metodos
                                                                                                //Se compone de 3 partes (Funcion, Parametros y Cuerpo)
                            .collect(Collectors.toList());
        System.out.println(nMayuscula);

    }
}
