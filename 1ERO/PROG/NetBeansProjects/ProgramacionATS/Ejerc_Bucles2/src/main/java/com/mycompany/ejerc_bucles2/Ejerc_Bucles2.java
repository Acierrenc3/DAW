/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerc_bucles2;

import javax.swing.JOptionPane;

/** Leer un numero e indicar si es positivo o negativo, el proceso se repetira hasta qye se introduzca un 0 */


public class Ejerc_Bucles2 {

    public static void main(String[] args) {
     int numero;  
     
     numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero "));
     
     while(numero!=0){
         if (numero>0){
             JOptionPane.showMessageDialog(null, "El numero "+numero+" Es positivo");
         }
         else{
            JOptionPane.showMessageDialog(null, "El numero "+numero+" Es negativo");
                     }
         
     numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero "));
    
         }
     }
     
    }

