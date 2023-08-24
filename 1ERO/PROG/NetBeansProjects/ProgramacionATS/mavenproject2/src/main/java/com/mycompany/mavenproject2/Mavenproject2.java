/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author ayoze
 */
public class Mavenproject2 {

    public static void main(String[] args) {
       /** System.out.println("Hello World!");
        
        int a=5;  /** Definir variables con la clase int, que es para numeros enteros */
         /**int b=2;
      
        int suma=a+b;
        int resta=a-b;
        int multiplicacion=a*b;
        double division=(double)a/b;
        int resto=a%b;
        
       System.out.println("La suma de a y b es " + suma);
       System.out.println("La resta de b y a es " + resta);
       System.out.println("La multiplicacion de a y b es " + multiplicacion);       
       System.out.println("La division de b y a es " + division); 
       System.out.println("El resto de a y b es " + resto);
        
        /** Para numeros enteros se usa int, para decimales se usa double
         * 
         */
         
        /**Scanner sn=new Scanner(System.in);
        
        System.out.print("Introduzca un número"); /** Esto es para que pida el numero */
        /**int num=sn.nextInt();
        
        char caracter=(char)num; /** char e int son compatibles, char significa character */
        /** Para declarar char, se hace con '' */
        /**System.out.println("El número "+num+" corresponde al caracter'"+caracter+"'"); /** Ejercicio 3, para sacar 1 caracter de la tabla ASCII */
        
        /** 4 Indicar si un numero pasado por consola es PAR o no */
        
      
               
        Scanner sn=new Scanner(System.in);
        
        System.out.print("Introduzca un número"); /** Esto es para que pida el numero */
        int num=sn.nextInt();
        
        if(num%2==0) {  /** Variavle If: Si pasa esto, entonces es par */
            System.out.println("El numero "+num+" es par");
        }else{ /** Variable que complementa al IF, de, si no, entonces no es par */
            System.out.println("El numero"+num+" no es par");
            
            
        }
    }
}
