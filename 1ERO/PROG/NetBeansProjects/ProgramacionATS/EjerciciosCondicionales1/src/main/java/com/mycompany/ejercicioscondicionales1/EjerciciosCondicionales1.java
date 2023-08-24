/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicioscondicionales1;

import javax.swing.JOptionPane;

/**
 *
 * @author ayoze
 */
public class EjerciciosCondicionales1 {

    public static void main(String[] args) {
       /* Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10 */
       
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        if(numero%10 == 0){
            JOptionPane.showMessageDialog(null, "El numero "+numero+" Es multiplo de 10");
        }    
        else {
                    JOptionPane.showMessageDialog(null," El numero no es multiplo de 10 ");
                    }
        }
    }

