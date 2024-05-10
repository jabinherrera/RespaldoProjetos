/*Para practicar arreglos voy a crear un tablero de ajedres/damas como si fuese una matriz*/

/*
Entradas:
    Elegir ficha
    Movimiento de fichas
    Reiniciar partida
Procesos:
    Generar tablero nuevo
    reinciar tablero
    Mover fichas
    Eliminar fichas
    Pasar turnos
    Terminar partida
Salidas:
    Tablero con fichas
    Movimiento de fichas
    Fin de turnos
    Anunciar ganador
    Preguntar para reiniciar partida
    Preguntar para iniciar partida
*/
public class Main {
    public static void main(String[] args) {
        Tablero t = new Tablero();
        t.imprimirTablero();
        System.out.println("\n");
        t.moverFicha1();
        t.moverFicha2();

    }
}
