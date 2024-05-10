public interface Arrendable {

    //Sobrecarga para elegir entre Cliente o Empresario
    public void arrendarArticulo(Articulo articulo, Cliente cliente);
    public void arrendarArticulo(Articulo articulo, Empresario empresario);
    public void devolverPrestamo(Articulo articulo, Cliente cliente);
    public void devolverPrestamo(Articulo articulo, Empresario empresario);
}