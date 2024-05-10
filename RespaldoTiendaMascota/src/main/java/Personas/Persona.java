package Personas;

public abstract class Persona {
    private String rut;
    private String nombre;
    private int edad;

    public Persona(String rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void crearJSON();

    public abstract String leerJSON();

    @Override
    public String toString() {
        return "'" + nombre + "',"+ "'" + rut + "'," + edad;
    }
}
