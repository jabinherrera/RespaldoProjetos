package org.example;


import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class CarroDeCompraTest {

    private static ArrayList<Producto> products = new ArrayList<>();
    private static Producto producto1 = new Producto("1232", "Pescadito", "Pescado para comer", 1000);
    private static Producto producto2 = new Producto("8283", "Papita", "Papitas con oregano", 600);

    private static Producto nuevoProducto = new Producto("9732", "nuevoProducto", "Producto de ejemplo para el test", 2000);

    private static CarroDeCompra carroDeCompra = new CarroDeCompra();


    @BeforeAll
    public static void init() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    public void beforeEach() {
        products.add(producto1);
        products.add(producto2);
        carroDeCompra.setProducts(products);
    }

    @AfterEach
    public void AfterEach() {
        products.clear();
    }

    @AfterAll
    public static void teardown() {
        System.out.println("After all tests");
        products.clear();
    }


    @Test
    @DisplayName("Obtener balance")
    public void testObtenerBalance() {
        double balance = carroDeCompra.obtenerBalance();
        assertEquals(1600, balance);
    }

    @Test
    @DisplayName("Agregar item")
    public void testAgregarItem() {
        carroDeCompra.agregarItem(nuevoProducto);
        assertSame(products.get(products.size()-1),nuevoProducto);
    }

    @Test
    @DisplayName("Quitar item")
    public void testRemoverItem() {
        carroDeCompra.removerItem(1);
        assertEquals(1, products.size());
    }

    //No es lo mismo crear 2 objetos iguales que añadir el mismo objeto 2 veces
    @Test
    @DisplayName("Obtener cantidad de items")
    public void testObtenerCantidadItem() {
        carroDeCompra.agregarItem(producto2);
        int cantidadProducto2Repetido = carroDeCompra.obtenerCantidadItem(producto2);
        assertEquals(2, cantidadProducto2Repetido);
    }

    @Test
    @DisplayName("Vaciar carrito")
    public void testVaciar() {
        carroDeCompra.vaciar();
        assertEquals(0, products.size());
    }

}