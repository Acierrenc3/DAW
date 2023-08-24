/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project1;

import java.util.Scanner;

/**
 *
 * @author ayoze
 */
public class Project1 {

    public static void main(String[] args) {
       /* Hacer 1 programa que calcule e imprima la suma de tres calificaciones */
      /* 
       Scanner entrada = new Scanner(System.in);
       
       float nota1,nota2,nota3,suma,media;
       
        System.out.println("Diganos sus notas ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        suma= nota1+nota2+nota3;
        
        System.out.println("La suma de sus notas es "+suma);
        
        /*Calcula la nota media*/
        /*
        media = suma/3;
        
        System.out.println("Su nota media es de "+media); */
        
        /* Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales trabajadas y de su salario por hora
        */
        
        Scanner entrada = new Scanner(System.in);
        
        float horastrabajadas, salariohora, salariosemanal;
        
        System.out.println("Diganos sus horas trabajadas en semana y su salario por hora ");
        
        horastrabajadas = entrada.nextFloat();
        salariohora = entrada.nextFloat();
        
        salariosemanal = horastrabajadas * salariohora;
        
        System.out.println("Su salario semanal es de "+salariosemanal);
        
         
        
      
    }
}
