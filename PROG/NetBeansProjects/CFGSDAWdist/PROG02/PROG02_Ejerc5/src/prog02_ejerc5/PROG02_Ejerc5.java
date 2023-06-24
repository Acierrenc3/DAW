

package prog02_ejerc5;

import java.util.Scanner;


public class PROG02_Ejerc5 {
// Diseñar programa PROG02_Ejerc5 que dado un numero de segundos, muestre en pantalla cuantos minutos, horas y días contiene.
   
    public static void main(String[] args) {    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digita un Numero al azar"); 
        
        int segundos = entrada.nextInt();
        
        int dia = segundos /86400;
        segundos %= 86400;
        
        int horas = segundos / 3600;
        segundos  %= 3600;
        
        int minutos = segundos / 60;
        segundos %= 60;
        
        System.out.println("El resultado es: "+minutos+" Minutos "+horas+" Horas "+" y "+dia+" Dias");
        
        
        
    }
    
    

     
        
        
    }


