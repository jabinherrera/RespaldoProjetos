import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private boolean autorizacion;
    private ArrayList<Animal> mascotas = new ArrayList<>();

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setAutorizacion(boolean autorizacion) {
        this.autorizacion = autorizacion;
    }

    public void adoptar(Animal animal, String nombreAnimal) {
        if (this.autorizacion) {
            animal.setNombre(nombreAnimal);
            mascotas.add(animal);
        }else{
            System.out.println("No esta autorizado para adoptar");
        }
    }

    public void solicitarAutorizacion(){
        System.out.println("Esta dispuesto a cuidar a su mascota");
        Scanner teclado = new Scanner(System.in);
        System.out.println("si/no");
        String respuesta = teclado.next();
        this.autorizacion = respuesta.toLowerCase().equals("si");
    }

    public static String leerArchivo(String ruta){
        Path archivo = Paths.get(ruta);
        String contenido = "";
        try {
            contenido = new String(Files.readAllBytes(archivo));
        } catch (IOException e) {
            System.err.println("El archivo no pudo ser leido");
        }
        System.out.println(contenido);
        return contenido;
    }


}
