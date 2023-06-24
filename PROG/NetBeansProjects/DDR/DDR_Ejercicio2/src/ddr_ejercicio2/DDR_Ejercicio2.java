
//Indicar si un numero pasado por consola es par o no.

package ddr_ejercicio2;

import java.util.Scanner;
/**
 *
 * @author ayope
 */
public class DDR_Ejercicio2 {
    public static void main(String[] args) {
     int num;
        Scanner entrada = new Scanner(System.in); 
     
     
        System.out.println("Introduzca un numero");
        num=entrada.nextInt();
        
        if(num%2==0){
            System.out.println("El numero "+num+" es PAR");
        }else{
            System.out.println("El numero "+num+" es IMPAR");
        }
    }
    
}
