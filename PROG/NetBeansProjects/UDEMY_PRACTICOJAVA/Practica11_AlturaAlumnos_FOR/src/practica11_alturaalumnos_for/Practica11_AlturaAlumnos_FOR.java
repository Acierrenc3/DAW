
package practica11_alturaalumnos_for;

import java.util.Scanner;
/*
Desarrolla un programa que solicite al usuario que introduzca el numero de alumnos de una clase. 
A continuacion, haciendo uso de un bucle, pedir la altura de cada uno de los alumnos. Se debe mostrar:
-Numero de alumnos mayores a 1,80
-Numero de alumnos menores a 1,80
-Promedio de alturas de la clase
*/

public class Practica11_AlturaAlumnos_FOR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero de alumnos de la clase");
        int numAlumnos = entrada.nextInt();
        int contMayores=0;
        int contMenores=0;
        float suma = 0;
        
        for (int i = 1; i <= numAlumnos; i++) {
            System.out.println("Introduzca la altura del alumno " + i);
            float altura = entrada.nextFloat();
            suma = suma + altura;
            if (altura >= 1.80) {
                contMayores++;
            }else{
                contMenores++;
            }
            
        }
        
        double promedio = suma / numAlumnos;
        
        System.out.println("Numero Alumnos > 1,80m  " + contMayores);
        System.out.println("Numero alumnos < 1,80m " + contMenores);
        System.out.println("Promedio de Alturas: " + promedio);
        
    }
    
}
