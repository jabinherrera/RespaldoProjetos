import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//EXPRESIONES LAMBDA
//PROGRAMACION FUNCIONAL
public class Principal5 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("IAN", "axel", "JOAQUIN", "ROBERTO");
        List<String> nombresMayuscula;
        nombresMayuscula = nombres.stream()
                //no siempre hay retorno, por lo que se borra el cuerpo ;}
                //se borra el String
                //filter asume que queremos los elementos que retornen verdadero
                //filter funciona con booleanos
                .filter(p->p.equals(p.toUpperCase()))
                .collect(Collectors.toList());
    }
}
