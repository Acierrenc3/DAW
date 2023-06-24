/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicios2;

import java.util.Scanner;

/**
 *
 * @author ayoze
 */
public class Ejercicios2 {

    public static void main(String[] args) {
      /* Counstruir un programa que, dado un numero total de horas, devuelva el numerode semanas, dias y horas equivalentes.
        Por ejemplo,dado un total de 1000 horas, debe mostras 5 semanas, 6 dias y 16 horas */
      Scanner entrada = new Scanner(System.in);
      
       int horasTotales, semanas, dias, horas;
       
        System.out.println("Digite el  numero de horas ");
        horasTotales  = entrada.nextInt();
        
        semanas = horasTotales / 168; /* 168son las horas que hay en 1 semana */
        dias =  horasTotales%168 / 24; /*el%168 es para sacar el residuo de las horas en  1 semana, para despues dividirlo por 24h diarias */
        horas  = horasTotales%24; /*el residuo para sacar las horas diarias */
        
        System.out.println("\nElequivalente es ");
        System.out.println("Semanas: "+semanas);
        System.out.println("Días: "+dias);
        System.out.println("Horas "+horas);
        
        
        
      
      
         
    }
}
