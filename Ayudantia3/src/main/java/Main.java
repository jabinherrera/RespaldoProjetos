import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Daniela", TipoAnimal.GATO, SexoAnimal.FEMENINO, false, LocalDate.now());
        List<Animal> animalesJabin = new ArrayList<>();
        animalesJabin.add(animal);

        Persona Jabin = new Voluntario("Jabin", "Herrera", "204899169", LocalDate.now(), animalesJabin);

        System.out.println(Jabin);
    }

}
