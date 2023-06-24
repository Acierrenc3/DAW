/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject6;

import javax.swing.JOptionPane;

/**
 *
 * @author ayoze
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        //Como usar el JOptionPane, importarlo etc.
        
        String cadena;
        
        int entero;
        
        char letra;
  
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite  un entero: "));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Float.parseFloat(JOptionPane.showInputDialog("Digite un Decimal: "));
        
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "El numero es: "+entero);
        JOptionPane.showMessageDialog(null, "La letra es: "+letra);
        JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
        
        
    }
}
