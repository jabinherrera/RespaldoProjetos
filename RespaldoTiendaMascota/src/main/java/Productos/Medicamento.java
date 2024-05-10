package Productos;

import Personas.Cliente;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;

public class Medicamento extends Producto{
    private Date fechaElaboracion;
    private Date fechaVencimiento;
    private String tipoUso;

    public Medicamento(int codigo, int precio, String nombre, String descripcion, Date fechaElaboracion, Date fechaVencimiento, String tipoUso) {
        super(codigo, precio, nombre, descripcion);
        this.fechaElaboracion = fechaElaboracion;
        this.fechaVencimiento = fechaVencimiento;
        this.tipoUso = tipoUso;
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
        Medicamento medicamento = pGson.fromJson(stringJson, Medicamento.class);
        System.out.println("medicamento = " + medicamento);
        FileWriter writer;
        try{
            writer = new FileWriter("medicamento.json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(this,writer);
            writer.close();
        }catch (IOException e){
            System.out.println("No se pudo guardar el archivo");
        }
    }

    @Override
    public void leerJSON(){try {
        // create Gson instance
        Gson gson = new Gson();

        // create a reader
        Reader reader = Files.newBufferedReader(Paths.get("medicamento.json"));

        // convert JSON string to User object
        Medicamento medicamento = gson.fromJson(reader,Medicamento.class);

        // print user object
        System.out.println(medicamento);

        // close reader
        reader.close();

    } catch (Exception ex) {
        ex.printStackTrace();
    }};
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
        return  super.toString()+
                "Fecha elaboracion: " + fechaElaboracion + "\n" +
                "Fecha caducacion: " + fechaVencimiento + "\n" +
                "Uso: " + tipoUso;
    }
}
