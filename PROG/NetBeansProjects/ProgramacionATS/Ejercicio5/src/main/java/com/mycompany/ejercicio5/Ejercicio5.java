/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author ayoze
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner sn=new Scanner (System.in);
        
        System.out.println("Introduzca el numero 1");
        int num1=sn.nextInt();
                
        System.out.println("Introduzca el numero 2");
        int num2=sn.nextInt();
                
                if(num1<=num2) {
                    
                    if(num1==num2) {
                        System.out.println("Son Iguales");
                    }else{
                   System.out.println("El numero "+num2+" es el mayor");    
                        
                    }
                }else{
                   System.out.println("El numero "+num1+" es el mayor");
                }
                
                
                
    }
}
