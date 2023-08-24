

package pruebaarraysejerc2;

import java.util.Scanner;

//Leer 5 numeros, guardarlos en un Array y mostrarlos en el orden inverso al introducido

public class PruebaArraysEjerc2 {
  
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
      int[] numeros = new int[5];
      
        System.out.println("Guardando los datos en el Arreglo");
        
      for(int i=4;i>=0;i--){
          System.out.print( (i+1) + ". Digita los numeros dentro del Array " );
          numeros[i] = entrada.nextInt();
                                     
      }
            System.out.println("\nLos Numeros son: ");
           for(int i:numeros){ //Bucle  for each
               System.out.println(i);
           }
        
    }

}
