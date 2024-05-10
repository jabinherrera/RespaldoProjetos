//Como funcionaria lo anterior con un objeto

public class Principal4 {
    static int numero = 0;                         //Aquí se crea una variable global, es el mismo lugar de los atributos, por lo que necesita ser estática para utilizarse como variable

    public static void main(String[] args) {
        Persona p = new Persona("Armin", 20);
        System.out.println("p = " + p);

        mostar(p);
        modificarNombre(p, "Axel");
        mostar(p);

        System.out.println(numero);                 //No se podría utilizar la variable "número" aquí si no fuera estática
    }

    private static void modificarNombre(Persona p, String nuevoNombre) {
        p.setNombre(nuevoNombre);
    }

    private static void mostar(Persona p) {
        System.out.println("p = " + p);
        System.out.println(p.getNombre());
        System.out.println(p.getEdad());
    }
}
