import java.util.HashMap;
import java.util.Map;

public class Libro extends Articulo implements Comprable, Arrendable{
    String tematica;
    String genero;

    public Libro(String nombre, int precio, String autor, String codigo, String tematica, String genero){
        super(nombre, precio, autor, codigo);
        this.tematica = tematica;
        this.genero = genero;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Map<String,String> arrLibro = new HashMap();

    public void añadirLibro(String codigo, String nombre){
        arrLibro.put(codigo, nombre);
        System.out.println("El libro " + nombre + " fue agregado exitosamente");
    }

    public String elegirLibro(String codigo){
        System.out.print(arrLibro.get(codigo));
        System.out.println("El libro con codigo" + codigo + " fue seleccionado exitosamente");
        return arrLibro.get(codigo);
    }

    public void eliminarLibro(String codigo){
        arrLibro.remove(codigo);
        System.out.println("El libro con codigo " + codigo + " fue eliminado exitosamente");
    }

    @Override
    public void arrendar(String codigo) {

    }

    @Override
    public void comprar(String codigo) {

    }
}
