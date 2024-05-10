//Probando lo anterior con un String

public class Principal3 {
    public static void main(String[] args) {
        String p = "Palabra";                       //Es un objeto, no un primitivo
        System.out.println("p = " + p);

        Reemplazar(p, "hola mundo");
        System.out.println("p = " + p);
    }

    private static void Reemplazar(String p, String nuevoNombre) {
        p = nuevoNombre;
    }
}
/*
Los primitivos usan paso por valor,
Los arreglos paso por referencia
Los String los consideramos como otro tipo de primitivo
 */