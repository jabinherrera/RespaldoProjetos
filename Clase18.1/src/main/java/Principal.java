import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> cancion = new ArrayList<>();

        String texto = GestorArchivo.leerArchivo("src/main/java/Cancion.txt");
        String[] linea = texto.split("\n");
        

        for (int i = 0; i < texto.split("\s").length; i++) {
            cancion.add((texto.split("\s")[i]));
        }

        String palabraLarga = cancion.stream()
                .reduce((p1 ,p2) ->
                        p1.length()>p2.length() ? p1:p2).get();

        String palabraLarga2 = cancion.stream()
                .reduce((p1 ,p2) -> {
                    if (p1.length() > p2.length()) {
                        return p1;
                    }else {
                        return p2;
                    }
                }).get();

        System.out.println(palabraLarga);

        //cancion.stream().forEach(System.out::println);

    }

    public class GestorArchivo {

        public static void crearArchivo(String ruta, String contenido) {
            Path archivo = Paths.get(ruta);
            try {
                Files.write(archivo, contenido.getBytes());
            } catch (IOException e) {
                System.err.println("el archivo no pudo ser creado");
            }
        }

        public static String leerArchivo(String ruta) {
            Path archivo = Paths.get(ruta);
            String contenido = "";
            try {
                contenido = new String(Files.readAllBytes(archivo));
            } catch (IOException e) {
                System.err.println("El archivo no pudo ser leido");
            }
            return contenido;
        }

        public static void agregarLinea(String ruta, String contenido) {
            String oldFile = leerArchivo(ruta);
            crearArchivo(ruta, oldFile + "\n" + contenido);
        }

        public static void borrarArchivo(String ruta) {
            Path archivo = Paths.get(ruta);
            try {
                Files.deleteIfExists(archivo);
            } catch (IOException e) {
                System.err.println("El archivo no pudo ser eliminado");
            }
        }
    }
}
