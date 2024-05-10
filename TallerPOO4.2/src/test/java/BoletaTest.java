import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoletaTest {

    Boleta b = new Boleta();

    @Test
    public void asignarCodigo(){
        b.generarCodigo();
        assertTrue(b.getCodigo()>0);
    }

    @Test
    public void agregarProducto(){
        Producto p = new Producto("SSD","Almacenamiento");
        p.setCosto(20000);
        p.calcularPrecio(20);

        b.agregarProducto(p,1);
        assertEquals(1,b.totalProductos()); // cantidad de productos en la boleta
        b.agregarProducto(p,2);
        assertEquals(3,b.totalProductos());
        assertEquals(1,b.variedadProductos()); //total productos distintos

    }

    public void obtenerTotal(){
        Producto p = new Producto("SSD","Almacenamiento");
        b.agregarProducto(p,1);
        assertEquals(0 ,b.obtenerTotal());
        assertFalse(b.hayProductos());
        p.setCosto(20000);
        p.calcularPrecio(20);
        b.agregarProducto(p,1);
        assertEquals(1 ,b.obtenerTotal());
        assertTrue(b.hayProductos());

    }

}