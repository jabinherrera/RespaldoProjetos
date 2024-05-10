import java.util.ArrayList;

public class Asignatura {
    private String nombre;
    private int capacidad;
    private Profesor profesor;
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public Asignatura(String nombre, int capacidad, Profesor profesor) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.profesor = profesor;
    }

    public void agregarAlumno(Alumno a){
        alumnos.add(a);
    }
}
