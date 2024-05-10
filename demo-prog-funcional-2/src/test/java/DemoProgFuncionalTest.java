import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DemoProgFuncionalTest {

    @Test
    public void testBorrarElemento() {


        List<String> nombres = new ArrayList<>();
        nombres.add("juan");
        nombres.add("maria");

        DemoProgFuncional.removerElemento(nombres, "maria");

    }

    @Test
    public void testTransformarNumeros(){

        List<Integer> numeros = Arrays.asList(2,3,5,6,7,8);
        DemoProgFuncional.transformarDatos(numeros, 2);

    }

}