public class Gato extends Animal {
    private int bigote;
    private String raza;
    //Si se crean los atributos antes de crear el constructor, se puede generar con los nuevos atributos
    public Gato(String nombre, String color, int edad, int bigote, String raza) {
        super(nombre, color, edad);
        this.bigote = bigote;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "bigote=" + bigote +
                ", raza='" + raza + '\'' +
                '}';
    }
}
