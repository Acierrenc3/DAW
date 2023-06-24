/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerc_bucles1;

import javax.swing.JOptionPane;

/**
Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se  introduzca uno negativo. */

public class Ejerc_Bucles1 {

    public static void main(String[] args) {
       int numero,cuadrado;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
       
       while(numero>=0){
           cuadrado = (int)Math.pow(numero,2);
           
           JOptionPane.showMessageDialog(null,"El numero "+numero+" elevado al cuadrado "+cuadrado);
           
             numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero "));
       }
       
    }
}
