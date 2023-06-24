
package practica14_numespaciocadena_cadenas;
    
import java.util.Scanner;

/*
CArgar una cadena por teclado. Mostrar a continuacion por pantalla cuantos espacios en blanco se ingresaron
*/

public class Practica14_NumEspacioCadena_CADENAS {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca la cadena");
        String cadena = entrada.nextLine();
        int contadorEspacios = 0;
        
        for (int i = 0;  i < cadena.length();  i++) {
            if (cadena.charAt(i) == ' '){
                contadorEspacios++;
                
            }
            
        }
        
        System.out.println("El numero de espacios dentro de la cadena es de: " + contadorEspacios);
    }
    
}
