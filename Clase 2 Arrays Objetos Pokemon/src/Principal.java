public class Principal {
    public static void main(String[] args) {
        //Se debe crear un arreglo tipo String[] cada vez que se quiere poner un tipo a un pokemon
        String[] tipo = {"Fuego"};
        Pokemon p1 = new Pokemon(4, "Charmander", 100, tipo, 15, 5, 1);

        String[] tipo1 = {"Planta", "Veneno"};
        Pokemon p2 = new Pokemon(1, "Bulbasaur", 100, tipo1, 10, 10, 1);

        String[] tipo2 = {"Agua"};
        Pokemon p3 = new Pokemon(7, "Squirtle", 100, tipo2, 10, 15, 1);

        String[] tipo3 = {"Insecto"};
        Pokemon p4 = new Pokemon(10, "Caterpie", 100, tipo3, 5, 5, 1);

        Ataque arañazo = new Ataque("Arañazo", 10, "normal");
        Ataque placaje = new Ataque("Placaje", 5, "normal");
        p1.agregarAtaque(arañazo);
        p2.agregarAtaque(placaje);
        p3.agregarAtaque(placaje);
        p4.agregarAtaque(placaje);

        Entrenador e1 = new Entrenador("Jabin");
        Entrenador e2 = new Entrenador("Rival");
        e1.agregarPokemon(p1);
        e1.agregarPokemon(p2);
        //System.out.println("equipo = " + e1);
        e2.agregarPokemon(p3);
        e2.agregarPokemon(p4);
        //e1.elegirPokemon(1);

        e1.desafiarEntrenador(e2);
/*      Ejemplo de ataque entre pokemon y uso de enfermera
        p1.atacar(p3);
        p3.atacar(p2);
        System.out.println(" ");

        Enfermera en1 = new Enfermera("Joy");

        e1.mostrarEquipo();
        e2.mostrarEquipo();
        System.out.println(" ");

        en1.curarEquipo(e1);
        en1.curarEquipo(e2);
        e1.mostrarEquipo();
        e2.mostrarEquipo();
*/
/*      Ejemplo pelea a muerte
        do{
            if(p1.getVida()<=0){
                break;
            }
            p1.atacar(p2);
            System.out.println("p2 = " + p2);
            if(p2.getVida()<=0){
                break;
            }
            p2.atacar(p1);
            System.out.println("p1 = " + p1);
        }while(true);

        System.out.println("fin");
*/
//tarea:
//Crear clase Entrenador con metodos (pokemones, desafiar)
//Crear clase Enfermera con metodos (curarPokemones)
    }
}
