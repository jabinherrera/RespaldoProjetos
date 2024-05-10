import java.time.LocalDate;

public class Animal {
    private String nombre;
    private TipoAnimal tipoAnimal;
    private SexoAnimal sexoAnimal;
    private boolean vacunaAdministranda;
    private LocalDate fechaDeVacunacion;

    public Animal(String nombre, TipoAnimal tipoAnimal, SexoAnimal sexoAnimal, boolean vacunaAdministranda, LocalDate fechaDeVacunacion) {
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
        this.sexoAnimal = sexoAnimal;
        this.vacunaAdministranda = vacunaAdministranda;
        this.fechaDeVacunacion = fechaDeVacunacion;
    }

    @Override
    public String toString() {
        return  "nombre= " + nombre + '\n' +
                "tipoAnimal= " + tipoAnimal + '\n' +
                "sexoAnimal= " + sexoAnimal + '\n' +
                "vacunaAdministranda= " + vacunaAdministranda + '\n' +
                "fechaDeVacunacion= " + fechaDeVacunacion;
    }
}
