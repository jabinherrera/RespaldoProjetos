import java.util.ArrayList;
import java.util.Arrays;

//Ordenar un arreglo
public class Principal {
    public static void main(String[] args) {
        Persona[] personas = new Persona[4];

        personas[0] = (new Persona("Manuel", 30));
        personas[1] = (new Persona("Sebastian", 15));
        personas[2] = (new Persona("Priscilla", 20));
        personas[3] = (new Persona("Ian", 18));

        //todo estudiar foreach
        for (Persona p:personas){
            System.out.println(p);
        }

        System.out.println();
        Arrays.sort(personas);

        for (Persona p:personas){
            System.out.println(p);
        }
    }
}
