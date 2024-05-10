import java.util.ArrayList;

public class Entrenador {
    private String nombre;
    private ArrayList<Pokemon> equipo = new ArrayList<>();

    public Entrenador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Pokemon> getEquipo() {
        return equipo;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "nombre='" + nombre + '\'' +
                ", equipo=" + equipo +
                '}';
    }
    //Agrega un pokemon al equipo
    public void agregarPokemon(Pokemon a){
        if (equipo.size()<6){
            equipo.add(a);
        }else{
            System.out.println("El equipo no puede contener mas de 6 pokemones");
        }
    }
    //Selecciona un pokemon a retornar del equipo del entrenador y lo imprime
    public Pokemon elegirPokemon(int b){
        Pokemon p = equipo.get(b);
        return p;
    }
    //Imprime el equipo del entrenador
    public void mostrarEquipo(){
        for (int i = 0; i < equipo.size(); i++) {
            elegirPokemon(i);
            System.out.println(elegirPokemon(i));
        }
    }
    //Selecciona el equipo del entrenador a
    public void desafiarEntrenador(Entrenador a){
        System.out.println("El entrenador " + this.nombre + " desafia a " + a.getNombre() + " a una pelea pokemon");
    }
}
