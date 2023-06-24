/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject13;

import java.util.Scanner;

/**
 *
 * @author ayoze
 */
public class Mavenproject13 {

    public static void main(String[] args) {
     /* Una compañia de venta de coches usados paga a su personal de ventas un salario de 1000$ mensuales, mas una comisione de 150$por cada uno
        vendido, más un 5% del valor de la venta de cada coche. Cada mes el conable de la empresa ingresa en el pc los datos pertinentes.
        Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
        */   
        
        
        
    Scanner entrada = new Scanner(System.in);
    double salario = 1000;
    double comision,porcentajeventa,cantcoches,sumcoches,salariototal;
    
        System.out.println("Ingresa la cantidad de coches vendidos ");
        
            cantcoches = entrada.nextDouble();
        
        System.out.println("Ingresa suma total coches vendidos ");
        
            sumcoches = entrada.nextDouble();
        
        comision =cantcoches*150;
        
        porcentajeventa = (sumcoches*0.05);
        
        salariototal= salario + comision + porcentajeventa;
        
        System.out.println("El salario total es: "+salariototal);
    
    }
}
