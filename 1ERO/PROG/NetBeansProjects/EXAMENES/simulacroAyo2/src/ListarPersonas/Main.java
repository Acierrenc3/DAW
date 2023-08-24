package ListarPersonas;

import java.util.*;
import java.io.*;

public class Main {

    private static final String ARCHIVO = "listadopersonas.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
         eliminarArchivo(); 

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Agregar una persona");
            System.out.println("2. Eliminar una persona");
            System.out.println("3. Buscar una persona");
            System.out.println("4. Listar todas las Personas");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opción inválida. Por favor, ingrese un número.");
                scanner.nextLine(); 
                continue;
            }
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    agregarPersona(scanner);
                    break;
                case 2:
                    eliminarPersona(scanner);
                    break;
                case 3:
                    buscarPersona(scanner);
                    break;
                case 4:
                    listarPersonas();
                    break;
                case 0:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }

private static void agregarPersona(Scanner scanner) {
    System.out.print("Ingrese el nombre de la persona: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese la edad de la persona: ");
    int edad = scanner.nextInt();
    scanner.nextLine(); 

    System.out.print("Ingrese el género de la persona (H/M): ");
    String genero = scanner.nextLine();
    Persona persona;
    if (genero.equalsIgnoreCase("H")) {
        persona = new Hombre(genero, nombre, edad);
    } else if (genero.equalsIgnoreCase("M")) {
        persona = new Mujer(genero, nombre, edad);
    } else {
        System.out.println("Género inválido. Por favor, intente nuevamente.");
        return;
    }

    try (FileWriter fw = new FileWriter(ARCHIVO, true);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter out = new PrintWriter(bw)) {
        out.println(persona.getClass().getSimpleName() + "," + persona.nombre + "," + persona.edad);
        System.out.println("Persona agregada exitosamente.");
    } catch (IOException e) {
        System.out.println("Error al agregar persona: " + e.getMessage());
    }
}

    private static void eliminarPersona(Scanner scanner) {
        System.out.print("Ingrese el nombre de la persona que desea eliminar: ");
        String nombre = scanner.nextLine();

        List<Persona> personas = leerPersonas();
        boolean eliminado = personas.removeIf(p -> p.nombre.equalsIgnoreCase(nombre));

        if (eliminado) {
            guardarPersonas(personas);
            System.out.println("Persona eliminada exitosamente.");
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    private static void buscarPersona(Scanner scanner) {
        System.out.print("Ingrese el nombre de la persona que desea buscar: ");
        String nombre = scanner.nextLine();

        List<Persona> personas = leerPersonas();
        Optional<Persona> personaBuscada = personas.stream().filter(p -> p.nombre.equalsIgnoreCase(nombre)).findFirst();

        if (personaBuscada.isPresent()) {
            System.out.println("Edad de " + personaBuscada.get().nombre + ": " + personaBuscada.get().edad);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }
    
        private static void listarPersonas() {
        List<Persona> personas = leerPersonas();
        
        if (personas.isEmpty()) {
            System.out.println("No hay personas en la lista.");
            return;
        }
        
        System.out.println("\nLista de personas:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.nombre + " - Edad: " + persona.edad);
        }
    }

private static List<Persona> leerPersonas() {
    List<Persona> personas = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(",");
            String clase = datos[0];
            String nombre = datos[1];
            int edad = Integer.parseInt(datos[2]);
            if (clase.equals("Hombre")) {
                personas.add(new Hombre(clase, nombre, edad));
            } else if (clase.equals("Mujer")) {
                personas.add(new Mujer(clase, nombre, edad));
            }
        }
    } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe. Se creará uno nuevo.");
            try {
                File archivo = new File(ARCHIVO);
                archivo.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error al crear el archivo: " + ex.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return personas;
    }

    private static void guardarPersonas(List<Persona> personas) {
        try (FileWriter fw = new FileWriter(ARCHIVO, false); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {
            for (Persona persona : personas) {
                out.println(persona.nombre + "," + persona.edad );
            }
        } catch (IOException e) {
            System.out.println("Error al guardar personas: " + e.getMessage());
        }
    }
    
        private static void eliminarArchivo() {
        File archivo = new File(ARCHIVO);
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Archivo eliminado exitosamente.");
        } else {
            System.out.println("El archivo no existe.");
        }
    }

}
