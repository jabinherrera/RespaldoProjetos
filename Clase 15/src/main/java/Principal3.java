import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Principal3 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("IAN", "axel", "JOAQUIN", "ROBERTO");
        List<String> nombresMayuscula;

        //stream, elementos para ser iterados/trabajados
        nombresMayuscula = nombres.stream()
                //filter, filtra en base a una funcion que tengamos, en este caso, isMayuscula
                .filter(Principal3::isMayuscula)
                //lo agrega a una lista, en este caso, nombresMayusculas pues esta antes del "="
                .collect(Collectors.toList());

        System.out.println("nombresMayuscula = " + nombresMayuscula);
    }
    public static boolean isMayuscula(String nombre){
        return nombre.equals(nombre.toUpperCase());
    }
}
