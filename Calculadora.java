/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Admin
 */
public class Calculadora {

    int resultado = 0;
    
    public double somar(int n1, int n2){
    resultado = n1 + n2;
    return resultado;
    }
    
    public double multiplicação(int n1, int n2){
    resultado = n1 * n2;
    return resultado;
    }
    
    public double dimunuir(int n1, int n2){
    resultado = n1 - n2;
    return resultado;
    }
    public double dividir(int n1, int n2){
        double d1 = Double.valueOf(n1);
        double d2 = Double.valueOf(n2);
        
        double r = d1 / d2;
        return r;
    }
}