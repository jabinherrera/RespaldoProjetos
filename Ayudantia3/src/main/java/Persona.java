public class Persona {
    private String nombre;
    private String apellido;
    private String rut;

    public Persona(String nombre, String apellido, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }

    @Override
    public String toString() {
        return  "nombre= " + nombre + '\n' +
                "apellido= " + apellido + '\n' +
                "rut= " + rut;
    }
}
