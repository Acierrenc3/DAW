
package javaapplication9;

import java.util.Scanner;
//Llenar un Array
public class ArraysPrueba2 {
    
   public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
      int nElementos;
      
       System.out.println("Digita numeros de elementos: ");
       nElementos = entrada.nextInt();
       
       char[] letras = new char[nElementos];
       
       System.out.println("Digite los elementos del  Arreglo: ");
       for(int i=0;i<nElementos;i++){
           System.out.println( (i+1) + ".Digite un Caracter: ");
           letras[i] = entrada.next().charAt(0);
           
       }
       
       System.out.println("\nLos caracteres del Arreglo son: ");
       for(int i=0;i<nElementos;i++){
           System.out.println(letras[i]);
       }
   }
}
    
    

