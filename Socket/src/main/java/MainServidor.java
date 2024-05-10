import java.io.IOException;

//Clase principal que hará uso del servidor
public class MainServidor {
    public static void main(String[] args) throws IOException    {
        Servidor servidor = new Servidor(); //Se crea el servidor

        System.out.println("Iniciando servidor\n");
        servidor.startServer(); //Se inicia el servidor
    }
}
