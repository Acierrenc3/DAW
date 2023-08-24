/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerc_bucles6;

import javax.swing.JOptionPane;

/** Pedir numeros hasta que se teclee un 0. mostrar la suma de todos los numeros introducidos*/

public class Ejerc_Bucles6 {

    public static void main(String[] args) {
     int numero, suma=0; 
           do  {
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
           suma = suma + numero;
        }while(numero!=0);
        JOptionPane.showMessageDialog(null, "La suma es: "+suma);  
      
    }
}
