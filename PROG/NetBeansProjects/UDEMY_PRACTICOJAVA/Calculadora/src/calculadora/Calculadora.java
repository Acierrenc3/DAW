
package calculadora;

import java.util.Scanner;

/*
Desarrolla una calculadora de enteros. El programa deberá pedir los operandos al usuario y realizar las
operaciones básicas: suma, resta, multiplicacion y división.

Controlar las excepciones que se puedan producir
*/
public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op1; 
        int op2;
        
        System.out.println("Introduce el primer operando");
        
        try {
            op1 = entrada.nextInt();
        } catch (Exception ex) {
            System.out.println("Tipo de dato introducido incorrecto. Se asignará "
                    + "el valor por defecto: 1");
            op1 = 1;
        }
        System.out.println("Introduzca el segundo operando");
        try {
            op2 = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("Tipo de dato introducido incorrecto. Se asignará "
                    + "el valor por defecto: 1");
            op2 = 1;            
        }
        
        int suma = op1 + op2;
        System.out.println("Suma: " + suma);
        int resta = op1 - op2;
        System.out.println("Resta: " + resta);
        int mult = op1*op2;
        System.out.println("Multiplicacion: " + mult);
        int div;
        
        try {
            div = op1/op2;
            System.out.println("Division: " + div);
        } catch (Exception e) {
            System.out.println("No se puede realizar la operación. División entre 0");
        }
        
        
        
        
        
    }
    
}
