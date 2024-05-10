public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String datos){
        this.nombre = datos.split(";")[0];
        this.edad = Integer.parseInt(datos.split(";")[1]);
    }

    @Override
    public String toString() {
        return nombre + ";" + edad;
    }
}
