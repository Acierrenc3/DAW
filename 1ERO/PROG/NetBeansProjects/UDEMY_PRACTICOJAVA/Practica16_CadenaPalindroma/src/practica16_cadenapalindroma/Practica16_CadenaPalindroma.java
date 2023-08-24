
package practica16_cadenapalindroma;

import java.util.Scanner;

/*
Dada una cadena introducida por teclado, comprobar si se puede leer por detras y por delante igual
ejemplo: radar
*/
public class Practica16_CadenaPalindroma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca la cadena");
        String cadena = entrada.nextLine();
        String cadena2 = "";
        
        for (int i = cadena.length() - 1; i >= 0; i--) {
            char c = cadena.charAt(i);
            cadena2 = cadena2 + c;
        }
        
        if (cadena.equals(cadena2)) {
            System.out.println("La cadena es Palindroma");
        }else{
            System.out.println("No son palindromas");
        }
        
    }
    
}
