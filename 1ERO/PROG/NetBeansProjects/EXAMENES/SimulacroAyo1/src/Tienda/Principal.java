
package Tienda;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
       Tienda tienda = new Tienda();
       Scanner entrada = new Scanner(System.in);
       boolean salir = false;
       
        do {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Agregar un producto");
            System.out.println("2. Eliminar un producto");
            System.out.println("3. Listar los productos");
            System.out.println("4. Salir del programa");
            System.out.println("--INGRESE UNA OPCION--");
            
            try {
                int opcion = entrada.nextInt();
                entrada.nextLine();
                switch (opcion) {
                    case 1:
                        addProduct(tienda, entrada);
                        break;
                        
                    case 2:
                        removeProduct(tienda, entrada);
                        break;
                   
                        
                    case 3:
                        listProduct(tienda);
                        break;
                        
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("OPCION INVALIDA");
                }
   
            } catch (InputMismatchException e) {
                System.out.println("OPCION INVALIDA, PRUEBE DE NUEVO");
                entrada.nextLine();
            } 
        } while (!salir);    
    }
    
    private static void addProduct(Tienda tienda, Scanner entrada){
        System.out.println("AGREGAR PRODUCTO");
        String nombre;
        String descripcion;
        String categoria;
        double precio;
        
        do {
            System.out.println("Ingrese el nombre del producto a agregar");
            nombre = entrada.nextLine();
        } while (nombre.isEmpty());
        
        do {
            System.out.println("Ingrese la descripcion del producto");
            descripcion = entrada.nextLine();
        } while (descripcion.isEmpty());
        
        do{
            System.out.println("Ingrese la categoria del producto");
            categoria = entrada.nextLine();
        }while(categoria.isEmpty());
        
        do {
            try{
            System.out.println("Ingrese el precio del producto");
            precio = entrada.nextDouble();
            entrada.nextLine();
            }catch (InputMismatchException e){
                System.out.println("El precio es invalido, intentelo de nuevo");
                entrada.nextLine();
                precio = -1;
            }
        } while (precio <= 0);
        
        Producto producto = new Producto(nombre, descripcion, categoria, precio);
        tienda.agregarProducto(producto);
        System.out.println("producto agregado con exito, muchas gracias");
        
    }
    
    private static void listProduct(Tienda tienda) {
        System.out.println("----- LISTADO DE PRODUCTOS -----");
        if (!tienda.productos.isEmpty()) {
            tienda.listarProductos();
        } else {
            System.out.println("No hay productos disponibles");
        }

    }
    
    public static void removeProduct(Tienda tienda, Scanner entrada){
        System.out.println("-----ELIMINAR PRODUCTO-----");
        listProduct(tienda);
        if (tienda.productos.isEmpty()) {
            int id;
            do {
                try {
                    System.out.println("Ingrese el indice del producto a eliminar");
                    id = entrada.nextInt();
                    entrada.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Indice invalido, pruebe de nuevo");
                    entrada.nextLine();
                    id = -1;
                }
            } while (id < 0 || id >= tienda.productos.size());
            Producto product = tienda.productos.get(id);
            
        }

    }
    
}
