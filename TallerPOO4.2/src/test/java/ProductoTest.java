import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ProductoTest {

    Producto p;

    @Test
    public void añadirCaracteristica(){
        p = new Producto("SSD","Almacenamiento");
        p.añadirCaracteristica("240 GB");
        assertEquals(2,p.getCaracteristicas().size());
        assertNotEquals(3,p.getCaracteristicas().size());
        assertNotEquals(1,p.getCaracteristicas().size());

    }

    @Test
    public void calcularPrecio(){
        p = new Producto("SSD","Almacenamiento");
        p.setCosto(20000);
        p.calcularPrecio(20);  //20% ganancia
        assertEquals(24000,p.getPrecio());
    }

    @Test
    public void verDescripcion(){
        p = new Producto("SSD","Almacenamiento");
        assertEquals("SSD:Almacenamiento",p.toString());
    }

}