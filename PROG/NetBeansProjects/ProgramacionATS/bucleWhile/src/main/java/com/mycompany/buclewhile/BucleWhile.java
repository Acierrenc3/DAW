

package com.mycompany.buclewhile;

import java.util.Scanner;

public class BucleWhile {

    public static void main(String[] args) {
     /* Bucle While:
        while(condicion){
            intrucciones;
        }
        */
     int i=1, contador;
     Scanner entrada= new Scanner(System.in);
     
        System.out.println("Digite cuantos numeros quiere en pantalla: ");
        contador = entrada.nextInt();
        
     while(i<=contador){
         System.out.println(i);
        i+= 2;
         
     }
    }
}
