package AlmacenarHeroes;

import java.util.List;
import java.util.Scanner;

public class Vista { //Clase para crear el menú del programa junto con los metodos

    private Controlador controlador; //Creamos el objeto controlador en la clase Vista que nos ayudará a acceder a los metodos de la clase Controlador

    public Vista(Controlador controlador) {
        this.controlador = controlador;
    }

    public void mostrarMenu() { 
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar superhéroe");
            System.out.println("2. Mostrar lista de superhéroes");
            System.out.println("3. Buscar superhéroes por nombre o poder");
            System.out.println("4. Eliminar superhéroes por nombre o poder");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    agregarSuperheroe(scanner);
                    break;
                case 2:
                    mostrarSuperheroes();
                    break;
                case 3:
                    buscarSuperheroes(scanner);
                    break;
                case 4:
                    eliminarSuperheroes(scanner);
                    break;
                case 0:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (opcion != 0);
    }

    private void agregarSuperheroe(Scanner scanner) {
        System.out.print("Ingrese el nombre del superhéroe: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el poder del superhéroe: ");
        String poder = scanner.nextLine();
        controlador.agregarSuperheroe(nombre, poder);
        System.out.println("Superhéroe agregado.");
    }

    private void mostrarSuperheroes() {
        System.out.println("Lista de superhéroes:");
        List<SuperHeroe> superheroes = controlador.buscarSuperheroes("");
        if (superheroes.isEmpty()) {
            System.out.println("No hay superhéroes en la lista.");
        } else {
            for (SuperHeroe s : superheroes) {
                System.out.println(s.getNombre() + " - " + s.getPoder());
            }
        }
    }
    
    private void buscarSuperheroes(Scanner scanner) {
    System.out.print("Ingrese el filtro de búsqueda: ");
    String filtro = scanner.nextLine();
    List<SuperHeroe> superheroes = controlador.buscarSuperheroes(filtro);
    if (superheroes.isEmpty()) {
        System.out.println("No se encontraron superhéroes.");
    } else {
        System.out.println("Resultados de la búsqueda:");
        for (SuperHeroe s : superheroes) {
            System.out.println(s.getNombre() + " - " + s.getPoder());
        }
    }
}
    
    private void eliminarSuperheroes(Scanner scanner) {
    System.out.print("Ingrese el filtro de eliminación: ");
    String filtro = scanner.nextLine();
    controlador.eliminarSuperheroes(filtro);
    System.out.println("Superhéroes eliminados.");
}

}
