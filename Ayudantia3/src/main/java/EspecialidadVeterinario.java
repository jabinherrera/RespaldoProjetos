public enum EspecialidadVeterinario {
    ESPECIALIDADPERROS("EspecialidadPerros"),
    ESPECIALIDADGATOS("EspecialidadGatos"),
    ESPECIALIDADOVINOS("EspecialidadOvinos");

    private String especialidad;

    EspecialidadVeterinario(String especialidad) {
        this.especialidad = especialidad;
    }
}
