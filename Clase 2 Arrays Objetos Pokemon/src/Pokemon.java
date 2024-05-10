import java.util.ArrayList;
import java.util.Arrays;

public class Pokemon {
    private int numero;
    private String nombre;
    private int vida;
    private String[] tipo;
    private int ataque;
    private int defensa;
    private int nivel;
    private ArrayList<Ataque> ataques = new ArrayList<>();

    public Pokemon(int numero, String nombre, String[] tipo) {
        this.numero = numero;
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = 100;
    }

    public Pokemon(int numero, String nombre, int vida, String[] tipo, int ataque, int defensa, int nivel) {
        this.numero = numero;
        this.nombre = nombre;
        this.vida = vida;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }



    @Override
    public String toString() {
        return "Pokemon{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", tipo=" + Arrays.toString(tipo) +
                ", nivel=" + nivel +
                '}';
    }
    //Agrega un ataque a un pokemon
    public void agregarAtaque(Ataque a){
        if(ataques.size()<4){
            ataques.add(a);
        }else{
            System.out.println("No se pueden agregar mas ataques");
        }
    }
    //Permite que un pokemon ataque a otro con un ataque aleatorio
    public void atacar(Pokemon p){
        Ataque a = ataques.get((int)Math.random()*ataques.size());
        int ataqueTotal = a.getDaño()+this.ataque;
        p.recibirDaño(ataqueTotal);
    }
    //Permite que un pokemon reciba daño cuando otro pokemon ataca
    private void recibirDaño(int ataqueTotal) {
        int daño = ataqueTotal-this.defensa;
        this.vida -=daño;
    }
}
