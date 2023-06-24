/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.condicionales1;

import javax.swing.JOptionPane;

/**
 *
 * @author ayoze
 */
public class Condicionales1 {

    public static void main(String[] args) {
       /* La sentencia if:
        
        if(condicion) {
        }
        else{
            Instruccion2;
        }
        */
       
       int numero, dato = 5;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
       
       if(numero == dato){
           JOptionPane.showMessageDialog(null,"El numero es 5");
       }
       else{
           JOptionPane.showMessageDialog(null,"El numero es distinto de 5");
       }
       
        
       }
        
    }

