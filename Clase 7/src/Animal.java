public class Animal {
    private String nombre;
    private String color;
    private int edad;
    private boolean isDespierto;

    public Animal(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public void comer(String comida){
        System.out.println("comiendo " + comida);
    }

    public void dormir(){
        this.isDespierto = false;
    }

    public final void despertar(){
        this.isDespierto = true;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                ", isDespierto=" + isDespierto +
                '}';
    }
}
