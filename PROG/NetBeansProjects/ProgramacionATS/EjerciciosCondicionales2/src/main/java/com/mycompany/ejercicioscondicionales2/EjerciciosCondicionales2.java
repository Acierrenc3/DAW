/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicioscondicionales2;

import javax.swing.JOptionPane;

/**
 *
 * @author ayoze
 */
public class EjerciciosCondicionales2 {

    public static void main(String[] args) {
        /*Pedir dos numeros y decir cual es el mayor o si son iguales */
        
        int numero1,numero2;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
        
        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null,"El primer numero es mayor que el segundo");
        }    
        else if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null,"El segundo numero es mayor que el primero");
        }    
        else if (numero1 == numero2){
            JOptionPane.showMessageDialog(null,"Ambos numeros son iguales");
        }
        
            
        }
        }

    

