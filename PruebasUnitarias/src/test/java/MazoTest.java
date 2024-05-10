import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MazoTest {
    Mazo m1 = new Mazo();
    Mazo m2 = new Mazo();
    String c1;
    String c2;


    public MazoTest(){

    }

    @BeforeAll
    public static void setUpClass(){

    }

    @AfterAll
    public static void tearDownClass(){

    }

    @BeforeEach
    void setUp() {
        m1.generarMazo("Negro");
        m2.generarMazo("Rojo");
        c1 = "Negro";
        c2 = "Rojo";
    }

    @AfterEach
    void tearDown() {
    }




    @Test
    void mostrarCartas() {
    }

    @Test
    void generarMazo() {
        ArrayList<Carta> obtenido = m1.getMazo();
        Mazo esp = new Mazo(c1);
        ArrayList<Carta> esperado = esp.getMazo();
        /* use todo mi tiempo en esto y no logre nada :c */

        assertSame(esperado,obtenido);
    }

    @Test
    void repartir() {

    }
}