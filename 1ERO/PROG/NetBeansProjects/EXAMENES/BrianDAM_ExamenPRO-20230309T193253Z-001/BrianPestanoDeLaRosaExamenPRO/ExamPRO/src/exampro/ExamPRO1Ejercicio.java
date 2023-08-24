package exampro;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*@author Brian*/

public class ExamPRO1Ejercicio {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        double n=0;
        int posicion=0;
        double[] valores = {-90.8, 19.93, 40.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};                       
        System.out.println("# Contenido del array antes de modificar:\n");
        for (int i = 0; i < valores.length; i++) { 
            System.out.printf("%.2f ", valores[i]); 
        }
        System.out.println("");

        boolean entradaValida = true;
        while (entradaValida) {
            try {
              System.out.print("\n--> Introducir la posición del array para modificar su valor: ");
                posicion = entrada.nextInt();
                if (posicion > 10) {
                    System.out.println("\n--> [!] Solo se admiten valores menores o iguales a 10, cambia el valor introducido");
                }else if (posicion <= 0) {
                    System.out.println("\n--> [!] Atención, el valor no puede ser negativo.");
                }else{entradaValida = false;}
            }catch (InputMismatchException e) {
                System.out.println("\n--> [!] Detectado un valor invalido, vuelva a introducir un valor numerico");
                entradaValida = true;
                
            } finally {
                entrada.nextLine(); // Limpiar buffer de entrada
            }
         
        } 
        entradaValida = true;
        while (entradaValida) {
            try {
            System.out.print("\n--> Introducir el nuevo valor en la posición seleccionada [" + posicion + "]: ");                         
            n = entrada.nextDouble();
            entradaValida = false;
            }catch (InputMismatchException e) {
                System.out.println("\n--> El valor introducido no es un número válido. Introduzca un número.");
                entradaValida = true;
            } finally {
                entrada.nextLine(); // Limpiar buffer de entrada
            }
        }
        valores[posicion] = n;
        System.out.println("\n--> Posición a modificar: " + posicion);
        System.out.println("--> Nuevo valor: " + n);
        System.out.println("# Contenido del array modificado:\n");
        for (int i = 0; i < valores.length; i++) { 
            System.out.printf("%.2f ", valores[i]); 
        }
    }
}