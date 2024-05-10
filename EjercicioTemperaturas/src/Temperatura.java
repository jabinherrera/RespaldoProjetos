import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Temperatura {
    private int nDias;
    private ArrayList<Integer> arrMin = new ArrayList<>();
    private ArrayList<Integer> arrMax = new ArrayList<>();

    public ArrayList<Integer> getArrMin() {
        return arrMin;
    }

    public ArrayList<Integer> getArrMax() {
        return arrMax;
    }

    Scanner teclado = new Scanner(System.in);

    //Permite ingresar datos a un ArrayList mediante el teclado
    public void ingresarDatos() {
        pedirDias();
        pedirTemperaturas();
    }

    //Permite ingresar la cantidad de dias con los que se trabajaran
    private void pedirDias() {
        System.out.println("Por favor ingrese la cantidad de dias a los que introducirá temperaturas");
        nDias = teclado.nextInt();
    }

    //Permite asignarle una temperatura maxima y minima a cada dia
    private void pedirTemperaturas() {
        for (int i = 0; i < nDias; i++) {
            System.out.println("Ingrese la temperatura minima del dia " + (i + 1));
            arrMin.add(teclado.nextInt());
            System.out.println("Ingrese la temperatura maxima del dia " + (i + 1));
            arrMax.add(teclado.nextInt());
        }
    }

    //Muestra la temperatura maxima y minima de cada dia en orden
    public void mostrarTemperaturas() {
        System.out.println(this.getArrMax());
        System.out.println(this.getArrMin());
    }

    //Muestra la temperatura maxima y minima de un dia en específico seleccionado
    public void mostrarTemperaturaDia() {
        System.out.println("Por favor ingrese el numero del dia del cual desea saber la temperatura");
        int a = teclado.nextInt() - 1;
        System.out.println(this.getArrMax().get(a));
        System.out.println(this.getArrMin().get(a));
    }

    //Muestra la temperatura más alta y el dia en el que se dio
    public void diaTemperaturaMaxima() {
        int max = Collections.max(this.arrMax);     //Descubrí Collections.max() entrega el valor mas alto de un ArrayList
        for (int i = 0; i < nDias; i++) {
            int aux = arrMax.get(i);
            if (max == aux) {                       //Pasa por cada dato del ArrayList de temperatura maxima hasta encontrar el que corresponda a la temperatura maxima
                System.out.println("La temperatura mas alta fue el dia " + (i + 1) + " con una temperatura de " + max + " grados");
            }
        }
    }

    //Muestra la temperatura más baja y el dia en el que se dio
    public void diaTemperaturaMinima() {
        int min = Collections.min(this.arrMin);     //Similar a Collections.min() pero con el valor más bajo
        for (int i = 0; i < nDias; i++) {
            int aux = arrMin.get(i);
            if (min == aux) {                       //Pasa por cada dato del ArrayList de temperatura minima hasta encontrar el que corresponda a la temperatura maxima
                System.out.println("La temperatura mas baja fue el dia " + (i + 1) + " con una temperatura de " + min + " grados");
            }
        }
    }

    //Entrega la temperatura media de cada dia
    public void temperaturaMedia(){
        for (int i = 0; i < nDias; i++) {
            int max = this.getArrMax().get(i);
            int min = this.getArrMin().get(i);
            float media = (max + min)/2;
            System.out.println("La temperatura promedio del dia " + (i+1) + " es de " + media);
        }
    }

    //Entrega la temperatura media total
    public void temperaturaMediaTotal(){
        float mediaAcumulada = 0;
        for (int i = 0; i < nDias; i++) {
            int max = this.getArrMax().get(i);
            int min = this.getArrMin().get(i);
            float media = (max + min)/2;
            mediaAcumulada = mediaAcumulada + media;
        }
        System.out.println("La sumatoria de la temperatura promedio es: "+mediaAcumulada/nDias);
    }

    //Revisa si hay una onda de calor
    public void ondaDeCalor(){
        ArrayList<Float> sobre40 = new ArrayList<>();
        for (int i = 0; i < nDias; i++) {
            int max = this.getArrMax().get(i);
            int min = this.getArrMin().get(i);
            float media = (max + min)/2;
            if (media >= 40){
                sobre40.add(media);
                if (sobre40.size() >= 4){
                    System.out.println("Existe una ola de calor");
                }
            }
        }

    }
}
