/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject12;

import java.util.Scanner;

/**
 *
 * @author ayoze
 */
public class Mavenproject12 {

    public static void main(String[] args) { 
        /* Guillermo tiene N dolares. Luis tiene la mitad de lo  que posee Guillermo. Juan tiene la mitad de lo
        que poseen Luis y Guillermo juntos. Hacer 1 programa que calcule e imprima la cantidad de dinero entre
        los tres.
        */
        
        Scanner entrada = new Scanner(System.in);
        float guillermo,luis,juan,total;
        
        System.out.println("Digite la cantidad de dinero que tiene Guillermo ");
            guillermo = entrada.nextFloat();
            
            luis = (guillermo/2); //Luis tiene la mitad de guillermo
            
            System.out.println("La cantidad de dinerode Luis es: "+luis);
            
            juan = (guillermo+luis)/2;
            
            System.out.println("La cantidad de dinero de Juan es: "+juan);
            
            total = guillermo+luis+juan;
            
            System.out.println("\n La cantidad de dinero entre los 3 es: "+total);
        
        
        
        
        
        
        
        
        
    }
}
