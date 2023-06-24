

package javaapplication2;

import java.util.Scanner;


public class JavaApplication2 {

   
    public static void main(String[] args) {
                 Scanner entrada = new Scanner(System.in);
        System.out.println("Dinos tu edad");
        
        int edad = entrada.nextInt();
        
        switch (edad) {
            case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17:
                System.out.println("Eres menor de edad");
                break;
            default:
                System.out.println("Eres mayor de edad"); 
        
        
        }
    }
}


