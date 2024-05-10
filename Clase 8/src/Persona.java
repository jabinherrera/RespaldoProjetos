//Utilizando la interfaz "Comparable"
public class Persona implements Comparable<Persona>{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    //Utilizando la interfaz "Comparable"
    //Public int compareTo(T o){}
    //T corresponde a un tipo
    //o corresponde al nombre que se le asigna para el metodo
    @Override
    public int compareTo(Persona o) {
        if (this.edad>o.edad) {
            return 1;
        }else if(this.edad<o.edad){
            return -1;
        }else{
            return 0;
        }
    }
}
