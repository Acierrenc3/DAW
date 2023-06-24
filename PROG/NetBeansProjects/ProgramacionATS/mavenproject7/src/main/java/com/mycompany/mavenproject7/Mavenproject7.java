/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject7;

import java.util.Scanner;

/**
 *
 * @author ayoze
 */
public class Mavenproject7 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in) ;
       float numero1,numero2,suma,resta,div,resto,mult; //declaras todas las variables
       
        System.out.println("Digite 2 numeros: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        
        suma  = numero1+numero2;
        resta = numero1-numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        resto = numero1%numero2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+mult);
        System.out.println("La division es: "+div);
        System.out.println("El  resto es: "+resto);
                
    }
}
