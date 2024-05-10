public class Main {
    public static void main(String[] args) {

        Alumno a = new Alumno("Jabin", "20489916919");
        Profesor p = new Profesor("Profesor", 1000000);
        Asignatura as = new Asignatura("POO", 40, p);
        Asignatura as0 = new Asignatura("POO", 40, new Profesor("Gustabo", 20000000)); //Se puede crear un objeto dentro de los atributos de un objeto.
        //Pero solo existirá dentro del objeto que es creado.
        Colegio c = new Colegio("Pumahue");
    }
}
