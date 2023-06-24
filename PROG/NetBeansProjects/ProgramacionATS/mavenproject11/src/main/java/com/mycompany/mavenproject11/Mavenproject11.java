/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject11;

import java.util.Scanner;

/**
 *
 * @author ayoze
 */
public class Mavenproject11 {

    public static void main(String[] args) {
      /* Ejercicio 1: Hacer 1 programa que calcule e imprima la suma de 3 calificaciones 
      Scanner entrada = new Scanner(System.in);
      float nota1,nota2,nota3, suma;
      
        System.out.println("Digite 3 calificaciones: ");
        nota1 = entrada.nextFloat();
        nota2= entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        suma = nota1+nota2+nota3; //Sumamos las 3 notas
        
        System.out.println("\n La suma es: "+suma); */
      
      /* Ejercicio 2: Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales 
      trabajadas y su  salario por hora */
      
          float salariohora, horatrabajada, total;
            Scanner entrada = new Scanner (System.in);
                    System.out.print("Escribe el salario por hora y la cantidad de horas trabajadas: ");
                    
                salariohora = entrada.nextFloat();
  
                horatrabajada = entrada.nextFloat();
                total = salariohora * horatrabajada;
                
                System.out.print("\n El salario que se le debe es: " + total);
        
    }
}
