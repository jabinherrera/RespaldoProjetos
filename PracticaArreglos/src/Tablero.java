import java.util.Scanner;

public class Tablero {
    int dimension = 9;
    String vacio = "[ ]";
    String ficha1 = "[x]";
    String ficha2 = "[y]";
    String[][] tablero;

    Tablero(){
        tablero = new String[dimension][dimension];
        for (int i = 0; i < this.dimension; i++) {
            for (int j = 0; j < this.dimension; j++) {
                 tablero[i][j] = vacio;                                         //Permiten elegir el tipo de de simbolo que representara las casillas vacias
            }
        }

        for (int i = 1; i < 3; i++) {                                           //Estos 2 for llenan el tablero con las fichas en posicion inicial
            for (int j = 1; j < 9; j++) {
                tablero[i][j] = ficha1;
            }
        }
        for (int i = 7; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                tablero[i][j] = ficha2;
            }
        }

        for (int i = 0; i < dimension; i++) {                                   //Estos 2 for crean el contorno del tablero
            tablero[i][0] = " " + i;
        }
        for (int j = 0; j < dimension; j++) {
            tablero[0][j] = " " + j;
        }
    }

    Scanner teclado = new Scanner(System.in);

    void imprimirTablero(){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(tablero[i][j] + "\t");     //tiene que ser print no println
            }
            System.out.println("\n");
        }
    }

    void elegirFicha(){
        System.out.println("Que ficha desea mover?");
        System.out.println("Cordenada X");
        int x1 = teclado.nextInt();
        System.out.println("Cordenada Y");
        int y1= teclado.nextInt();
        tablero[x1][y1] = vacio;
    }

    void verificarFichaExiste(int x1, int y1){
        if (dimension == null) {

        }else {

        }
    }

    void moverFicha1(){
        elegirFicha();
        System.out.println("Que a donde desea mover la ficha?");
        System.out.println("Cordenada X");
        int x = teclado.nextInt();
        System.out.println("Cordenada Y");
        int y = teclado.nextInt();
        tablero[y][x] = ficha1;

        imprimirTablero();
    }

    void moverFicha2(){
        elegirFicha();
        System.out.println("Que a donde desea mover la ficha?");
        System.out.println("Cordenada X");
        int x = teclado.nextInt();
        System.out.println("Cordenada Y");
        int y = teclado.nextInt();
        tablero[y][x] = ficha2;

        imprimirTablero();
    }
}
