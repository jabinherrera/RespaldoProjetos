public class Cliente {
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;
    private int sexo;
    private String telefono;
    private int cFrecuente;

    public Cliente(String rut, String nombre, String apellido, int edad, int sexo, String telefono, int cFrecuente) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
        this.cFrecuente = cFrecuente;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return "'" + rut +
                "', '" + nombre +
                "', '" + apellido +
                "', " + edad +
                ", " + sexo +
                ", " + telefono +
                ", " + cFrecuente;
    }
}