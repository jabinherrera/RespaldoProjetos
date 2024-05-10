import java.util.Random;

public class Vacuna {
    private TipoVacuna tipoVacuna;
    private TipoAnimal tipoAnimal;
    private Animal animalObjetivo;
    private int porcentajeEfectividad;


    public int getPorcentajeEfectividad() {
        return porcentajeEfectividad;
    }

    public void setPorcentajeEfectividad(int porcentajeEfectividad) {
        this.porcentajeEfectividad = porcentajeEfectividad;
    }

    public static int generarNumeroAleatorio() {
        return new Random().nextInt(100);
    }

    public void efectividadVacunaTipo1(){
        if (tipoVacuna.getTipoVacuna() == "tipo 1"  && tipoAnimal.getTipoAnimal() == "Perro") {
            setPorcentajeEfectividad(80);
        } else {
            if (tipoVacuna.getTipoVacuna() == "tipo 1"  && tipoAnimal.getTipoAnimal() == "Gato") {
                setPorcentajeEfectividad(90);
            }
        }
    }

    public void efectividadVacunaTipo2(){
        if (tipoVacuna.getTipoVacuna() == "tipo 2"  && tipoAnimal.getTipoAnimal() == "Perro") {
            setPorcentajeEfectividad(95);
        } else {
            if (tipoVacuna.getTipoVacuna() == "tipo 1"  && tipoAnimal.getTipoAnimal() == "Gato") {
                setPorcentajeEfectividad(75);
            }
        }
    }

    public boolean simularEfectividad(){
        efectividadVacunaTipo1();
        efectividadVacunaTipo2();

        if (getPorcentajeEfectividad() >= generarNumeroAleatorio()){
            return true;
        } else {
            return false;
        }
    }
}
