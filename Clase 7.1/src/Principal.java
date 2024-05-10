import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        if(e.validarRut()){
            System.out.println("rut validado");
        }

        //No se puede crear una instancia de Persona porque es una clase abstracta
        //Persona p = new Persona();

        //List es una interfaz
        List<String> nombre = new ArrayList<>();
        nombre.add("Juan");

        //Asi se puede implementar una interfase
        Mostrable m = new Estudiante();
        m.mostrarEdad();
    }
}
