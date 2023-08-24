
package ifelse;

import java.util.Scanner;

/*
Declarar un programa que diga si el año es bisiesto o no, con Condicionales
*/


public class IfElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int mes;
        int numeroDias;
        int anio;
        
        System.out.println("Digita el anio que precises");
        anio = entrada.nextInt();

        System.out.println("Digita el mes");
        mes = entrada.nextInt();
        
        System.out.println("Digita el numero de Dias");
        numeroDias = entrada.nextInt();
        
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) {
            numeroDias = 31;
        }else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numeroDias = 30;            
        }else if ( mes == 2) {
            if (anio % 400 == 0 || ( anio % 4 == 0 && !(anio % 100 == 0))) {
                System.out.println("Es un año Bisiesto");
                numeroDias = 29;
            }else{
                numeroDias = 28;
            }
            
         }
        
        System.out.println("Numero de dias = " + numeroDias);
        }
    }
    

