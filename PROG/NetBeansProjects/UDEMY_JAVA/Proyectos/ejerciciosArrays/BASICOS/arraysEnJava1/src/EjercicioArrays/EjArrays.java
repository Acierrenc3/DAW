/*
Programa Java que guarda en un array 5 números enteros que se leen por teclado.
A continuación se recorre el array y calcula cuántos números son positivos, 
cuántos negativos y cuántos ceros.
*/
package EjercicioArrays;
import java.util.Scanner;

public class EjArrays {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        int pos = 0, neg  = 0, cero= 0;
        int i;
        
        System.out.println("Inserta 5 numeros cualquiera");
        
        //Leemos los valores por teclado y los guardamos en el Array
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
        }
        
        
        //Recorremos el Array para contar positivos, negativos y ceros
        for (i = 0; i < 5; i++) {                  
        if (numeros[i] > 0) {
            pos++;            
        }else if (numeros[i] < 0){
            neg++;
        }else{
            cero++;
        }
     }
        //Mostramos resultados
        System.out.println("Positivos: "+pos);
        System.out.println("Negativos: "+neg);
        System.out.println("Ceros: "+cero);
    
        
    }

}






