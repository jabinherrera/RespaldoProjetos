public class Producto {
    private String nombre;
    private int cod;
    private int precio;
    private Persona autor;
    private int edad;
    private String genero;
    private String aplicacion;
    private String tematica;
    private String tipo;

    public Producto(String nombre, int cod, int precio, Persona autor, int edad, String tipo) {
        this.nombre = nombre;
        this.cod = cod;
        this.precio = precio;
        this.autor = autor;
        this.edad = edad;
        this.tipo = tipo;
    }

    public Producto(String nombre, int cod, int precio, Persona autor, int edad, String genero, String tipo) {
        this.nombre = nombre;
        this.cod = cod;
        this.precio = precio;
        this.autor = autor;
        this.edad = edad;
        this.genero = genero;
        this.tipo = tipo;
    }
}
