public class Producto {
    private String ISBN;
    private String autor;
    private int precio;
    private String nombre;

    public Producto(String ISBN, String autor, int precio, String nombre) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.precio = precio;
        this.nombre = nombre;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
