
//Pedir 2 numeros por teclado e indicar si uno es mayor que el otro o si son iguales

package ddr_ejercicio3;
import java.util.Scanner;

/**
 *
 * @author ayope
 */
public class DDR_Ejercicio3 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el primer numero");
        num1=entrada.nextInt();
        
        System.out.println("Introduzca el segundo numero");
        num2=entrada.nextInt();
        
        if(num1<=num2){
        
        if(num1==num2){
            System.out.println("Los numeros "+num1+" y "+num2+" son iguales");  
            
        }else{
           System.out.println("El numero "+num2+" es mayor que el numero "+num1);
        }    
   
        }else{
            System.out.println("El numero "+num1+" es mayor que el numero "+num2);
        }

        
        
    }
    
}
