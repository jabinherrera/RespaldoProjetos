import java.util.ArrayList;

public class PrincipalActualizado {
    public static void main(String[] args) {

        GestorArchivo ga  = new GestorArchivo();
        String[] ruts = ga.leerArchivo("rut.txt").split("\n");
        String[] nombres = ga.leerArchivo("Nombres.txt").split("\n");
        String[] apellidos = ga.leerArchivo("Apellidos.txt").split("\n");

        ArrayList<Cliente> clientes = new ArrayList<>();

        for (String r: ruts) {
            String n = nombres[(int)(Math.random()* nombres.length)];
            String a = apellidos[(int)(Math.random()* apellidos.length)];
            clientes.add(new Cliente(r,n,a,(int)(Math.random()*100)+1,(int)(Math.random()*2),String.valueOf((long)(Math.random()*100000000)),(int)(Math.random()*2)));
        }

        for (Cliente cliente: clientes) {
            subirBase(cliente.toString(),"Clientes");
        }
    }

    private static void subirBase(String datos, String tabla) {
        String sql = "INSERT INTO "+ tabla+" VALUES ("+ datos+" );";

        System.out.println(sql);
    }
}













