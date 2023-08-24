
package ddr_ejercicio1;
/*
    Leer un numero por teclado y mostrar por consola el caracter al que pertenece en la tabla ASCII.
*/
import java.util.Scanner;

/**
 *
 * @author ayope
 */
public class DDR_Ejercicio1 {
    public static void main(String[] args) {
    int num; 
    Scanner entrada = new Scanner(System.in);  
    
        System.out.println("Introduce un numero");
        num = entrada.nextInt();
        
    char caracter=(char)num;
        System.out.println("El numero "+num+" Corresponde al caracter ASCII: '"+caracter+"'");
    
    }
    
}
