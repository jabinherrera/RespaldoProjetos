import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PuntoTest {
    //Inicializados
    Punto p1;
    Punto p2;

    @AfterAll
        static void afterAll(){
    }

    @BeforeAll
        static void beforeAll(){
    }

    @BeforeEach
    void setUp() {
        p1 = new Punto();
        p2 = new Punto();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void punto() {
    }

    @Test
    void testPunto() {
    }

    //ejemplo, pero obviamente no debería tener mas de 1 assert
    //@ParameterizedTest
    //@ValueSource(ints = {0, 2, 3, 4, 5 , 6, 5})
    @Tag("Dato")
    @Order(2)
    @RepeatedTest(2)
    void getX(int X){
        //  assertEquals(X, p1.getX());
        assertEquals(0, p1.getX());
    //@Test
    //void getX() {
        //assertEquals(0, p1.getX());
        //assertEquals(0, p2.getX());
        //assertTrue(0==p1.getX());
        //assertFalse(3==p1.getX(), "Exito");
        //assertNotEquals(3, p1.getX());
    }
    @Disabled("Not implemented")
    @Test
        void getY() {
    }

    @Disabled("Not implemented")
    @Test
    void obtenerPuntoMedio() {
    }

    @DisplayName("Obtener distancia entre 2 puntos")
    @Test
    @Tag("Dato")
    @Order(1)
    void obtenerDistancia() {
        assertEquals(0, p1.obtenerDistancia(p2));
    }

    @Disabled("Not implemented")
    @Test
    void testToString() {
    }

    @Nested
    @DisplayName("Test anidados")
    class PuntosAvanzados{
        @Test
        void testGetX(){
            assertEquals(0,p1.getX());
        }
    }
}