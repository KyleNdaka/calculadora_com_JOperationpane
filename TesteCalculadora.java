/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Admin
 */
public class TesteCalculadora {
    public static void main(String[] a){
        Calculadora c = new Calculadora();
        
        int valorUm = 5;
        int valorDois = 5;
        
        double valorTotal = c.somar(valorUm, valorDois);
        if (valorTotal == 10){
            System.err.println("valor correto!");
        }else{
            System.err.println("valor errado!");
        }
    }
}
