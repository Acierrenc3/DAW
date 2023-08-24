
package estructuracontrol_if;

import java.util.Scanner;

public class EstructuraControl_IF {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Introduzca el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        
        if (num1 > num2) {
            System.out.println("El primer numero: " + num1 + " es mayor que: " + num2);
        }else if(num2 > num1){
            System.out.println("El segundo numero: " + num2 + " es mayor que: " + num1);
        }else{
                    System.out.println("Ambos numeros son iguales");

        }
    }
    
}
