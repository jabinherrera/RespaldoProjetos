public class Estudiante extends Persona implements Nombrable{           //Puede haber mas de 1 interfaz implementada
    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
    }


    @Override
    public void decirNombre(String nombre) {
        System.out.println("mi apodo es "+ nombre);
    }
}
