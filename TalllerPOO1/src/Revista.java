public class Revista extends Producto{
    private String tematica;

    public Revista(String ISBN, String autor, int precio, String nombre, String tematica) {
        super(ISBN, autor, precio, nombre);
        this.tematica = tematica;
    }

    public String getTematica() {
        return tematica;
    }

    //Permite crear un archivo de texto de una revista
    public void crearRevista(GestorArchivo ga){
        ga.crearArchivo("Producto//Revista//" + this.getNombre(),
                "ISBN: " + this.getISBN() + "\n" +
                        "Autor: " + this.getAutor() + "\n" +
                        "Precio: " + this.getPrecio() + "\n" +
                        "Tematica: " + this.getTematica());
    }

    //Muestra el contenido de un archivo de texto de una revista
    public void mostrarRevista(GestorArchivo ga){
        System.out.println(ga.leerArchivo("Producto//Revista//" + this.getNombre()));
    }
}
