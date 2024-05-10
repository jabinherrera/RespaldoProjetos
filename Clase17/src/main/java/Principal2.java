import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Actividad con rut
public class Principal2 {
        public static void main(String[] args) {
                List<String> rut = new ArrayList<>();
                List<String> rutValidado = new ArrayList<>();

                String texto = GestorArchivo.leerArchivo("src/main/java/rut.txt");

                for (int i = 0; i < texto.split("\r\n").length; i++) {
                        rut.add((texto.split("\r\n")[i]));
                        }

                //Para ver el contenido de el arreglo rut antes de ser validados
                //rut.stream().forEach(System.out::println);

                rutValidado = rut.stream()
                        //filter, filtra en base a una funcion que tengamos, en este caso, isMayuscula
                        .filter(Principal2::validarRut)
                        //lo agrega a una lista, en este caso, nombresMayusculas pues esta antes del "="
                        .collect(Collectors.toList());

                System.out.println(rut.size());
                System.out.println(rutValidado.size());
                //rutValidado.forEach(System.out::println);



        }

        public static boolean validarRut(String rut) {

                boolean validacion = false;
                try {
                        rut = rut.toUpperCase();
                        rut = rut.replace(".", "");
                        rut = rut.replace("-", "");
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