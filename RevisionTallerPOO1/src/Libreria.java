import java.util.Date;

public class Libreria {
    public static void main(String[] args) {
        Persona autor0 = new Persona("Edgar", Tipo.autor.toString());
        Persona vendedor0 = new Persona("Marco", "21414395-k", Tipo.vendedor.toString(), new Date(System.currentTimeMillis()));
        Persona cliente0 = new Persona("Priscila", "21414395-k", Tipo.cliente.toString(), new Date(System.currentTimeMillis()));

    }
}
