package GestionLibros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    private List<LibroFisico> librosFisicos;
    private List<LibroDigital> librosDigitales;

    public Biblioteca() {
        librosFisicos = new ArrayList<>();
        librosDigitales = new ArrayList<>();
    }

    public void registrarLibroDigital() {
        System.out.println("--- AGREGAR LIBRO DIGITAL ---");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el ID del libro: ");
        String id = entrada.nextLine();
        System.out.println("Ingrese el título del Libro");
        String titulo = entrada.nextLine();
        System.out.println("Ingrese el autor del Libro");
        String autor = entrada.nextLine();
        System.out.println("Ingrese el tamaño en MB del Libro: ");
        double tamanioMb = Double.parseDouble(entrada.nextLine()); //En vez de poner nextInt y luego nextLine.

        librosDigitales.add(new LibroDigital(id, titulo, autor, tamanioMb));
        librosDigitales.get(librosDigitales.size() - 1).setDisponible(true);
        System.out.println("El Libro Digital ha sido agregado correctamente");
    }

    public void registrarLibroFisico() {
        System.out.println("--- AGREGAR LIBRO FISICO ---");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el ID del libro: ");
        String id = entrada.nextLine();
        System.out.println("Ingrese el título del Libro");
        String titulo = entrada.nextLine();
        System.out.println("Ingrese el autor del Libro");
        String autor = entrada.nextLine();
        System.out.println("Ingrese el numero de Páginas del Libro: ");
        int numPaginas = Integer.parseInt(entrada.nextLine());

        librosFisicos.add(new LibroFisico(id, titulo, autor, numPaginas));
        librosFisicos.get(librosFisicos.size() - 1).setDisponible(true);
        System.out.println("El Libro Fisico ha sido agregado correctamente");
    }

    public void prestarLibro() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Libros disponibles: ");

        List<Libro> librosDisponibles = new ArrayList<>();
        for (LibroFisico libro : librosFisicos) {
            if (libro.isDisponible()) {
                librosDisponibles.add(libro);
                System.out.println(libro);
            }
        }

        for (LibroDigital libro : librosDigitales) {
            if (libro.isDisponible()) {
                librosDisponibles.add(libro);
                System.out.println(libro);
            }
        }

        if (librosDisponibles.isEmpty()) {
            System.out.println("No hay libros en nuestra Biblioteca");
            return;

        }

        System.out.println("Ingrese el ID del Libro que desea prestar");
        String id = entrada.nextLine();
        for (Libro libro : librosDisponibles) {
            if (libro.getId().equals(id)) {
                libro.setDisponible(false);
                System.out.println("Libro prestado con éxito");
                return;
            }
        }
        System.out.println("El ID del libro ingresado no corresponde con ningun libro disponible en la biblioteca");

    }

    public void devolverLibro() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Libros prestados: ");
        List<Libro> librosPrestados = new ArrayList<>();

        for (LibroFisico libro : librosFisicos) {
            if (!libro.isDisponible()) {
                librosPrestados.add(libro);
                System.out.println(libro);
            }
        }

        for (LibroDigital libro : librosDigitales) {
            if (!libro.isDisponible()) {
                librosPrestados.add(libro);
                System.out.println(libro);
            }
        }

        if (librosPrestados.isEmpty()) {
            System.out.println("No hay libros prestados");
            return;
        }
        System.out.print("Ingrese el ID del libro que desea devolver: ");
        String id = entrada.nextLine();
        for (Libro libro : librosPrestados) {
            if (libro.getId().equals(id)) {
                libro.setDisponible(true);
                System.out.println("Libro devuelto con éxito.");
                return;
            }
        }
        System.out.println("El ID del libro ingresado no corresponde a ningún libro prestado.");

    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles:");
        for (LibroFisico libro : librosFisicos) {
            if (libro.isDisponible()) {
                System.out.println(libro.toString());
            }
        }
        for (LibroDigital libro : librosDigitales) {
            if (libro.isDisponible()) {
                System.out.println(libro.toString());
            }
        }
        if (librosFisicos.isEmpty() && librosDigitales.isEmpty()) {
            System.out.println("No hay libros registrados.");
        }
    }
}
