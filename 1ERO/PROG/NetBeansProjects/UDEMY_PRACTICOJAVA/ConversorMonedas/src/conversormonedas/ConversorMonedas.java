package conversormonedas;

import java.util.Scanner;

/*
        Escribe un programa que realice la conversion de euros a dolares.
        Para ello, pedirá al usuario que introduzca los euros a convertir y mostrará por consola la equivalencia
        en dolares de dicha cantidad, sabiendo que 1 euro = 1.21 dolares
 */
public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca los euros a convertir: ");
        double euros = entrada.nextDouble();
        
        double dolares = euros * 1.21;
        
        System.out.println(euros + " Euros =  " + dolares + " dolares" );
    }

}
