import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ManoTest {

    Mano mano1;
    Mano mano2;
    Carta carta;

    @BeforeEach
    void setUp() {
        mano1 = new Mano("Jabin");
        mano2 = new Mano("Juan");
        carta = new Carta("5", "Corazon", 5, "Rojo");
        mano1.añadir(carta);
        mano2.añadir(carta);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void añadir0() {
        assertNotNull(mano1);
    }

    @Test
    void añadir1() {
        assertNotSame(mano1, mano2);
    }

    @Test
    void añadir2() {
        assertNotSame(mano1, mano2);
    }

    @Test
    void sumarPuntos() {
        assertEquals(5, mano1.sumarPuntos());
    }
}