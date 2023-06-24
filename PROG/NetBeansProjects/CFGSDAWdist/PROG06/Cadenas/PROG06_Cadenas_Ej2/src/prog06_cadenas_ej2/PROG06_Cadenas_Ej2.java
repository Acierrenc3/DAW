
package prog06_cadenas_ej2;

import java.util.Scanner;

/*
Diseñar un programa que:
1. Lea un texto introducido por el usuario (Únicamente texto)
2. Indique el número de carácteres que contiene el texto
3. Indique cuantas veces se repiten los mismos carácteres
Se consideran iguales las Mayúsculas y las Minúsculas.
*/

public class PROG06_Cadenas_Ej2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String texto;
        int[] repCaracteres;
        
        System.out.println("Introduce un texto no muy largo");
        texto = entrada.nextLine();
        texto = texto.toLowerCase();
        
        repCaracteres = new int ['z' - 'a' + 1];
        
        for (int i = 0; i < repCaracteres.length; i++) {
            if (Character.isLetter(texto.charAt(i))) {
                repCaracteres [texto.charAt(i) - 'a']++;
                
            }
            
        }
        
        for (int i = 0; i < 'z' - 'a'; i++) {
            if (repCaracteres[i] != 0) {
                System.out.println((char) (i + 'a') + " --> " + repCaracteres[i] + " veces");
                System.out.println(4 + 1 + "-" + 4 + 1);
                
            }
            
        }
        
        
        
        
    }
    
}
