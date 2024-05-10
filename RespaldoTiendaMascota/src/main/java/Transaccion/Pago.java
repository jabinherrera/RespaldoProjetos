package Transaccion;

import Interface.Mostrable;
import Personas.Persona;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Pago implements Mostrable {
    private int codigo;
    private String tipo;
    private int monto;
    private String fecha;
    private Persona cobrador;
    private Persona pagador;
    private String direccion;

    public Pago(int codigo, String tipo, int monto, String fecha, Persona cobrador, Persona pagador, String direccion) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.cobrador = cobrador;
        this.pagador = pagador;
        this.direccion = direccion;
    }

    public void crearJSON() {
        //Serialization
        //Crea el archivo
        Gson pGson = new Gson();
        String stringJson = pGson.toJson(this);
        System.out.println("stringJson = " + stringJson);

        //Deserialization
        //Obtiene datos desde el archivo
        Pago pago = pGson.fromJson(stringJson, Pago.class);
        System.out.println("pago = " + pago);
        FileWriter writer;
        try{
            writer = new FileWriter("pago.json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(this,writer);
            writer.close();
        }catch (IOException e){
            System.out.println("No se pudo guardar el archivo");
        }
    }

    public void leerJSON(){try {
        // create Gson instance
        Gson gson = new Gson();

        // create a reader
        Reader reader = Files.newBufferedReader(Paths.get("pago.json"));

        // convert JSON string to User object
     Pago pago = gson.fromJson(reader,Pago.class);

        // print user object
        System.out.println(pago);

        // close reader
        reader.close();

    } catch (Exception ex) {
        ex.printStackTrace();
    }};

    @Override
    public void imprimirEnPantalla() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return
                "Transaccion numero: " + codigo +"\n"+
                "Transaccion.Pago con " + tipo + "\n"+
                "$ " + monto +"\n"+
                "Realizado el " + fecha+ ", en" + direccion+".";

    }
}
