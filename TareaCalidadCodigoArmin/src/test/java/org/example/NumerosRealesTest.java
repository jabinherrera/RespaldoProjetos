package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosRealesTest {

    @Test
    public void testParMayorQue10() {
        assertEquals("El número es par y mayor que 10", NumerosReales.evaluarNumero(12));
    }

    @Test
    public void testParMenorIgualQue10() {
        assertEquals("El número es par y menor o igual que 10", NumerosReales.evaluarNumero(8));
    }

    @Test
    public void testImparNegativo() {
        assertEquals("El número es impar y negativo", NumerosReales.evaluarNumero(-3));
    }

    @Test
    public void testImparPositivo() {
        assertEquals("El número es impar y positivo", NumerosReales.evaluarNumero(7));
    }

    @Test
    public void testNegativo() {
        assertEquals("El número es negativo", NumerosReales.evaluarNumero(-5));
    }

    @Test
    public void testPar() {
        assertEquals("El número es par", NumerosReales.evaluarNumero(4));
    }

}