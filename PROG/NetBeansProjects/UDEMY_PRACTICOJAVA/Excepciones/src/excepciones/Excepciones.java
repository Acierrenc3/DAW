package excepciones;

import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero entero");
        int num;
        
        try {
              num =  entrada.nextInt();
        
        }
        catch(Exception ex){
            num = 0;
        }
        
        System.out.println("El numero es: " + num);
        
    }

}
