/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciocondicionales3;

import javax.swing.JOptionPane;

/**
 *
 * @author ayoze
 */
public class EjercicioCondicionales3 {

    public static void main(String[] args) {
        /* Hacer un programa que lea un caracter por teclado y Determinar si es una letra mayúscula o no*/
        
        char letra;
        
        letra = JOptionPane.showInputDialog("Digite una letra del abecedario").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"Es una letra Mayúscula");   
        }
        else{
            JOptionPane.showMessageDialog(null,"Es una letra minúscula");
        }
    }
    
}
