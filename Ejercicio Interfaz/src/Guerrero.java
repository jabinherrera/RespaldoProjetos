public class Guerrero implements Comparable<Guerrero>{
    private String nombre;
    private String nacionalidad;
    private int fuerza;

    public Guerrero(String nombre, String nacionalidad, int fuerza) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    @Override
    public int compareTo(Guerrero o) {
        if (this.fuerza>o.fuerza){
            return 1;
        }else if (this.fuerza<o.fuerza){
            return -1;
        }else{
                return 0;
        }
    }
}
