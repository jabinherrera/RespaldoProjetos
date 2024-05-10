import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class GestorArchivo {
    public static void crearArchivo(String ruta, String contenido){
        Path archivo = Paths.get(ruta);
        try {
            Files.write(archivo, contenido.getBytes());
        } catch (IOException e) {
            System.err.println("el archivo no pudo ser creado");
        }
    }

    public static String leerArchivo(String ruta){
        Path archivo = Paths.get(ruta);
        String contenido = "";
        try {
            contenido = new String(Files.readAllBytes(archivo));
        } catch (IOException e) {
            System.err.println("El archivo no pudo ser leido");
        }
        return contenido;
    }

    public static void agregarLinea(String ruta, String contenido){
        String oldFile = leerArchivo(ruta);
        crearArchivo(ruta, oldFile+"\n"+contenido);
    }

    //--|Obtencion de rutas|--//
    public String obtenerRuta(String rutaRelativa) {
        Console console = System.console();
        if (console != null) {
            return generarRutaConsola(rutaRelativa);
        } else {
            return generarRutaIDE(rutaRelativa);
        }
    }

    private String generarRutaConsola(String rutaRelativa) {
        try {
            String userDir = obtenerRutaDeSistema("");
            File file = new File(userDir, rutaRelativa);
            return file.getAbsolutePath();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.getLogger("Se ha provocado un error en la función 'generarRutaConsola'");
        }
    }

    private String generarRutaIDE(String rutaRelativa) {
        try {
            String userDir = obtenerRutaDeSistema("\\out\\artifacts\\GestorArchivo_jar\\");
            File file = new File(userDir, rutaRelativa);
            return file.getAbsolutePath();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.getLogger("Se ha provocado un error en la función 'generarRutaIDE'");
        }
    }

    private String obtenerRutaDeSistema(String extencionDeRuta) {
        return System.getProperty("user.dir") + extencionDeRuta;
    }

    public static String[] separarPorLinea(String ruta){
        return leerArchivo(ruta).split("\r\n");
    }

}
