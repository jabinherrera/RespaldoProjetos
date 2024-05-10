package Productos;

import Personas.Proveedor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Accesorio extends Producto{
    private String material;
    private String tipo;

    public Accesorio(int codigo, int precio, String nombre, String descripcion, String material, String tipo) {
        super(codigo, precio, nombre, descripcion);
        this.material = material;
        this.tipo = tipo;
        agregarStock();
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
        Accesorio accesorio = pGson.fromJson(stringJson, Accesorio.class);
        System.out.println("accesorio = " + accesorio);
        FileWriter writer;
        try{
            writer = new FileWriter("accesorio.json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(this,writer);
            writer.close();
        }catch (IOException e){
            System.out.println("No se pudo guardar el archivo");
        }
    }

    @Override
    public void leerJSON() {
        try {
            // create Gson instance
            Gson gson = new Gson();

            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("accesorio.json"));

            // convert JSON string to User object
            Accesorio accesorio = gson.fromJson(reader,Accesorio.class);

            // print user object
            System.out.println(accesorio);

            // close reader
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean isDisponible() {if (this.getStock() != 0) {
        return true;
    }else{
        System.out.println("No hay stock");
        return false;
        }
    }

    @Override
    public void quitarStock() {
        if (isDisponible()) {
            this.setStock(this.getStock() - 1);
        }else{
            System.out.println("No se pudo realizar la venta");
        }
    }

    @Override
    public void agregarStock() {
        this.setStock(this.getStock()+1);
    }

    @Override
    public void agregarNStock(int cantidad){
        this.setStock(this.getStock() + cantidad);
    }

    @Override
    public void actualizarDB() {

    }

    @Override
    public String toString() {
        return super.toString()+"Tipo: "+tipo+"\n"+
                "Hecho de: " + material;

    }
}
