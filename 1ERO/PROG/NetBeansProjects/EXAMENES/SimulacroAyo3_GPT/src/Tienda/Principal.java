package Tienda;


import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda;
        try {
            tienda = new Tienda("productos.txt");
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo.");
            return;
        }

        boolean salir = false;
        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Buscar producto");
            System.out.println("5. Listar productos");
            System.out.println("6. Salir");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    try {
                        tienda.agregarProducto();
                    } catch (IOException e) {
                        System.out.println("Error al guardar el producto.");
                    }
                    break;
                case 2:
                    try {
                        tienda.actualizarProducto();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        tienda.eliminarProducto();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    tienda.buscarProducto();
                    break;
                case 5:
                    tienda.listarProductos();
                    break;
                    
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }
}

