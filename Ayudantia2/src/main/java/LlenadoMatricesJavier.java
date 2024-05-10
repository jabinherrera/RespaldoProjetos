//Corregir codigo

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileWriter;
import java.util.function.Function;
import java.util.function.Predicate;

public class LlenadoMatricesJavier {
    static Scanner teclado = new Scanner(System.in);

    static int[][] matriz;

    public static void main(String args[]) {
        generarArchivo();

        matriz = crearMatriz();

        elegirTipoLlenadoDeMatriz();

        mostrarMatriz();

        mostrarParesEImpares();
    }

    public static void generarArchivo() {
        try {
            FileWriter fileWriter = new FileWriter(String.valueOf(Paths.get("archivo.txt")));
        } catch (IOException e) {
            System.out.println(e);

        }
    }

    public static void mostrarArreglo(int[] arr, int tam) {
        for (int i = 0; i < tam; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int eliminarDuplicados(int[] vector) {
        if (vector.length == 0 || vector.length == 1) {
            return vector.length;
        } else {
            // Doing same as done in Method 1
            // Just maintaining another updated index i.e. j
            return eliminarDuplicadosActualizandoIndex(vector);
        }
    }

    public static int[] separarMatrizEnArregloFiltradoPor(int[][] matrix, Function<int[][], Integer> funcion,
                                                          Predicate<Integer> predicado) {

        var filtrados = funcion.apply(matrix);
        var vector = new int[filtrados];

        int contador = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (predicado.test(matrix[i][j])) {
                    vector[contador] = matrix[i][j];
                    contador++;
                }
            }
        }
        ordenarVector(vector);

        return vector;
    }

    public static int[] separarMatrizEnArregloPares(int[][] matriz) {
        return separarMatrizEnArregloFiltradoPor(matriz,
                LlenadoMatricesJavier::contarPares, LlenadoMatricesJavier::isPar);
    }

    public static int[] separarMatrizEnArregloImpares(int[][] matriz) {
        return separarMatrizEnArregloFiltradoPor(matriz,
                LlenadoMatricesJavier::contarImpares, LlenadoMatricesJavier::isImpar);
    }

    public static void ordenarVector(int[] vector) {
        Arrays.sort(vector);
    }

    public static int[][] llenarManual() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int valor;
                System.out.println("ingrese valor para matriz de 1 a 100, en la posición [" + (i + 1) + "][" + (j + 1) + "]");
                valor = teclado.nextInt();
                matriz[i][j] = valor;

            }
        }
        return matriz;
    }

    public static int contar(int[][] matrix, Predicate<Integer> predicado) {

        int contador = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (predicado.test(matrix[i][j])) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static int contarPares(int[][] matrix) {
        return contar(matrix, LlenadoMatricesJavier::isPar);
    }

    public static int contarImpares(int[][] matrix) {
        return contar(matrix, LlenadoMatricesJavier::isImpar);
    }

    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean isImpar(int numero) {
        return !isPar(numero);
    }

    public static int[][] llenarAutomatico() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) ((Math.random()) * 100);
            }
        }
        return matriz;
    }

    public static void mostrarMatriz() {
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");
        }
    }

    //Atomizar
    public static int eliminarDuplicadosActualizandoIndex(int[] vector) {
        int j = 0;

        for (int i = 0; i < vector.length - 1; i++)
            if (vector[i] != vector[i + 1])
                vector[j++] = vector[i];

        vector[j++] = vector[vector.length - 1];

        return j;
    }

    public static int[][] crearMatriz() {
        int filas, columnas;
        System.out.println("Ingrese numero filas con maximo de 100");
        filas = teclado.nextInt();
        System.out.println("Ingrese numero columnas con maximo de 100");
        columnas = teclado.nextInt();
        matriz = new int[filas][columnas];
        return matriz;
    }

    public static int[][] elegirTipoLlenadoDeMatriz() {
        System.out.println("Ingrese 1 si desea generación manual, de lo contrario será llenado automaticamente con valores de 1 a 100 generados aleatoriamente");
        int opcion = teclado.nextInt();
        if (opcion == 1) {
            return llenarManual();
        } else {
            return llenarAutomatico();
        }

    }

    public static void mostrarParesEImpares() {
        var vectorPar = separarMatrizEnArregloPares(matriz);
        var vectorImpar = separarMatrizEnArregloImpares(matriz);

        int numerosFilaFiltrados = eliminarDuplicados(vectorPar);
        int numeroColumnaFiltrados = eliminarDuplicados(vectorImpar);

        System.out.println("\nNumeros pares:");
        mostrarArreglo(vectorPar, numerosFilaFiltrados);
        System.out.println("\nNumeros Impares:");
        mostrarArreglo(vectorImpar, numeroColumnaFiltrados);
    }

}