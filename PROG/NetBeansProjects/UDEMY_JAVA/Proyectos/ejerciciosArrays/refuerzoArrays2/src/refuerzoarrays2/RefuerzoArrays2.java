
package refuerzoarrays2;

import java.util.Scanner;

public class RefuerzoArrays2 {

    public static void main(String[] args) {
    
    int nElem, contador;    
    int i = 0;
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("----- Ingresa el numero de valores del Array -----");
    nElem = entrada.nextInt();
    
    int[] numeros = new int[nElem];
    
    System.out.println("--- Digita los elementos del Array ---");
        contador = entrada.nextInt();
        
        while (i<contador) {
            i++;
            
            System.out.println("\n--- Los elementos del Array son: ---");
            System.out.println(i);
            
        }
    
    }
    
}
