import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] test = GestorArchivo.separarPorLinea("datasets/pasajeros.csv");
        System.out.println(Arrays.toString(test));
        System.out.println(test[2]);

        System.out.println("Hello World");
    }
}