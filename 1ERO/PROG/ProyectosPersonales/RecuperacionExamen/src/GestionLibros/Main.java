package GestionLibros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner entrada = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.println("--------- MENU ---------");
            System.out.println("1. Registrar Libro Fisico");
            System.out.println("2. Registrar Libro Digital");
            System.out.println("3. Prestar un Libro");
            System.out.println("4. Devolver un Libro");
            System.out.println("5. Mostrar los libros disponibles");
            System.out.println("0. Salir");
            System.out.println("----- Ingrese una opción: -----");
            try {
                opcion = entrada.nextInt();
                entrada.nextLine();
                switch (opcion) {
                    case 1:
                        biblioteca.registrarLibroFisico();
                        break;
                    case 2:
                        biblioteca.registrarLibroDigital();
                        break;
                    case 3:
                        biblioteca.prestarLibro();
                        break;
                    case 4:
                        biblioteca.devolverLibro();
                        break;
                    case 5:
                        biblioteca.mostrarLibrosDisponibles();
                        break;
                    case 0:
                        System.out.println("Gracias por usar la Biblioteca");

                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opcion invalida");
                entrada.nextLine();
            }
            System.out.println();
        } while (opcion != 0);
    }
}
