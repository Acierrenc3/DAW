package TiendaEnLinea;

import java.util.Scanner;

public class MainTiendaEnLinea {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Tienda tienda = new Tienda("productos.txt", "clientes.txt");
        boolean salir = false;

        do {
            System.out.println("Bienvenido a la tienda en línea");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Listar productos");
            System.out.println("4. Agregar cliente");
            System.out.println("5. Eliminar cliente");
            System.out.println("6. Listar clientes");
            System.out.println("0. Salir");

            int opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del producto:");
                    String nombre = entrada.nextLine();
                    System.out.println("Ingrese la descripción del producto:");
                    String descripcion = entrada.nextLine();
                    System.out.println("Ingrese el precio del producto:");
                    double precio = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.println("Ingrese la categoría del producto:");
                    String categoria = entrada.nextLine();
                    tienda.agregarProducto(new Producto(nombre, descripcion, categoria, precio));
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto que desea eliminar:");
                    String nombreProducto = entrada.nextLine();
                    tienda.eliminarProducto(nombreProducto);
                    break;
                case 3:
                    tienda.listarProducto();
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del cliente:");
                    String nombreCliente = entrada.nextLine();
                    System.out.println("Ingrese el género del cliente (M/F):");
                    char genero = entrada.nextLine().charAt(0);
                    System.out.println("Ingrese la edad del cliente:");
                    int edad = entrada.nextInt();
                    entrada.nextLine();
                    tienda.agregarCliente(new Cliente(nombreCliente, genero, edad));
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del cliente que desea eliminar:");
                    String nombreClienteEliminar = entrada.nextLine();
                    tienda.eliminarClientes(nombreClienteEliminar);
                    break;
                case 6:
                    tienda.listarClientes();
                    break;
                case 0:
                    salir = true;
                    System.out.println("Saliendo de la tienda online");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            
            
        } while (!salir);
    }

}
