/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerc_bucles7;

import javax.swing.JOptionPane;

/**Pedir numeros hasta que se introduzca uno negativo y calcular la media */
 
public class Ejerc_Bucles7 {

    public static void main(String[] args) {
        
        int numero, elementos=0, suma=0;
        float media;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
        
        while(numero>=0){
            suma = suma+numero;
            elementos++;
            
         numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro numero: "));   
        }
        
        if(elementos == 0){
            System.out.println("Error! La división entre 0 no existe ");
        }
        else{
            media=(float)suma/elementos;
            System.out.println("La media es: "+media);
        }
        
    }
}
