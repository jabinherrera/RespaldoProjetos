public class Manual extends Producto {
    private String areaAplicacion;

    public Manual(String ISBN, String autor, int precio, String nombre, String areaAplicacion) {
        super(ISBN, autor, precio, nombre);
        this.areaAplicacion = areaAplicacion;
    }

    public String getAreaAplicacion() {
        return areaAplicacion;
    }

    //Permite crear archivo de texto de manuales
    public void crearManual(GestorArchivo ga){
        ga.crearArchivo("Producto//Manual//" + this.getNombre(),
                "ISBN: " + this.getISBN() + "\n" +
                        "Autor: " + this.getAutor() + "\n" +
                        "Precio: " + this.getPrecio() + "\n" +
                        "Area de aplicacion: " + this.getAreaAplicacion());
    }

    //Muestra el contenido de un archivo de texto de un manual
    public void mostrarManual(GestorArchivo ga){
        System.out.println(ga.leerArchivo("Producto//Manual//" + this.getNombre()));
    }
}
