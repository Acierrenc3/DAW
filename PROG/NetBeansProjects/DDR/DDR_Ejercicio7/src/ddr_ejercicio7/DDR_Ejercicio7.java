
package ddr_ejercicio7;
import java.util.Scanner;

/*
 * Realizar la suma del 1 al numero que indiquemos, este debe ser mayor a 1.
 */
public class DDR_Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        System.out.println("Digita un numero entero mayor que el 1");
              
        do{           
           num1 = entrada.nextInt();
           
           if(num1<=1){
               System.out.println("El numero introducido no es correcto, "
                       + "introduce otro.");  
                }
            
        }while(num1<=1);
        
        int suma=0;
        
        for(int cont=1; cont<=num1; cont++){
            suma+=cont;           
        }
        
        System.out.println("La suma es: "+suma);
        
    }
    
}
