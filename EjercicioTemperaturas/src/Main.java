import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Temperatura t1 = new Temperatura();

        t1.ingresarDatos();
        t1.mostrarTemperaturas();
        t1.temperaturaMedia();
    }
}
