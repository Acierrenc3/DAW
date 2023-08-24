/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerc8;

import java.util.Scanner;

/**
 *
 * @author ayoze
 */
public class Ejerc8 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double a,b,c,x1,x2;
        
        System.out.println("Digite el valor de a ");
        
        a=entrada.nextDouble();
        
        System.out.println("Digite el valor de b ");
        
        b=entrada.nextDouble();
        
        System.out.println("Digite el valor de c ");
        
        c=entrada.nextDouble();
        
        x1 = (-b+(Math.sqrt(Math.pow(b,2)))-4*(a)*(c))/(2*(a));
        x2=(-b-(Math.sqrt((Math.pow(b,2)))-4*(a)*(c)))/(2*(a));
        
        System.out.println("x1: "+x1);
        System.out.println("x2: "+x2);
    }
}
