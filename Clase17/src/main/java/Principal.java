import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Repaso
public class Principal {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("MARCOS", "luis", "AXEL");
        List<String> palabrasMayuscula;

        //Imprime el contenido del arreglo
        arr.stream().forEach(System.out::println);
        System.out.println();
        //Imprime solo las palabras completamente en mayusculas del arreglo
        arr.stream().forEach(Principal::imprimirMayusculas);
        System.out.println();
        //Imprime solo las palabras completamente en minusculas del arreglo
        arr.stream().forEach(Principal::imprimirMinusculas);


        //nombre, pasa a ser el representante de arr
        for (String nombre : arr) {
            imprimirMayusculas(nombre);
        }

        //Repaso de la clase antetior
        palabrasMayuscula = arr.stream().
                                filter(Principal::isMayuscula).
                                collect(Collectors.toList());
        System.out.println("palabrasMayuscula = " + palabrasMayuscula);


    }

    static boolean isMayuscula(String p){
        return p.equals(p.toLowerCase());
    }

    static void imprimirMayusculas(String p){
        if(p.equals(p.toUpperCase())){
            System.out.println("p = " + p);
        }
    }

    static void imprimirMinusculas(String p){
        if (p.equals(p.toLowerCase())){
            System.out.println("p = " + p);
        }
    }
}
