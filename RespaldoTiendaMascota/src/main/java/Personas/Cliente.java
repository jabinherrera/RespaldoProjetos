package Personas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    static final String DB_URL = "jdbc:mysql://localhost/tienda_mascota";
    static final String USER = "uwu";
    static final String PASS = "12345678qwerty";


    public Cliente(String rut, String nombre, int edad) {
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
        Cliente cliente = pGson.fromJson(stringJson, Cliente.class);
        System.out.println("cliente = " + cliente);
        FileWriter writer;
        try {
            writer = new FileWriter("cliente.json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(this, writer);
            writer.close();
        } catch (IOException e) {
            System.out.println("No se pudo guardar el archivo");
        }
    }


    public void crearJSON2(Cliente c) {
        //Serialization
        //Crea el archivo
        Gson pGson = new Gson();
        String stringJson = pGson.toJson(this);
        String stringJson2 = pGson.toJson(c);
        System.out.println("stringJson = " + stringJson);

        //Deserialization
        //Obtiene datos desde el archivo

        Cliente cliente = pGson.fromJson(stringJson, Cliente.class);
        Cliente cliente2 = pGson.fromJson(stringJson, Cliente.class);
        System.out.println("cliente = " + cliente);
        FileWriter writer;
        try {
            writer = new FileWriter("cliente.json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(this, writer);
            gson.toJson(c, writer);
            writer.close();
        } catch (IOException e) {
            System.out.println("No se pudo guardar el archivo");
        }
    }

    //metodo sacado desde: https://attacomsian.com/blog/gson-read-json-file
    public String leerJSON() {
        String texto = "";
        try {
            // create Gson instance
            Gson gson = new Gson();

            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("cliente.json"));

            // convert JSON string to User object
            Cliente cliente = gson.fromJson(reader, Cliente.class);

            // close reader
            reader.close();

            texto = cliente.toString();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return texto;
    }

    public Cliente leerJSON2() {
        Cliente cliente = null;
        try {
            // create Gson instance
            Gson gson = new Gson();

            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("cliente.json"));

            // convert JSON string to User object
            cliente = gson.fromJson(reader, Cliente.class);

            // print user object
            System.out.println(cliente);

            // close reader
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cliente;
    }

    //todo crear metodo editarJSON
    public void editarJSON(){
        crearJSON2(leerJSON2());
    }

    public List<String> crearList() {
        List<String> clientes = new ArrayList<>();

        String texto = leerJSON();
        String[] linea = texto.split("\n");


        for (int i = 0; i < texto.split("\s").length; i++) {
            clientes.add((texto.split("\s")[i]));
        }
        return clientes;


    }

    public void agregarCliente(String rut, String nombre, int edad) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
        ) {
            System.out.println("Insertando datos en la tabla...");

            String sql = "INSERT INTO cliente (rut, nombre, edad) values " + "(" + rut + nombre + edad + ");";
            ;
            stmt.executeUpdate(sql);
            System.out.println(sql);

            System.out.println("Datos insertados en la tabla...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void subirClientes(){
        var clientes = crearList();
        int r = 0;
        int n = 1;
        int e = 2;
        for (String cliente : clientes) {
            String rut = clientes.get(r);
            String nombre = clientes.get(n);
            int edad = Integer.parseInt(clientes.get(e));
            agregarCliente(rut, nombre, edad);
            r = +3;
            n = +3;
            e = +3;
        }
    }


    @Override
    public String toString () {
        return super.toString()+"\n";
    }
}

