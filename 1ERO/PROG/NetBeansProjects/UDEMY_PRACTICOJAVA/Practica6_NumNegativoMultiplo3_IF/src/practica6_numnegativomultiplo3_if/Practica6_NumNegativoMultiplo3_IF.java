
package practica6_numnegativomultiplo3_if;
/*
Escribe un programa que pida al usuario un numero y muestre por pantalla si es negativo y 
multiplo de 3, o si no lo es.
*/
import java.util.Scanner;

public class Practica6_NumNegativoMultiplo3_IF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero");
        int numero = entrada.nextInt();
        
        if (numero < 0 && numero%3 == 0) {
            System.out.println("El numero " + numero + " es negativo y multiplo de 3");
            
        }else{
            System.out.println("El numero no cumple las condiciones");
        }
    }
    
}
