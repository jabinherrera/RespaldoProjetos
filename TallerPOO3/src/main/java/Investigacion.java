public class Investigacion extends Articulo{

    private Empresario autor;
    private Persona corrector;
    private String estado;

    public Investigacion(String titulo, int precio, String autores, int codigo, int disponibilidad, Empresario autor, Persona corrector, String estado) {
        super(titulo, precio, autores, codigo, disponibilidad);
        this.autor = autor;
        this.corrector = corrector;
        this.estado = estado;
    }
}
