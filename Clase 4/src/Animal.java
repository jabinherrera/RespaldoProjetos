public class Animal {
    private int nPatas;
    private boolean volador;
    private String nombre;
    private boolean carnivoro;
    private int edad;

    public Animal(int nPatas, boolean volador, boolean carnivoro, int edad) {
        this.nPatas = nPatas;
        this.volador = volador;
        this.carnivoro = carnivoro;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//El getter de un booleano es distinto, tiene el prefijo "is"
    public boolean isVolador() {
        return volador;
    }

    public void setVolador(boolean volador) {
        this.volador = volador;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nPatas=" + nPatas +
                ", volador=" + volador +
                ", nombre='" + nombre + '\'' +
                ", carnivoro=" + carnivoro +
                ", edad=" + edad +
                '}';
    }
}
