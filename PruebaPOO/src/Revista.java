import java.util.HashMap;
import java.util.Map;

public class Revista extends Articulo implements Comprable, Arrendable{
    String tematica;

    public Revista(String nombre, int precio, String autor, String codigo, String tematica){
        super(nombre, precio, autor, codigo);
        this.tematica = tematica;

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

    public Map<String,String> arrRevista = new HashMap();

    public void añadirRevista(String codigo, String nombre){
        arrRevista.put(codigo, nombre);
        System.out.println("La revista " + nombre + " fue agregada exitosamente");
    }

    public void elegirRevista(String codigo){
        System.out.print(arrRevista.get(codigo));
        System.out.println("La revista con codigo" + codigo + " fue seleccionada exitosamente");
    }

    public void eliminarRevista(String codigo){
        arrRevista.remove(codigo);
        System.out.println("La revista con codigo " + codigo + " fue eliminada exitosamente");
    }

    @Override
    public void arrendar(String codigo) {

    }

    @Override
    public void comprar(String codigo) {

    }
}
