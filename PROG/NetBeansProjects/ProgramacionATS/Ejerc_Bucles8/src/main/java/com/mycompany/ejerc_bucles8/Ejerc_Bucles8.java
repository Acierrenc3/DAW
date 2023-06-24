/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerc_bucles8;

import javax.swing.JOptionPane;

/** Pedir un numero X y mostrar todos los numeros del 1 al N*/

public class Ejerc_Bucles8 {

    public static void main(String[] args) {
        int numero,total;
        
         numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero: "));
        JOptionPane.showMessageDialog(null, "Los numeros del 1 al N son: ");
        
        for (int i = 1; i <= numero; i++) {
            
            JOptionPane.showMessageDialog(null, +i); 
        
        
    }
    }
}
