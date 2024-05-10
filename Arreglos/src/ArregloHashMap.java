import java.util.HashMap;
import java.util.Map;

//"Estamos creando algo similar a un diccionario"
public class ArregloHashMap {
    public static void main(String[] args) {
        Map<String,Integer> arr = new HashMap();            //permite crear un arreglo con un llave o clave asociada a un dato
        //Map<tipo1,tipo2> nombre = new HashMap();

        //se usa "put" en lugar de "add"
        arr.put("9876-clp",9000);
        arr.put("9823-brl",19000);
        arr.put("3455-usd",5000);
        arr.put("9845-clp",6000);
        arr.put("9876-clp",8000);                   //cuando uno pone una clave/llave que se repite, el valor es remplazado
                                                    //en este caso 8000 remplaza a 9000, porque tienen la misma clave/llave

        System.out.println(arr);                    //muestra el contenido del arreglo
        System.out.println(arr.get("3455-usd"));    //muestra el valor de la clave en especifico
    }
}
