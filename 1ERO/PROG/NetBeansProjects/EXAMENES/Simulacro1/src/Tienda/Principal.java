package Tienda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Listar productos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            try {
                int opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 1:
                        agregarProducto(tienda, scanner);
                        break;
                    case 2:
                        eliminarProducto(tienda, scanner);
                        break;
                    case 3:
                        listarProductos(tienda);
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opción inválida");
                scanner.nextLine();
            }
        } while (!salir);
    }

    private static void agregarProducto(Tienda tienda, Scanner scanner) {
        System.out.println("----- AGREGAR PRODUCTO -----");
        String nombre;
        String descripcion;
        double precio;
        String categoria;
        do {
            System.out.print("Ingrese el nombre: ");
            nombre = scanner.nextLine();
        } while (nombre.isEmpty());
        do {
            System.out.print("Ingrese la descripción: ");
            descripcion = scanner.nextLine();
        } while (descripcion.isEmpty());
        do {
            try {
                System.out.print("Ingrese el precio: ");
                precio = scanner.nextDouble();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Precio inválido");
                scanner.nextLine();
                precio = -1;
            }
        } while (precio <= 0);

        do {
            System.out.print("Ingrese la categoría: ");
            categoria = scanner.nextLine();
        } while (categoria.isEmpty());
        Producto producto = new Producto(nombre, descripcion, precio, categoria);
        tienda.agregarProducto(producto);
        System.out.println("Producto agregado con éxito");
    }

    private static void eliminarProducto(Tienda tienda, Scanner scanner) {
        System.out.println("----- ELIMINAR PRODUCTO -----");
        listarProductos(tienda);
        if (tienda.productos.size() > 0) {
            int index;
            do {
                try {
                    System.out.print("Ingrese el índice del producto a eliminar: ");
                    index = scanner.nextInt();
                    scanner.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Índice inválido");
                    scanner.nextLine();
                    index = -1;
                }
            } while (index < 0 || index >= tienda.productos.size());
            Producto producto = tienda.productos.get(index);
            tienda.eliminarProducto(producto);
            System.out.println("Producto eliminado con éxito");
        } else {
            System.out.println("No hay productos para eliminar");
        }
    }

    private static void listarProductos(Tienda tienda) {
        System.out.println("----- LISTADO DE PRODUCTOS -----");
        if (tienda.productos.size() > 0) {
            tienda.listarProductos();
        } else {
            System.out.println("No hay productos disponibles");
        }

    }

}
