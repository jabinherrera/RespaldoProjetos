public class Veterinario extends Persona{
    private EspecialidadVeterinario especialidadVeterinario;

    public Veterinario(String nombre, String apellido, String rut, EspecialidadVeterinario especialidadVeterinario) {
        super(nombre, apellido, rut);
        this.especialidadVeterinario = especialidadVeterinario;
    }
}
