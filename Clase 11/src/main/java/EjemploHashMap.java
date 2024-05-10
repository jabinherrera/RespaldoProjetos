import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {

    public static void main(String[] args) {
        Map<String, Vehiculo> arr = new HashMap<>();
        //Permite ordenar utilizando una llave
        Vehiculo v0 = new Vehiculo("1q2w3e", 4, "negro");
        Vehiculo v1 = new Vehiculo("6y7u8i", 4, "rojo");
        Vehiculo v2 = new Vehiculo("6y7u3i", 4, "naranjo");
        Vehiculo v3 = new Vehiculo("6y2h8i", 4, "cafe");

        arr.put(v0.getPatente(), v0);
        arr.put(v1.getPatente(), v1);
        arr.put(v2.getPatente(), v2);
        arr.put(v3.getPatente(), v3);

        System.out.println(arr);

        //Hay que utilizar la llave para obtener el elemento deseado, en este caso una patente
        System.out.println(arr.get("1q2w3e"));
    }
}
