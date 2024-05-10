import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//Crear una lista de 8 numeros aleatorios
//Que no se repitan
//Con rango del 1 al 10
//Con ArrayList
public class Principal {
    public static void main(String[] args) {

        //Array
        //int arr[] = crearArr(8, 1, 10);
        //System.out.println(Arrays.toString(arr));

        //ArrayList
        ArrayList<Integer> arreglo = new ArrayList<>();
        llenarArreglo(arreglo ,8, 1, 10);
        System.out.println("arreglo = " + arreglo);
    }

    private static void llenarArreglo(ArrayList<Integer> arreglo, int largo, int vInicial, int rango) {
        for (int i = 0; i < largo; i++) {
            int num = (int)(Math.random()*rango)+1;
            while(arreglo.contains(num)){
                num = (int)(Math.random()*rango)+1;
            }
            arreglo.add(num);
        }
    }

    public static int[] crearArr(int largo, int vInicial, int rango) {
        int arr[] = new int[largo];
        Random rnum = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnum.nextInt(rango)+vInicial;
        }
        return arr;
    }
}
