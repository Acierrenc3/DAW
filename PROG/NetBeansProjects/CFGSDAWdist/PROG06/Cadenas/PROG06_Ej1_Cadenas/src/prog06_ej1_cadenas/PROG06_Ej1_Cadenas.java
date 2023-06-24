
package prog06_ej1_cadenas;

//Pedir por teclado dos palabras e indicar cual es la más larga.

import java.util.Scanner;


//B. Usar la funcion concat()

public class PROG06_Ej1_Cadenas {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int longitudP1, longitudP2;
        String palabra1, palabra2;
        
        System.out.println("Escribe la primera de las dos palabras");
        palabra1 = entrada.nextLine();
        
        System.out.println("Escribe la segunda de las dos palabras");
        palabra2 = entrada.nextLine();
        
        System.out.println("Tus dos palabras son: " + palabra1 + ", y: " + palabra2);
        
        System.out.println("============================================");
        
        longitudP1 = palabra1.length();
        longitudP2 = palabra2.length();
        
        
        if (longitudP1 == longitudP2) {
            System.out.println("Las palabras son de identico tamaño");
            
        }else if (longitudP1 > longitudP2) {
                System.out.println("La palabra 1: " + palabra1 + ", es mayor que la palabra 2: " + palabra2);
                
            }else{
                System.out.println("La palabra 2: " + palabra2 + ", es mayor que la palabra 1: " + palabra1);
            }
            
        }
     
    }
    

