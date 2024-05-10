import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        int[] arr = new int [10];                       //Un arreglo clasico
        int[] arr0 = {3, 4, 5, 67, 2};                  //Un arreglo con datos creados desde un inicio

        /*Principal p = new Principal();                //Si el método mostrar no fuera estático, habría que crear una instancia de este tipo
        p.mostrar(arr);
        p.mostrar(arr0);
        mostrar(arr);
        mostrar(arr0);
        */

        arr = llenar(arr);
        llenar(arr);                                    //Ambos funcionan para llenar, ya que ambos tienen el mismo espacio
        mostrar(arr);
    }

    public static void mostrar(int[] arreglo){                  //Método para mostrar el contenido completo de un arreglo
        for (int i = 0; i < arreglo.length; i++) {              //Que sea estático significa que no requiere que se cree una instancia
            System.out.println("[" + arreglo[i] + "]");
        }
        System.out.println();                           //Un salto de espacio
    }

    private static int[] llenar(int[] arr){             //Llena un arreglo con números aleatorios entre 0 y 100
        Random rnum = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnum.nextInt(100);
        }
        return arr;
    }
}
//Por buena práctica, solo se le debe pedir una cosa a una function, no más
