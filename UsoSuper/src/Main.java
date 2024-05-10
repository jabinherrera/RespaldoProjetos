public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante(34, "Manuel");
        System.out.println(e.getEdad());
        e.cumpleaños();
        e.setCarrera("Mecanica Cuantica");
        System.out.println("e = " + e);

    }



}
