import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal2 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("IAN", "axel", "JOAQUIN", "ROBERTO");
        List<String> nombresMayuscula = new ArrayList<>();
        for (String nombre : nombres) {
            if(nombre.equals(nombre.toUpperCase())){
                nombresMayuscula.add(nombre);
            }
        }
        System.out.println(nombresMayuscula);
    }
}
