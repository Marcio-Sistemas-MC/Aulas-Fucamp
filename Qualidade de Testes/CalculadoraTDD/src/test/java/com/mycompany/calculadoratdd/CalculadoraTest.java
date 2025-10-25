/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadoratdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author marci
 */
public class CalculadoraTest {

    @Test
    void testSomar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(2, 3);
        assertEquals(5, resultado, "2 + 3 deve ser 5");
    }

    @Test
    void testSubtrair() {
        Calculadora calc = new Calculadora();
        int resultado = calc.subtrair(5, 2);
        assertEquals(3, resultado, "5 - 2 deve ser 3");
    }

    @Test
    void testMultiplicar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(4, 5);
        assertEquals(20, resultado, "4 * 5 deve ser 20");
    }

    @Test
    void testDividir() {
        Calculadora calc = new Calculadora();
        double resultado = calc.dividir(10, 2);
        assertEquals(5.0, resultado, 0.001,"10 / 2 deve ser 5.0");
 }
 @Test
    void testDividirPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class,
                () -> calc.dividir(10, 0),
        "Deve lançar IllegalArgumentException ao dividir por zero");
}
}
