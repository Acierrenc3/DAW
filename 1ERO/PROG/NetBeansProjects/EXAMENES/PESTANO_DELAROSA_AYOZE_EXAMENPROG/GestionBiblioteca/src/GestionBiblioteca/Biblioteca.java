package GestionBiblioteca;

import java.util.*;

public class Biblioteca {

    protected ArrayList<Libro> libros;

       
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public void listarLibro() {
        for (Libro l : libros) {
            System.out.println(l.getIdentificador() + " - " + l.getNombre() + " - " + l.getAutor()
                    + " - " + l.getGenero() + " - " + l.getPrecio());
        }
        }

    
    
//Metodo agregar Libros.

    protected static void agregarLibros(Biblioteca biblioteca, Scanner scanner) {
        System.out.println("----- AGREGAR LIBRO -----");
        String identificador;
        String nombre;
        String autor;
        String genero;
        double precio;
        do {
            System.out.println("Ingrese el identificador del libro a agregar al programa");
            identificador = scanner.nextLine();
        } while (identificador.isEmpty());
        do {
            System.out.println("Ingrese el nombre del Libro");
            nombre = scanner.nextLine();
        } while (nombre.isEmpty());
        do {
            System.out.println("Ingrese el autor del Libro");
            autor = scanner.nextLine();
        } while (autor.isEmpty());
        do {
            System.out.println("Ingrese el genero del Libro");
            genero = scanner.nextLine();
        } while (genero.isEmpty());
        do {
            System.out.println("Ingrese el precio del Libro");
            precio = scanner.nextDouble();
            scanner.nextLine();
        } while (precio <= 0);

        Libro nuevoLibro = new Libro(identificador, nombre, autor, genero, precio);
        biblioteca.agregarLibro(nuevoLibro);
        System.out.println("Libro agregado con Exito");
    }

    //Metodo Elimar Libros
    protected static void eliminarLibro(Biblioteca biblioteca, Scanner scanner) {
        System.out.println("----- ELIMINAR LIBRO -----");
        listarLibros(biblioteca);
        if (biblioteca.libros.size() > 0) {
            int indice;
            do {
                try {
                    System.out.println("Ingrese el indice del Libro a Eliminar");
                    indice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Indice incorrecto");
                    scanner.nextLine();
                    indice = -1;
                }
            } while (indice < 0 || indice <= biblioteca.libros.size());
            Libro libro = biblioteca.libros.get(indice);
            biblioteca.eliminarLibro(libro);
            System.out.println("Libro eliminado con exito de la Biblioteca");
        } else {
            System.out.println("No hay libros, por lo tanto no se puede eliminar");
        }
    }

    //Metodo Listar Libros
    protected static void listarLibros(Biblioteca biblioteca) {
        System.out.println("----- LISTAR LIBROS -----");
        if (biblioteca.libros.size() > 0) {
            biblioteca.listarLibro();
        } else {
            System.out.println("No hay libros listados en la Biblioteca");
        }
    }
    
    public Libro buscarLibro(String identificador) {
    for (Libro libro : libros) {
        if (libro.getIdentificador().equalsIgnoreCase(identificador)) {
            return libro;
        }
    }
    return null;
}
    
  //Metodo para saber si el libro está disponible
public boolean estaDisponible(String identificador) throws Exception {
    Libro libro = buscarLibro(identificador);
    if (libro == null) {
        throw new Exception("No existe un libro con el identificador " + identificador);
    }
    return libro.isDisponible();
}

public void reservarLibro(String identificador) {
    boolean reservado = false;
    for (int i = 0; i < libros.size(); i++) {
        if (libros.get(i).getIdentificador() == identificador) {
            libros.remove(i);
            System.out.println("Libro reservado con éxito.");
            reservado = true;
            break;
        }
    }
    if (!reservado) {
        System.out.println("No se encontró ningún libro con ese identificador.");
    }
}
    
    
//Metodo media Precios
public double mediaPrecio() {
    double total = 0;
    int contador = 0;
    for (Libro libro : libros) {
        if (libro.getPrecio() > 0) {
            total += libro.getPrecio();
            contador++;
        }
    }
    if (contador == 0) {
        return 0;
    } else {
        return total / contador;
    }
}


    
        
        
}


