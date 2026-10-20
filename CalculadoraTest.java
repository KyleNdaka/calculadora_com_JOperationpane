/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of somar method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testSomar() {
        System.out.println("somar");
        int n1 = 3;
        int n2 = 3;
        Calculadora instance = new Calculadora();
        double expResult =6.0;
        double result = instance.somar(n1, n2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicação method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testMultiplicação() {
        System.out.println("multiplica\u00e7\u00e3o");
        int n1 = 3;
        int n2 = 3;
        Calculadora instance = new Calculadora();
        double expResult = 9.0;
        double result = instance.multiplicação(n1, n2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dimunuir method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testDimunuir() {
        System.out.println("dimunuir");
        int n1 = 3;
        int n2 = 3;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.dimunuir(n1, n2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testDividir() {
        System.out.println("dividir");
        int n1 = 3;
        int n2 = 3;
        Calculadora instance = new Calculadora();
        double expResult = 1.0;
        double result = instance.dividir(n1, n2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
