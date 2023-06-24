/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject15;

import java.util.Scanner;

/**
 *
 * @author ayoze
 */
public class Mavenproject15 {

    public static void main(String[] args) {
      /*La calificación final de un estudiante de Informática se calcula con base a las calificaciones de cuatro aspectos de su rendimiento académico:
      participación, primer examen parcial, segundo examen parcial y examen final.     Sabiendo que las calificaciones anteriores entran a la
      calificación final con ponderaciones del 10%, 25%, 25% y 40%, Hacer un programa que calcule e imprima la calificación 
      final obtenida por un estudiante*/
      
      Scanner entrada = new Scanner(System.in);
      float participacion,nota1,nota2,nota3, notatotal;
      
        System.out.println("Digite su nota de participacion ");       
        participacion = entrada.nextFloat();
        
        System.out.println("Digite la nota del segundo examen ");       
        nota1 = entrada.nextFloat();
        
        System.out.println("Digite la nota del tercer examen ");        
        nota2 = entrada.nextFloat();
        
        System.out.println("Digite la nota del examen final ");
        nota3 = entrada.nextFloat();
        
        participacion *= 0.10f;
        nota1 *= 0.25f;
        nota2 *= 0.25f;
        nota3 *= 0.40f;
        
        notatotal = participacion + nota1 + nota2 + nota3;
        
        System.out.println("\n Su nota total es: "+notatotal);
        
        
                
      
               
                      
    }
}
