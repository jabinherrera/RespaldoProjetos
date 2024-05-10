import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MazoTest {

    Mazo mazo1;
    Mazo mazo2;

    @BeforeEach
    void setUp() {
        mazo1 = new Mazo();
        mazo2 = new Mazo();
        mazo2.generarMazo("Rojo");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getMazo() {
        assertTrue(mazo1.getMazo().isEmpty());
    }

    @Test
    void generarMazo(){
        assertFalse(mazo2.getMazo().isEmpty());
    }
}