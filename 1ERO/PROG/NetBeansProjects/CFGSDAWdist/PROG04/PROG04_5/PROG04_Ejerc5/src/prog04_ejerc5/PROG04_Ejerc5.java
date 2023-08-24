/*
 * Cuando dividimos un numero entre 0 se genera un valor indeterminado. En cualquier lenguaje de programacion este tipo
 * de operaciones genera un error de ejecucion que debe ser controlado desde el codigo para evitar malas experiencias al
    usuario. En Java, cuando se produce esta operacion se genera la excepcion ArithmicException. Queremos implementar
    un programa Java que calcule la division de dos numeros solicitados por teclado (dividendo y divisor). El programa
    Solicitará numeros indefinidamente hasta que ambos solicitados sean -1. Se debe controlar mediante excepciones que el
    divisior no sea 0. En caso de serlo, se mostrará un mensaje por pantalla. Tambien habra quye mostrar por pantalla
    el número de divisiones calculadas. Utiliza numeros enteros para las variables.
 */ 
package prog04_ejerc5;

import java.util.Scanner;

/**
 *
 * @author Ayope
 */
public class PROG04_Ejerc5 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in); 
       
        int numDivisiones = 0;
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        
        while(num1 != -1 && num2 != -1){

            try {
            System.out.println("Introduce el dividendo");
            num1 = entrada.nextInt();
            
            System.out.println("Introduce el divisior");
            num2 = entrada.nextInt();
            
            if(num1 != -1 && num2 != -1) {
            
            resultado = num1/num2;
            System.out.println("El resultado: "+resultado);
            numDivisiones++;
            }
            } catch(ArithmeticException e){
                System.out.println("No se puede dividir entre 0");
           }
            
        }
   
        System.out.println("Numero de divisiones: "+numDivisiones);
        
        
    }
    
}
