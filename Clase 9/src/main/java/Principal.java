import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola, Maven");
        Persona p = new Persona("Matias", 12);

        //Serialization
        //Crea el archivo
        Gson pGson = new Gson();
        String stringJson = pGson.toJson(p);
        System.out.println("stringJson = " + stringJson);

        //Deserialization
        //Obtiene datos desde el archivo
        Persona p2 = pGson.fromJson(stringJson, Persona.class);
        System.out.println("p2 = " + p2);
        FileWriter writer;
        try{
            writer = new FileWriter("persona.json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(p,writer);
            writer.close();
        }catch (IOException e){
            System.out.println("No se pudo guardar el archivo");
        }

        //Agregar utilizando gestor de archivos
        //System.out.println("p = " + p);
        //GestorArchivo.crearArchivo("persona.txt", p.toString());
        //String texto = GestorArchivo.leerArchivo("persona.txt");
        //System.out.println("texto = " + texto);
        //ArrayList<Persona> personas = new ArrayList<>();
        //split elimina lo que se escriba en regex, y crea un arreglo de String, es decir String[]
        //for (int i = 0; i < texto.split("\n").length; i++) {
        // personas.add(new Persona(texto.split("\n")[i]));
        //}
        //System.out.println("personas = " + personas);
        //System.out.println(personas.size());
    }
}
