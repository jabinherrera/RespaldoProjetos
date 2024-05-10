import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaTest {

    Carta carta1;
    Carta carta2;

    @BeforeEach
    void setUp() {
        carta1 = new Carta("5", "Corazon", 5, "Rojo");
        carta2 = new Carta("8", "Pica", 8, "Negro");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getNumero0() {
        assertEquals("8", carta2.getNumero());
    }

    @Test
    void getNumero1() {
        assertNotSame(carta1, carta2);
    }

    @Test
    void getPuntos0() {
        assertEquals(5, carta1.getPuntos());
    }

    @Test
    void getPuntos1() {
        assertNotSame(carta1, carta2);
    }


}