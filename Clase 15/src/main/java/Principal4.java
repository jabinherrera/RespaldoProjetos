import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//EXPRESIONES LAMBDA
//PROGRAMACION FUNCIONAL
public class Principal4 {
    public static void main(String[] args) {        List<String> nombres = Arrays.asList("IAN", "axel", "JOAQUIN", "ROBERTO");
        List<String> nombresMayuscula;
        nombresMayuscula = nombres.stream()
                //Expresiones Lambda
                //Se crea un metodo en el mismo momento
                //String p seria el parametro de entrada
                //-> indica que es una funcion Lambda, se llama "Operador Lambda"
                //lo que esta entre {} es el cuerpo del metodo
                //este tipo de metodo no tienen nombre
                //las expresiones lambda pueden ser pasadas como parametros
                .filter((String p)->{return p.equals(p.toUpperCase());})
                .collect(Collectors.toList());
    }
}