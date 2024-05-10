public class Enfermera extends Entrenador {

    public Enfermera(String nombre) {
        super(nombre);
    }
    //Curar individual
    public void curar(Pokemon a){
        a.setVida(100);
    }

    //Cura a un equipo de pokemones de un entrenador seleccionado
    public void curarEquipo(Entrenador b){
        for (int i = 0; i < b.getEquipo().size(); i++) {
            Pokemon p = b.elegirPokemon(i);
            curar(p);
        }
    }
}
