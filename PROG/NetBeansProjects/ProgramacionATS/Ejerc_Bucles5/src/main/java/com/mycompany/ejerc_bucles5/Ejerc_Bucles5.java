/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerc_bucles5;

import javax.swing.JOptionPane;

/** Realizar un juego para adivinar un numero. Para ello generar un numero aleatorio entre 0-100, y luego ir
 * pidiendo numeros indicando "es mayor o menor" segun sea mayor o menor con respecto a N.
 * El proceso termina cuando el usuario acierta y mostrar numero de intentos */


public class Ejerc_Bucles5 {

    public static void main(String[] args) {
      int numero,aleatorio,intentos=0;
     
     
      aleatorio = (int)(Math.random()*100); //generar un numero aleatorio entre 0-100
      
      do{
          numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
          
          if(aleatorio > numero){
              System.out.println("Digite un numero mayor");
               
          }
          else{
              System.out.println("Digite un numero menor ");
          }
          intentos++;
          
      }while(numero != aleatorio);
      
        System.out.println("\nGenial!! Adivinaste el numero en: "+intentos+" Intentos");
              
      }
      
    }

