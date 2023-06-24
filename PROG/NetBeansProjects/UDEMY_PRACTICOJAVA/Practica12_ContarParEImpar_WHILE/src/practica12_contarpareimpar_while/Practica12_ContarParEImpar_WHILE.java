
package practica12_contarpareimpar_while;

import java.util.Scanner;

/*
EScribe un programa que lea numeros constantemente mientras no se introduzca un 0.
El programa debe mostrar cuantos de los numeros introducidos son pares y cuantos impares.
*/
public class Practica12_ContarParEImpar_WHILE {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int numero = entrada.nextInt();
        int contPar=0;
        int contImpar=0;
        while (numero != 0) {
            if (numero % 2 == 0) {
                contPar++;
            }else{
                contImpar++;
            }
            System.out.println("Vuelva a introducir un numero");
            numero = entrada.nextInt();
            
        }
        
        System.out.println("Cantidad de numeros pares introducidos: " + contPar);
        System.out.println("Cantidad de numeros Impares introducidos: " + contImpar);
    }
    
}
