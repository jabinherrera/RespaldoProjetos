import java.sql.*;
import java.util.ArrayList;

public class Fruteria {
    public static void main(String[] args) {

        Cliente c = new Cliente();

        GestorArchivo ga  = new GestorArchivo();
        String[] ruts = ga.leerArchivo("rut.txt").split("\r\n");
        String[] nombres = ga.leerArchivo("Nombres.txt").split("\r\n");

        ArrayList<Cliente> clientes = new ArrayList<>();

        for (String r: ruts) {
            String n = nombres[(int)(Math.random()* nombres.length)];
            System.out.println("n = " + n);
            Cliente cli = new Cliente(r,n,(int)(Math.random()*100)+10,(int)(Math.random()*2),String.valueOf((long)(Math.random()*100000000)),(int)(Math.random()*2));
            Cliente.subirBase(cli.toString(),"Clientes");
            System.out.println("cli = " + cli);

        }

        /*System.out.println(clientes.size());
        for (Cliente cliente: clientes) {
            Cliente.subirBase(cliente.toString(),"Clientes");
        }
        */
         

        clientes.clear();
    }
}
