import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Hola", "MUNDO", "SILLA", "Casa");
        List<String> palabrasMayusculas = new ArrayList<>();

        palabrasMayusculas = palabras.stream().filter(Main::esMayuscula).collect(Collectors.toList());

        System.out.println(palabrasMayusculas);
    }

    public static boolean esMayuscula(String palabra){
        if (palabra.equals(palabra.toUpperCase())){
            return true;
        }else{
            return false;
        }
    }
}
