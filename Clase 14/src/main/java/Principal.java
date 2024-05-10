public class Principal {
    public static void main(String[] args) {

        Persona p = new Persona();
        Persona p1 = new Persona("Jabin", 21, "204899169", "j.herrera@ufromail.cl");

        p.crearJSON(p1);
    }

}
