import java.util.Date;

public class Persona {
    private String nombre;
    private String rut;
    private Date cumpleño;
    private Date contrato;
    private String tipo;

    public Persona(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Persona(String nombre, String rut, String tipo, Date fecha) {
        this.nombre = nombre;
        this.rut = rut;
        this.tipo = tipo;
        switch (this.tipo){
            case "vendedor":
                this.contrato = fecha;
                break;
            case "cliente":
                this.cumpleño = fecha;
        }
    }
}
