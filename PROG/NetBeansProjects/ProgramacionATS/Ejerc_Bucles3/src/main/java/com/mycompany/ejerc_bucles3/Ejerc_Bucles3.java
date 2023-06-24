/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerc_bucles3;

import javax.swing.JOptionPane;

/* Leer numeros hasta que se introduzca un 0.Para cada uno indicar si es par o impar */


public class Ejerc_Bucles3 {

    public static void main(String[] args) {
      
            int numero;  
     
     numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero "));
     
     while(numero != 0){
         if (numero %2 == 0){
             JOptionPane.showMessageDialog(null, "El numero "+numero+" Es Par");
         }
         else{
            JOptionPane.showMessageDialog(null, "El numero "+numero+" Es Impar");
                     }
         
     numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero "));
    }
    }
}

