package Personas;

import Productos.Producto;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Proveedor extends Persona{
    private String organizacion;
    private String tipoProveedor;

    public Proveedor(String rut, String nombre, int edad) {
        super(rut, nombre, edad);
    }

    @Override
    public void crearJSON() {
        //Serialization
        //Crea el archivo
        Gson pGson = new Gson();
        String stringJson = pGson.toJson(this);
        System.out.println("stringJson = " + stringJson);

        //Deserialization
        //Obtiene datos desde el archivo
        Proveedor proveedor = pGson.fromJson(stringJson, Proveedor.class);
        System.out.println("proveedor = " + proveedor);
        FileWriter writer;
        try{
            writer = new FileWriter("proveedor.json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(this,writer);
            writer.close();
        }catch (IOException e){
            System.out.println("No se pudo guardar el archivo");
        }
    }

    @Override
    public String leerJSON() {
        String texto = "";
        try {
            // create Gson instance
            Gson gson = new Gson();

            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("proveedor.json"));

            // convert JSON string to User object
            Proveedor proveedor = gson.fromJson(reader,Proveedor.class);

            // print user object
            System.out.println(proveedor);

            // close reader
            reader.close();

            texto = proveedor.toString();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return texto;
    }

    public void agregarProducto(Producto producto, int cantidad){
        producto.agregarNStock(cantidad);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Organizacion: " + organizacion + '\n' +
                "TipoProveedor: " + tipoProveedor;
    }
}
