//Cliente "natural"

import java.util.HashMap;

public class Cliente extends Persona {

    private HashMap arriendosCliente;
    private HashMap comprasCliente;

    public Cliente(String nombre, String rut, int dinero) {
        super(nombre, rut, dinero);
    }

    //Constructor para testigoFuente
    public Cliente(String nombre, String rut, int dinero, String telefonoContacto) {
        super(nombre, rut, dinero);
        String telefono = telefonoContacto;
    }

    @Override
    public void arrendarParaInventarioPersona(Articulo articulo) {
        if (getDinero() >= articulo.getPrecio()) {
            arriendosCliente.put(articulo.getCodigo(), articulo);
            setDinero(getDinero()-articulo.getPrecio());
            System.out.println("Arriendo exitoso");
            System.out.println("Su total de dinero actualmente es: " + getDinero());
        }else{
            System.out.println("Dinero insuficiente para esta accion");
        }
    }

    @Override
    public void comprarParaInventarioPersona(Articulo articulo) {
        if (getDinero() >= articulo.getPrecio()) {
            comprasCliente.put(articulo.getCodigo(), articulo);
            setDinero(getDinero()-articulo.getPrecio());
            System.out.println("Compra Exitosa");
            System.out.println("Su total de dinero actualmente es: " + getDinero());
        }else{
            System.out.println("Dinero insuficiente para esta accion");
        }
    }

    @Override
    public void retornarPrestamo(Articulo articulo) {
        arriendosCliente.remove(articulo.getCodigo());
        System.out.println("Se ha retornado un articulo");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "arriendosCliente=" + arriendosCliente +
                ", comprasCliente=" + comprasCliente +
                '}';
    }
}