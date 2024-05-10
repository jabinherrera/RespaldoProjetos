public class Estudiante extends Persona{
    private String carrera;
    public Estudiante(int edad, String nombre) {
        super(edad, nombre);
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void modEdad(int edad){
        setEdad(edad);
    }

    /*@Override                                         //no se puede sobre escribrir por el final
    public void cumpleaños(){                           //en la clase Persona
        setEdad(getEdad()+1);
    }*/

    @Override
    public String toString() {
        return super.toString()+"Estudiante{" +         //super toma los datos edad
                "carrera='" + carrera + '\'' +          //y nombre de Persona
                '}';
    }
}
