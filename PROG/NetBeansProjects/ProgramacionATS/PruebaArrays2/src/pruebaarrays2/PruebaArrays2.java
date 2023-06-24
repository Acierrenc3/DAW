

package pruebaarrays2;

import java.util.Scanner;

//Llenar un Array
public class PruebaArrays2 {   
    
   public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
      int nElementos;
      
       System.out.println("Digita numeros de elementos: "); //Primero preguntamos al usuario cuantos espacios tendrá nuestro Array
       nElementos = entrada.nextInt();
       
       char[] letras = new char[nElementos]; // Creamos un arreglo del  tipo "char" ya que guardaremos e imprimiremos Carácteres
       
       System.out.println("Digite los elementos del  Arreglo: "); //Con esto le pedimos los elementos del Arreglo
       for(int i=0;i<nElementos;i++){ //Aquí usamos el Bucle for para que el itinerador(i) comience a contar desde una posicion = 0 y que sea menor a nElementos, nuestra variable, y que vaya sumandose
           System.out.println( (i+1) + ".Digite un Caracter: "); //Las personas no están  acostumbradas a contar desde 0, de ahí el (i+1)
           letras[i] = entrada.next().charAt(0); //Con esto guardamos el Array letras a través del Scanner y desde un valor charAt(0) para que guarde el primer caracter que encuentre
           
       }
       
       System.out.println("\nLos caracteres del Arreglo son: ");
       for(int i=0;i<nElementos;i++){ //Usamos otro bucle for para imprimir todas las letras guardadas
           System.out.println(letras[i]);
       }
   }
}