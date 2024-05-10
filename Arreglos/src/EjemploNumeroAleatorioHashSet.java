//Ejemplo para demostrar HashSet vs arr[]

import java.util.HashSet;
import java.util.Set;

public class EjemploNumeroAleatorioHashSet {
    public static void main(String[] args) {
        //crear un arreglo de largo 10 sin repetir
        //con numero del 1 al 15

        //con HashSet
        Set<Integer> arr = new HashSet<>();

        for (int i = 0; arr.size() < 10; i++){      //llena el arreglo con numeros aleatorios del 1 al 15
            arr.add((int)(Math.random()*15)+1);
        }
        System.out.println("arr = " + arr);         //muestra el contenido del arreglo
        //esto hace lo mismo que la clase "NumeroAleatorioArr"
    }
}
