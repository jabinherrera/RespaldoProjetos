import java.time.LocalDate;
import java.util.List;

public class Voluntario extends Persona{
    private LocalDate fechaDeInscripcion;
    private List<Animal> mascota;

    public Voluntario(String nombre, String apellido, String rut, LocalDate fechaDeInscripcion, List<Animal> mascota) {
        super(nombre, apellido, rut);
        this.fechaDeInscripcion = fechaDeInscripcion;
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return  super.toString() + '\n' +
                "fechaDeInscripcion= " + fechaDeInscripcion + '\n' +
                "mascota=" + mascota + '\n';
    }
}
