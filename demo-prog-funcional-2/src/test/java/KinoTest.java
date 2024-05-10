import org.junit.Test;

import static org.junit.Assert.*;

public class KinoTest {
    @Test
    public void generarNumeros() {

        Kino.generarNumeros().forEach(System.out::println);
    }

}