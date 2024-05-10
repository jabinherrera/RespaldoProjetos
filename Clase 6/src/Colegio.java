import java.util.ArrayList;

public class Colegio {
    private String nombre;
    private ArrayList<Asignatura> asignaturas = new ArrayList<>();
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private ArrayList<Profesor> profesores = new ArrayList<>();

    public Colegio(String nombre) {
        this.nombre = nombre;
    }

    public void inscribirAsignatura(Asignatura a){
        asignaturas.add(a);
    }

    public void matricularAlumno(Alumno a){
        alumnos.add(a);
    }

    public void contratarProfesor(Profesor p){
        profesores.add(p);
    }
}
