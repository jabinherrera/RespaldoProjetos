public class Reportajes extends Articulo{

    private Empresario autor;
    private Cliente testigoFuente;

    public Reportajes(String titulo, int precio, String autores, int codigo, int disponibilidad, Empresario autor, Cliente testigoFuente) {
        super(titulo, precio, autores, codigo, disponibilidad);
        this.autor = autor;
        this.testigoFuente = testigoFuente;
    }
}
