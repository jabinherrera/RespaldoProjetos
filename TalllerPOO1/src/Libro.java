public class Libro extends Producto {
    private int edadMin;

    public Libro(String ISBN, String autor, int precio, String nombre, int edadMin) {
        super(ISBN, autor, precio, nombre);
        this.edadMin = edadMin;
    }

    public int getEdadMin() {
        return edadMin;
    }

    //Permite crear un archivo de texto de un libro
    public void crearLibro(GestorArchivo ga){
        ga.crearArchivo("Producto//Libro//" + this.getNombre(),
                "ISBN: " + this.getISBN() + "\n" +
                        "Autor: " + this.getAutor() + "\n" +
                        "Precio: " + this.getPrecio() + "\n" +
                        "Edad Minima: " + this.edadMin);
    }

    //Muestra el contenido de un archivo de texto de un libro
    public void mostrarLibro(GestorArchivo ga){
        System.out.println(ga.leerArchivo("Producto//Libro//" + this.getNombre()));
    }
}
