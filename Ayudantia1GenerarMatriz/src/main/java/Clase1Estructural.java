import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Clase1Estructural {

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        System.out.println("Ingrese el número de filas");
        var filas = ingresar();

        System.out.println("Ingrese el número de columnas");
        var columnas = ingresar();

        var matriz = generarMatriz(filas, columnas);
        llenarMatrizAleatoria(matriz);

        var vectorPar = getVectorPares(matriz);
        var vectorImpar = getVectorImpares(matriz);

        vectorPar = eliminarRepetidos(vectorPar);
        vectorImpar = eliminarRepetidos(vectorImpar);

        mostrarElementos(vectorPar);
        mostrarElementos(vectorImpar);

        int mayorPar = getMax(vectorPar);
        int mayorImpar = getMax(vectorImpar);

        System.out.println("Mayor par: " + mayorPar);
        System.out.println("Mayor impar: " + mayorImpar);
    }

    public static int ingresar() {
        return new Scanner(System.in).nextInt();
    }

    public static int getNumeroRandom() {
        return new Random().nextInt(100);
    }

    public static int[][] generarMatriz(int filas, int columnas) {
        return new int[filas][columnas];
    }

    public static void llenarMatriz(int[][] matriz, Supplier<Integer> generador) {
        for (var fila = 0; fila < matriz.length; fila++) {
            for (var columna = 0; columna < matriz[0].length; columna++) {
                matriz[fila][columna] = generador.get();
            }
        }
    }

    public static void llenarMatrizManual(int[][] matriz) {
        llenarMatriz(matriz, Clase1Estructural::ingresar);
    }

    public static void llenarMatrizAleatoria(int[][] matriz) {
        llenarMatriz(matriz, Clase1Estructural::getNumeroRandom);
    }

    public static int[] eliminarRepetidos(int[] vector) {
        return Arrays.stream(vector).distinct().toArray();
    }

    public static int[] getVectorFiltradoPor(int[][] matriz, Function<int[], Integer> function,
                                             Predicate<Integer> predicado) {
        var vector = convertirMatrizEnVector(matriz);
        var elementos = function.apply(vector);
        var contador = 0;
        var vectorFiltrado = new int[elementos];

        for (int elemento : vector) {
            if (predicado.test(elemento)) {
                vectorFiltrado[contador] = elemento;
                contador++;
            }
        }
        return vectorFiltrado;
    }

    public static int[] getVectorPares(int[][] matriz) {
        return getVectorFiltradoPor(matriz, Clase1Estructural::contarPares, Clase1Estructural::esPar);
    }

    public static int[] getVectorImpares(int[][] matriz) {
        return getVectorFiltradoPor(matriz, Clase1Estructural::contarImpares, Clase1Estructural::esImpar);
    }

    public static int contar(int[] vector, Predicate<Integer> predicado) {

        var contador = 0;

        for (int elemento : vector) {
            if (predicado.test(elemento)) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarImpares(int[] vector) {
        return contar(vector, Clase1Estructural::esImpar);
    }

    public static int contarPares(int[] vector) {
        return contar(vector, Clase1Estructural::esImpar);
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean esImpar(int numero) {
        return !esPar(numero);
    }

    public static int[] convertirMatrizEnVector(int[][] matriz) {

        var elementos = matriz.length * matriz[0].length;
        var contador = 0;
        var vector = new int[elementos];

        for (var fila = 0; fila < matriz.length; fila++) {
            for (var columna = 0; columna < matriz[0].length; columna++) {
                vector[contador] = matriz[fila][columna];
                contador++;
            }
        }
        return vector;
    }

    public static int getMax(int[] vector) {

        var mayor = vector[0];

        for (var elemento = 1; elemento < vector.length; elemento++) {
            if (vector[elemento] > mayor) {
                mayor = vector[elemento];
            }
        }
        return mayor;
    }

    public static void mostrarElementos(int[] vector) {

        System.out.print("[");
        for (var elemento : vector) {
            mostrarElemento(elemento, vector);
        }
        System.out.println("]");
    }

    public static void mostrarElemento(int elemento, int[] vector) {
        if (esElUltimo(elemento, vector)) {
            System.out.print(elemento);
        } else {
            System.out.print(elemento + ", ");
        }
    }

    public static boolean esElUltimo(int elemento, int[] vector) {
        return elemento == vector[vector.length - 1];
    }
}