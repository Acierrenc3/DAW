/*
Has de preguntar al usuario cuantos datos desea introducir y luego pedir los datos. 
Haremos 2 programas, en uno se pedirán los datos mediante un bucle FOR y en otro programa mediante un WHILE.
Tras disponer de los datos, se harán las siguientes operaciones sobre ellos en el mismo programa de forma consecutiva:
Almacenarlos en array y mostrar los datos en orden inverso al introducido.
Mostrar solo los mayores a 10.
Mostrar solo los pares
Mostrar solo los pares con un mensaje diciendo este número es X y es mayor que x-1 y está en el array en la posición i
Ejemplo de texto: 
“Este número es 24 y mayor a 23 y está en el array en la posición 5”.
*/

package refuerzoarrays1;

import java.util.Scanner;

public class RefuerzoArrays1 {
    public static void main(String[] args) {         
     Scanner entrada = new Scanner(System.in);
     int nElem;
     
     //Caso 1 - Preguntar y Almacenar los valores del Array
       
     System.out.println("----- Ingresa el numero de valores del Array -----");
     nElem = entrada.nextInt();
     
      int[] numeros = new int[nElem];
     
        System.out.println("--- Digita los elementos del Array ---");   
     for(int i = 0; i < nElem; i++){
        numeros[i] = entrada.nextInt();
        }
     
        System.out.println("\n--- Los elementos del Array son: ---");
        for (int i = 0; i < nElem; i++) {
            System.out.println(numeros[i]);
        }
        
     //Caso 2 - Mostrar solo los mayores de 10:
     
        for (int i = nElem-1; i >= 0; i--) {
            if (numeros[i] > 10) {
                System.out.println("El numero mayor a 10 es: " + numeros[i]);                            
        }               
    }       
        System.out.println("No hay numeros mayores a 10");
        
    //Caso 3 - Mostrar solo los Pares
    
        for (int i = nElem-1; i >= 0; i--) {
            if (numeros[i] %2 == 0) {
                System.out.println(numeros[i]);
            }
            
        }

        System.out.println("No hay numeros Pares");
    
    //Caso 4 - Mostrar los pares con un mensaje diciendo: el x es mayor que x-1 y su posicion en el Array
    
        for (int i = nElem-1; i >= 0; i--) {
         if (numeros[i] %2 == 0) {
           System.out.println(numeros[i] + " Es mayor que: " + (numeros[i]-1) + " Y su posicion en el Array es de: "+ i);
   

            }
            
        }
    }
}
