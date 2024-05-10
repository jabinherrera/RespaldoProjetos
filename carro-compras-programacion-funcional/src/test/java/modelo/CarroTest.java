package modelo;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CarroTest {

    Producto p1 = new Producto();
    Producto p2 = new Producto();
    Producto p3 = new Producto();
    Carro carro = new Carro();

    @Before
    public void setUp() {

        p1.setCodigo("asd123");
        p1.setPrecio(4);
        p1.setNombre("Televisor");

        p2.setCodigo("sdf345");
        p2.setPrecio(5);
        p2.setNombre("Refrigerador");

        p3.setCodigo("fgsd23");
        p3.setPrecio(6);
        p3.setNombre("Radio");

        carro.agregarItem(p1);
        carro.agregarItem(p2);
        carro.agregarItem(p3);

    }

    @Test
    public void tesFiltrar(){

        List<Producto> lista = carro.filtrar("T");
        int cantidadEsperada = 1;
        int cantidadObtenida = lista.size();
        assertEquals(cantidadEsperada, cantidadObtenida);
    }

    @Test
    public void obtenerTotal() {

        double totalEsperado = 15;
        double totalObtendio = carro.obtenerTotal();
        assertEquals(totalEsperado,totalObtendio, 0.1);
    }


    @Test
    public void removerItem() {

    }

    @Test
    public void obtenerCantidadItems() {
        int cantidadEsperada = 3;
        int cantidadObtenida = carro.obtenerCantidadItems();
        assertEquals(cantidadEsperada, cantidadObtenida);
    }

    @Test
    public void vaciar() {

        int cantidadEsperada = 0;
        carro.vaciar();
        int cantidadObtenida = carro.obtenerCantidadItems();
        assertEquals(cantidadEsperada, cantidadObtenida);
    }

}