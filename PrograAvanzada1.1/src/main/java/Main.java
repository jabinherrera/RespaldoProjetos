import java.util.ArrayList;
import java.util.Scanner;

/*
Repaso de progra funcional.
 */

public class Main {
    public static void main(String[] args) {
        int[] numerosEnteros = {1,2,3,4,5,6,7,8,9,10};
        contarNumerosMayoresAlIngresado(numerosEnteros);
    }

    public static Scanner teclado = new Scanner(System.in);

    public static void contarNumerosMayoresAlIngresado(int[] vector){
        System.out.println("Ingrese un numero para comparar");
        var numeroDefinido = teclado.nextInt();
        var contador = 0;
        ArrayList<Integer> nuevosNumerosEnteros = new ArrayList();

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > numeroDefinido){
                nuevosNumerosEnteros.add(vector[i]);
                contador++;
            }
        }

        System.out.println("Hay " + contador + " mayores al numero ingresado en la lista");
        System.out.println("Los numeros mayores al numero ingresado en la lista son: " + nuevosNumerosEnteros);
    }


    //intento de empezar con lamda
    public static boolean esMayor(int numero1, int numero2){
        if (numero1 > numero2){
            return true;
        }else{
            return false;
        }
    }
}
