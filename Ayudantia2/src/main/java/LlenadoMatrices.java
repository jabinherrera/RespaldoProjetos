//Corregir codigo

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileWriter;

public class LlenadoMatrices {

    // corregir errores
    // llenado de matrices

    static Scanner teclado = new Scanner(System.in);

    static int[][] matriz;

    static int[] vectorPares;

    static int[] vectorImpares;

    public static void main(String args[]) {

        generarArchivo();

        int filas, columnas;

        System.out.println("Ingrese num filas con maximo de 100");
        filas = teclado.nextInt();
        System.out.println("Ingrese num columnas con maximo de 100");
        columnas = teclado.nextInt();
        matriz = new int[filas][columnas];


        System.out.println("Ingrese 1 si desea generación manual, de lo contrario será llenado automaticamente con valores de 1 a 100 generados aleatoriamente");
        int opcion = teclado.nextInt();
        if (opcion == 1) {
            llenarManual();
        } else {
            llenarAutomatico();
        }
        separarArreglos(matriz);
        System.out.println("Matriz original:");
        mostrarMatriz();
        System.out.println("\nPares:");
        int paresDistintos = eliminarDuplicados(vectorPares);
        mostrarArreglo(vectorPares, paresDistintos);
        System.out.println("\nImpares:");
        int imparesDistintos = eliminarDuplicados(vectorImpares);
        mostrarArreglo(vectorImpares, imparesDistintos);


    }

    public static void generarArchivo() {
        try {
            FileWriter writer = new FileWriter(String.valueOf(Paths.get("archivo.txt")));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void mostrarArreglo(int[] arr, int dimension) {
        for (int i = 0; i < dimension; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int eliminarDuplicados(int[] vector) {
        if (vector.length == 0 || vector.length == 1) {
            return vector.length;
        }
        int j = 0;

        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i = 0; i < vector.length - 1; i++)
            if (vector[i] != vector[i + 1])
                vector[j++] = vector[i];

        vector[j++] = vector[vector.length - 1];

        return j;
    }

    public static void separarArreglos(int[][] matrix) {
        vectorPares = new int[contarPares(matrix)];
        vectorImpares = new int[matrix.length * matrix[0].length - contarPares(matrix)];

        eliminarDuplicados(vectorPares);
        eliminarDuplicados(vectorImpares);

        int cuentaPares = 0;
        int cuentaImpares = 0;
        for (int fila = 0; fila < matrix.length; fila++) {
            for (int columna = 0; columna < matrix[0].length; columna++) {

                if (matrix[fila][columna] % 2 == 0) {
                    vectorPares[cuentaPares] = matrix[fila][columna];
                    cuentaPares++;
                } else {
                    vectorImpares[cuentaImpares] = matrix[fila][columna];
                    cuentaImpares++;
                }

            }
        }
        ordenarVector();
    }

    public static void ordenarVector() {
        Arrays.sort(vectorPares);
        Arrays.sort(vectorImpares);
    }

    public static void llenarManual() {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                int valor;
                System.out.println("ingrese valor para matriz de 1 a 100, en la posición [" + (fila + 1) + "][" + (columna + 1) + "]");
                valor = teclado.nextInt();
                matriz[fila][columna] = valor;
            }
        }
    }

    public static int contarPares(int[][] matrix) {
        int contPares = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    contPares++;
                }
            }
        }
        return contPares;
    }


    public static void llenarAutomatico() {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                matriz[fila][columna] = (int) (Math.random() * 100);
            }
        }
    }

    public static void mostrarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
