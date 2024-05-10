import java.util.Arrays;
import java.util.List;

public class Avion {
        private String[][] matriz;
        private String ocupado = "[*]";
        private static String[] x = {"1", "2", "3", "4", "5", "6", "7", "8", " "};
        private static String[] y = {" ", " A", " B", " C", " D"};
        private int contadorReservas = 0;

    public Avion() {
    }

    public static String[] getY() {
        return y;
    }

    public void setContadorReservas(int contadorReservas) {
        this.contadorReservas = contadorReservas;
    }

    public void generarMatrizVacio() {
            //Genera una matriz vacia
            matriz = new String[x.length][y.length];
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < y.length; j++) {
                    matriz[i][j] = y[j]+x[i];
                }
            }
            //Estos 2 for generan la contorno de la matriz
            for (int i = 0; i < x.length; i++) {
                matriz[i][0] = x[i];
            }
            for (int j = 0; j < y.length; j++) {
                matriz[8][j] = y[j];
            }
        }

        public boolean isDisponible(int x, int y){
            if(matriz[x][y]!=ocupado){
                return false;
            }else{
                return true;
            }
        }

        public void reservarAsiento(int x, int y, Persona persona) {
            if (isDisponible(x,y)) {
                matriz[x][y] = ocupado;
                persona.setAsiento(matriz[x][y]);
                contadorReservas++;
            }else{
                System.out.println("Este asiento esta ocupado, intente otra vez");
            }
        }

        public void cantidadReservas(){
            System.out.println("Cantidad de reservas = " + this.contadorReservas);
        }

        public void resetContadorReservas(){
            setContadorReservas(0);
        }

        public void imprimirMatriz() {
            //Muestra la matriz
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < y.length; j++) {
                    System.out.print(matriz[i][j] + "\t");     //tiene que ser print no println
                }
                System.out.println("\n");
            }
        }
    }

