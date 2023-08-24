/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.condicionales2;

import javax.swing.JOptionPane;

/**
 *
 * @author ayoze
 */
public class Condicionales2 {

    public static void main(String[] args) {
        /* La sentencia switch:
        
        switch(dato) {
        case 1: Instruicciones1;
                break;
        case n: InstruccionesN;
                break;
        ...
        */
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1 y 5 "));
        
        switch(dato) {
            case 1:JOptionPane.showMessageDialog(null, "es el numero 1");
                        break;
            case 2:JOptionPane.showMessageDialog(null, "es el numero 2");
                        break;
            case 3:JOptionPane.showMessageDialog(null, "es el numero 3");
                        break;
            case 4:JOptionPane.showMessageDialog(null, "es el numero 4");
                        break;
            case 5:JOptionPane.showMessageDialog(null, "es el numero 5");
                        break;
            
            default: JOptionPane.showMessageDialog(null,"El numero no está en el rango");
            
            
        }
    }
    
}
