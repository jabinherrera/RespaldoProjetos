import java.util.*;


public class Ejemplo1 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        List<String> cMayuscula = new ArrayList<>();
        nombres.add("Daniel");
        nombres.add("Cristobal");
        nombres.add("Claudio");
        nombres.add("Matias");

        for (int i = 0; i < nombres.size(); i++) {      //Metodo 1, muestra los elementos del arreglo
            System.out.println(i);
        }
        
        for (String nombre : nombres) {                 //Metodo 2, muestra los elementos del arreglo
            System.out.println(nombre);
            
        }
/*
        for (String nombre : nombres) {                 //Metodo 3, si fuera un String en vez de un arreglo serviria
            if(nombre.charAt(0).equals(nombre.toUpperCase().charAt(0))){
                System.out.println(nombre);
            }

        }
*/
        for (String nombre : nombres) {                 //Metodo 4, verifica que la primera letra sea mayuscula y muestra solo los elementos que empiezan con mayuscula
            if(nombre.charAt(0)==nombre.toUpperCase().charAt(0)){
                System.out.println(nombre);
            }

        }

        for (String nombre : nombres) {                 //Metodo 5, verifica que la primera letra sea una "C" y solo muestra los elementos que empiecen con esa letra
            if(nombre.charAt(0)=='C'){
                cMayuscula.add(nombre);                 //Añade los elemenentos que empiecen con "C" al arreglo cMayuscula
                System.out.println(cMayuscula);         //Muestra los elementos del arreglo cMayuscula
            }

        }

        
    }
}
