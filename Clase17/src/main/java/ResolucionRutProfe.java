import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ResolucionRutProfe {
    public static void main(String[] args) {
        String ruta ="src/rut.txt";
        //obtenerDatos() es como el profe llamo a su metodo para leer archivos
        List<String> listaRut = Arrays.stream(obtenerDatos(ruta).split("\n"))
                .toList()
                .stream()
                .filter(ResolucionRutProfe::validarRut)
                .collect(Collectors.toList());
        System.out.println("listaRut = " + listaRut);
        System.out.println("listaRut.size() = " + listaRut.size());

    }

    public static boolean validarRut(String rut) {

        boolean validacion = false;
        try {
            rut = rut.toUpperCase()
                    .replace(".","")
                    .replace("-","");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }
        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    private static String obtenerDatos(String ruta) {
        Path p = Paths.get(ruta);
        String datos = "";
        try{
            datos= new String(Files.readAllBytes(p));
        }catch(IOException e){
            System.err.println("no se pudo leer el archivo");
        }
        return datos;
    }

}
