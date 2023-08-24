package ejerciciomath2;

import java.util.Scanner;

/* 
 * Dados los lados A y B de un triángulo rectángulo, según el teorema de Pitágoras, 
 * Elaborar un algoritmo que lea el tamaño de los lados A y B, y calcule e imprima C (hipotenusa)
 * el cuadrado de la hipotenusa (C), es igual a la suma del cuadrado de los catetos (lados).c² = a² + b² 
 */

public class ejerciciomathTrigonometria {
    public static void main(String[] args) {
        double a, b, c, hipo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el valor del cateto 'a' ");
        a = entrada.nextDouble();

        System.out.println("Digite el valor del cateto 'b' ");
        b = entrada.nextDouble();

        c = Math.pow(a, 2) + Math.pow(b, 2);
        System.out.println("El valor del cateto c es: " + c);
        c = entrada.nextDouble();    

        hipo = (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        System.out.println("La hipotenusa es de: " + hipo);
        hipo = entrada.nextDouble();
        

       

    }
    
    
}