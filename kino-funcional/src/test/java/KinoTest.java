import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class KinoTest {

    @org.junit.Test
    public void generarNumeros() {

        Kino.generarNumeros().forEach(System.out::println);
    }

    @Test
    public void ordenarNumeros(){

        Kino.ordenarLista(Kino.generarNumeros()).forEach(System.out::println);
    }

    @Test
    public void testObtenerAciertos(){

        List<Integer> numerosElegidos = new ArrayList<>(Arrays.asList(2,3,4,5,11,13,8,9,10));
        List<Integer> numerosSorteados = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9,10));

        List<Integer> aciertosEsperados = new ArrayList<>(Arrays.asList(2,3,4,5,8,9,10));
        List<Integer> aciertosObtenidos = Kino.obtenerAciertos(numerosSorteados,numerosElegidos);

        System.out.println(aciertosObtenidos.size());

        Assert.assertEquals(aciertosEsperados, aciertosObtenidos);
    }

    @Test
    public void testJugar(){
        List<Integer> numerosElegidos = new ArrayList<>(Arrays.asList(2,3,4,5,11,13,8,9,10));
        List<Integer> numerosSorteados = Kino.generarNumeros();
        List<Integer> aciertos = Kino.obtenerAciertos(numerosSorteados, numerosElegidos);
        System.out.println("Aciertos: "+aciertos.size());
    }
}