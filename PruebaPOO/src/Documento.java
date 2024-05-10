import java.util.HashMap;
import java.util.Map;

public class Documento extends Articulo implements Comprable, Arrendable{
    String clasificacionA;

    public Documento(String nombre, int precio, String autor, String codigo, String clasificacionA){
        super(nombre, precio, autor, codigo);
        this.clasificacionA = clasificacionA;

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

    public String getClasificacionA() {
        return clasificacionA;
    }

    public void setClasificacionA(String clasificacionA) {
        this.clasificacionA = clasificacionA;
    }

    public Map<String,String> arrDocumento = new HashMap();

    public void añadirDocumento(String codigo, String nombre){
        arrDocumento.put(codigo, nombre);
        System.out.println("El documento " + nombre + " fue agregado exitosamente");
    }

    public void elegirDocumento(String codigo){
        System.out.print(arrDocumento.get(codigo));
        System.out.println("El documento con codigo" + codigo + " fue seleccionado exitosamente");
    }

    public void eliminarDocumento(String codigo){
        arrDocumento.remove(codigo);
        System.out.println("El libro con documento " + codigo + " fue eliminado exitosamente");
    }

    @Override
    public void arrendar(String codigo) {

    }

    @Override
    public void comprar(String codigo) {

    }
}
