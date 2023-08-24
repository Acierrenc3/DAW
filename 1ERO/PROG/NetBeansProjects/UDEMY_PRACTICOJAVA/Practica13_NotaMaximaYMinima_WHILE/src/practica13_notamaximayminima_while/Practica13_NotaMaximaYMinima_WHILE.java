package practica13_notamaximayminima_while;

import java.util.Scanner;

/*
Realizar un algoritmo que lea las notas comprendidas entre 0 y 10. El programa deberá de leer las notas hasta
encontrar una nota no valida
 */
public class Practica13_NotaMaximaYMinima_WHILE {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una nota");
        double nota = entrada.nextDouble();
        double notaMayor = -1;
        double notaMenor = 11;   

        while (nota >= 0 && nota <= 10) {
            if (nota > notaMayor) {
                notaMayor = nota;

            } else if (nota < notaMenor) {
                notaMenor = nota;
            }

            System.out.println("Introduce otra nota");
            nota = entrada.nextDouble();
        }

        System.out.println("La nota mas alta es: " + notaMayor);
        System.out.println("La nota mas baja es: " + notaMenor);
    }

}
