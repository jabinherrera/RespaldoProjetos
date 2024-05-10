import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Animal a0 = new Animal(4, false, true, 2);

        System.out.println("a0 = " + a0);

        Persona p0 = new Persona("Ian", 20);
        p0.adoptar(a0, "michi");






        //Formas de pasar de String a int y viceversa
        String numero = "14";
        int numeroInt = Integer.parseInt(numero);

        //Ambas forman funcionan
        String numeroString = String.valueOf(19);
        String numeroStringConcatenado = 19 + "";

        //En ArrayList dentro de <> solo se pueden usar las clases contendoras, no primitivas
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Eduardo");
        System.out.println("palabras = " + palabras);
    }
}
/*
Una clase se compone por:
Nombre, Atributos y métodos
 */
