package ListarPersonas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaPersonas listaPersonas = new ListaPersonas("personas.txt");

        // Bucle para mostrar el menú y ejecutar las acciones seleccionadas por el usuario
        while (true) {
            System.out.println("1. Agregar persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Buscar persona");
            System.out.println("4. Listar personas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            // Usamos un switch para manejar las diferentes opciones del menú
            switch (opcion) {
                case 1: {
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el género (Hombre/Mujer): ");
                    String genero = scanner.nextLine();
                    Persona persona;
                    if (genero.equalsIgnoreCase("Hombre")) {
                        persona = new Hombre(nombre, edad);
                    } else if (genero.equalsIgnoreCase("Mujer")) {
                        persona = new Mujer(nombre, edad);
                    } else {
                        System.out.println("Género no válido. Intente nuevamente.");
                        break;
                    }
                    listaPersonas.agregarPersona(persona);
                    System.out.println("Persona agregada.");
                    break;
                }
                case 2: {
                    System.out.print("Ingrese el nombre de la persona a eliminar: ");
                    String nombre = scanner.nextLine();
                    listaPersonas.eliminarPersona(nombre);
                    System.out.println("Persona eliminada.");
                    break;
                }
                case 3: {
                    System.out.print("Ingrese el nombre de la persona a buscar: ");
                    String nombre = scanner.nextLine();
                    Persona persona = listaPersonas.buscarPersona(nombre);
                    if (persona != null) {
                        System.out.println(persona.getNombre() + ", " + persona.getEdad() + ", " + (persona instanceof Hombre ? "Hombre" : "Mujer"));
                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                    break;
                }
                case 4: {
                    listaPersonas.listarPersonas();
                    break;
                }
                case 5: {
                    System.out.println("Saliendo...");
                    scanner.close();
                    System.exit(0);
                }
                default: {
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
                }
            }
        }
    }
}
