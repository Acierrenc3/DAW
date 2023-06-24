package ejerciciomath1;

import java.util.Scanner;

public class ejerciciomath {
    public static void main (String [] args){
        int Radio;     
        System.out.println("Ingresa el tamaño del radio: ");
        Scanner radio = new Scanner(System.in);
        Radio = radio.nextInt();
        double Area = Math.PI * Math.pow(Radio, 2) ; 
        System.out.println("El área del circulo es de " + Area);
    }
    
}