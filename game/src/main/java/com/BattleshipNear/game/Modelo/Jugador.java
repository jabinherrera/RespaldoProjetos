package com.BattleshipNear.game.Modelo;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Scanner;

public class Jugador {
    private String nombre;
    private int fichasVivas = 3;
    private Tablero tableroPropio;
    private Tablero tableroEnemigo;
    private Boolean turno;

    static Scanner teclado = new Scanner(System.in);

    public Jugador(String nombre, Tablero tableroPropio, Tablero tableroEnemigo, Boolean turno) {
        this.nombre = nombre;
        this.tableroPropio = tableroPropio;
        this.tableroEnemigo = tableroEnemigo;
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTurno(Boolean turno) {
        this.turno = turno;
    }

    public Boolean getTurno() {
        return turno;
    }

    public int getFichasVivas() {
        return fichasVivas;
    }

    public Tablero getTableroPropio() {
        return tableroPropio;
    }

    public void setTableroPropio(Tablero tableroPropio) {
        this.tableroPropio = tableroPropio;
    }

    public Tablero getTableroEnemigo() {
        return tableroEnemigo;
    }

    public void setTableroEnemigo(Tablero tableroEnemigo) {
        this.tableroEnemigo = tableroEnemigo;
    }

    public void ubicarFichas(){
        //deben ser 14
        System.out.println(this.getNombre() + ", ubica tus fichas");
        int fichasRestantes = 3;

        while (fichasRestantes != 0) {
            System.out.println("Ingrese una fila para ubicar su ficha");
            int fila = pedirIngresarFila();

            System.out.println("Ingrese una columna para ubicar su ficha");
            int columna = pedirIngresarColumna();

            if (tableroPropio.ocuparCasilla(fila, columna)) {
                fichasRestantes--;
            }
            System.out.println("com.BattleshipNear.game.Modelo.Tablero de: " + this.getNombre());
            tableroPropio.imprimirTablero();
        }

    }

    public int pedirIngresarFila(){
        int fila = teclado.nextInt();
        if(fila>0&&fila<10){
            return fila;
        }else{
            System.out.println("Por favor ingrese un valor valido");
            fila = teclado.nextInt();
            pedirIngresarFila();
        }
        return fila;
    }

    public int pedirIngresarColumna(){
        int columna = teclado.nextInt();
        if(columna>0&&columna<10){
            return columna;
        }else{
            System.out.println("Por favor ingrese un valor valido");
            columna = teclado.nextInt();
            pedirIngresarFila();
        }
        return columna;
    }
    //todo
    public void quitarFicha(int fila, int columna, Jugador enemigo){
        enemigo.tableroPropio.vaciarCasilla(fila, columna);
        enemigo.fichasVivas--;
    }

    public void atacar(int fila, int columna, Jugador enemigo){
        if(tableroEnemigo.esDisponible(fila, columna)==false){
            System.out.println("Boom");
            quitarFicha(fila, columna, enemigo);
            System.out.println("Pasar turno al enemigo");
            System.out.println("");
        }else{
            System.out.println("Ataque fallido");
            setTurno(false);
            System.out.println("Pasar turno al enemigo");
            System.out.println("");
        }
    }

    public void turno(Jugador enemigo){
        setTurno(true);
        System.out.println("Es el turno de " + this.getNombre());
        System.out.println("Se necesita fila y columna para atacar");
        atacar(pedirIngresarFila(), pedirIngresarColumna(), enemigo);
        this.setTurno(false);
        enemigo.setTurno(true);
    }
}
