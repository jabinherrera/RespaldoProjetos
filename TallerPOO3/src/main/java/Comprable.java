public interface Comprable {

    //Sobrecarga para elegir entre Cliente o Empresario
    public void comprarArticulo(Articulo articulo, Cliente cliente);
    public void comprarArticulo(Articulo articulo, Empresario empresario);

}