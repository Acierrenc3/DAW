package GestionBiblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println("--------- MENU ---------");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Eliminar Libro");
            System.out.println("3. Listar Libros");
            System.out.println("4. Media Libros");
            System.out.println("5. Reservar Libro");
            System.out.println("0. Salir");
            System.out.println("Ingrese una opción: ");
            System.out.println("----------------------------");
            try {
                int opcion = entrada.nextInt();
                entrada.nextLine();
                switch (opcion) {
                    case 1:
                        Biblioteca.agregarLibros(biblioteca, entrada);
                        break;
                    case 2:
                        Biblioteca.eliminarLibro(biblioteca, entrada);
                        break;
                    case 3:
                        Biblioteca.listarLibros(biblioteca);
                        break;
                    case 4:
                        double media = biblioteca.mediaPrecio();
                        System.out.println("La media de precios de los libros es: " + media);
                        break;
                    case 5:
                        System.out.print("Introduce el identificador del libro que quieres reservar: ");
                        String identificador = entrada.nextLine();
                        try {
                            biblioteca.reservarLibro(identificador);
                            System.out.println("El libro con identificador " + identificador + " ha sido reservado" );
                        } catch (Exception e) {
                            System.out.println("Error al reservar el libro: " + e.getMessage());
                        }
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opcion invalida");
                entrada.nextLine();
            }
        } while (!salir);
    }

}
