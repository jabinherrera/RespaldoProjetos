abstract class Animal {             //una clase abstracta no puede ser declarada
    protected String nombre;        //en una clase abstracta los atributos deben estar declarados a lo menos como "protected"
    protected int edad;

    //No necesitamos constructor

    abstract String getNombre();    //puede tener tanto metodos declarados como metodos abstractos


    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
