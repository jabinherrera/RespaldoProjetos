import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo2 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Luis", "JAVIER", "ignacio", "DANIELA");           //Permite agregar directamente elementos al arreglo, deben ser del mismo tipo que el designado
        List<String> nMayuscula = new ArrayList<>();

        //Resolucion 1, forma clasica
        for (String nombre: nombres) {                  //metodo 2, Agrega elementos si el elemento esta en mayusculas
            if(esMayuscula(nombre)) {
                nMayuscula.add(nombre);
            }

        }
        System.out.println(nMayuscula);

        //Resolucion 2, con stream
        nMayuscula = nombres.stream()
                            .filter(Ejemplo2::esMayuscula)          //Para usar una funcion como parametro debe tener entrada y retorno
                            .collect(Collectors.toList());          //El metodo sabe que lista asignar los elementos porque usamos la lista "nMayuscula = " al inicio
        System.out.println(nMayuscula);
    }
    public static boolean esMayuscula(String p){        //Metodo 1, verifica si el String esta en mayusculas
        return p.equals(p.toUpperCase());
    }

}
