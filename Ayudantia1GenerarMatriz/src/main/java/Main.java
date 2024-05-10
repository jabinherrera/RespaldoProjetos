import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        var matriz = Main.elegirGeneradorDeMatriz();
    }

    public static int generarNumeroAleatorio() {
        return new Random().nextInt(100);
    }

    public static int ingresarNumeroPorTeclado() {
        System.out.println("Ingrese un numero");
        var teclado = new Scanner(System.in).nextInt();
        return teclado;
    }

    public static int[][] generarMatrizAutomatica(int dimensionX, int dimensionY) {
        //Genera una matriz de manera automaticamente dado dimensiones
        var matriz = new int[dimensionX][dimensionY];
        for (var fila = 0; fila < dimensionX; fila++) {
            for (var columna = 0; columna < dimensionY; columna++) {
                matriz[fila][columna] = generarNumeroAleatorio();
            }
        }
        imprimirMatriz(matriz,dimensionX,dimensionY);
        return matriz;
    }

    //Como hacerlo con for each?
    public static int[][] generarMatrizManual(int dimensionX, int dimensionY) {
        //Genera una matriz manualmente dado dimensiones
        var matriz = new int[dimensionX][dimensionY];
        for (var cantidadDatos = 0; cantidadDatos < dimensionX * dimensionY; cantidadDatos++) {
            matriz = new int[dimensionX][dimensionY];
            for (var fila = 0; fila < dimensionX; fila++) {
                for (var columna = 0; columna < dimensionY; columna++) {
                    matriz[fila][columna] = ingresarNumeroPorTeclado();
                }
            }
        }
        imprimirMatriz(matriz,dimensionX,dimensionY);
        return matriz;
    }

    public static int solicitarDimension(String mensaje) {
        System.out.println(mensaje);
        return ingresarNumeroPorTeclado();
    }

    public static int elegirOpcion(){
        System.out.println("Ingrese 1 para generar la matriz automaticamente");
        System.out.println("ingrese 2 para ingresar manualmente los numeros de la matriz");
        return ingresarNumeroPorTeclado();
    }

    public static int[][] elegirGeneradorDeMatriz() {
        var dimensionX = solicitarDimension("Ingrese el numero de filas que tendra la matriz");
        var dimensionY = solicitarDimension("Ingrese el numero de columnas que tendra la matriz");

        var opcion = elegirOpcion();
        switch (opcion) {
            case 1:
                return generarMatrizAutomatica(dimensionX, dimensionY);

            case 2:
                return generarMatrizManual(dimensionX, dimensionY);

            default:
                return null;
        }
    }

    public static int[] convertirMatrizEnVector(int[][] matriz){
        return Arrays.stream(Arrays.stream(matriz)
                .flatMapToInt(Arrays::stream)
                .toArray()).toArray();
    }

    public static boolean isEven(int numero){
        return numero % 2 == 0;
    }

    public static boolean isOdd(int numero){
        return !isEven(numero);
    }

    public static int[] getVectorPares(int[] vector) {
        return Arrays.stream(vector).filter(Main::isEven).toArray();
    }

    public static int[] getVectorImpares(int[] vector) {
        return Arrays.stream(vector).filter(Main::isOdd).toArray();
    }

    public static int[] eliminarValoresRepetidos(int[] vector) {
        return Arrays.stream(vector).distinct().toArray();
    }

    public static int getNumeroMayor(int[] vector) {
        return Arrays.stream(vector).max().orElse(0);
    }

    public static void imprimirMatriz(int[][] matriz, int dimensionX, int dimensionY) {
        //Muestra el tablero
        for (int i = 0; i < dimensionX; i++) {
            for (int j = 0; j < dimensionY; j++) {
                System.out.print(matriz[i][j] + "\t");     //tiene que ser print no println
            }
            System.out.println("\n");
        }
    }
}

/*
Atomizar:
"Comerse el elefante a pedazitos"
Los metodos deben ser lo mas pequeños posibles y deben tener una unica funcion.
Los metodos deben tener como maximo 3 argumentos, pero idealmente 0.
 */
