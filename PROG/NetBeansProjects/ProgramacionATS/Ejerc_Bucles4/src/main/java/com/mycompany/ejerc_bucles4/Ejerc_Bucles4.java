/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerc_bucles4;

import javax.swing.JOptionPane;

/** Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se han introducido */

public class Ejerc_Bucles4 {

    public static void main(String[] args) {
        
      int numero, contar=0;
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
      
      while(numero>=0){
          JOptionPane.showMessageDialog(null, "Ha ingresado el numero "+numero);
          contar++;
          
       numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));   
      }
      JOptionPane.showMessageDialog(null, "Numero invalido. Ingresó un total de "+contar+" numeros");
        
    }
}
