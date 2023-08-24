

package com.mycompany.bucle_dowhile;

import java.util.Scanner;


public class Bucle_DOwHile {

    public static void main(String[] args) {
        /* Bucle do While
        
        do{
            Instrucciones;
        }while(condicion);
        */
      Scanner entrada = new Scanner(System.in);
      int i=1, contador;
     
      
        System.out.println("Digite la cantidad de terminos");
        contador = entrada.nextInt();
        
      do{
          System.out.println(i);
          i++;
      }while(i<=contador);
        
        
        
    }
}
