import java.io.IOException;

//Clase principal que hará uso del cliente
public class MainCliente{
    public static void main(String[] args) throws IOException{
        Cliente cliente = new Cliente(); //Se crea el cliente

        System.out.println("Iniciando cliente\n");
        cliente.startClient(); //Se inicia el cliente
    }
}