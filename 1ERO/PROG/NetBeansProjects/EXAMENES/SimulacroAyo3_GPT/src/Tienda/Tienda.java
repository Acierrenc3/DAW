package Tienda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    private ArrayList<Producto> listaProductos;
    private File archivo;

    public Tienda(String rutaArchivo) throws IOException {
        listaProductos = new ArrayList<>();
        archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            archivo.createNewFile();
        } else {
            cargarProductos();
        }
    }

private void cargarProductos() throws FileNotFoundException {
    Scanner scanner = new Scanner(archivo);
    while (scanner.hasNextLine()) {
        String linea = scanner.nextLine();
        String[] datos = linea.split(",");
        if (datos.length == 4) {
            Producto producto = new Producto(datos[0], Double.parseDouble(datos[1]), datos[2]);
            listaProductos.add(producto);
        } else if (datos.length == 5) {
            ProductoPerecedero producto = new ProductoPerecedero(datos[0], Double.parseDouble(datos[1]), datos[2], Integer.parseInt(datos[3]));
            listaProductos.add(producto);
        } else if (datos.length == 6) {
            ProductoNoPerecedero producto = new ProductoNoPerecedero(datos[0], Double.parseDouble(datos[1]), datos[2], datos[3]);
            listaProductos.add(producto);
        }
    }
    scanner.close();
}

public void agregarProducto() throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el nombre del producto:");
    String nombre = scanner.nextLine();
    System.out.println("Ingrese el precio del producto:");
    double precio = Double.parseDouble(scanner.nextLine());
    System.out.println("Ingrese la categoría del producto:");
    String categoria = scanner.nextLine();
    System.out.println("Es un producto perecedero? (S/N)");
    String respuesta = scanner.nextLine();
    if (respuesta.equalsIgnoreCase("S")) {
        System.out.println("Ingrese los días para caducar:");
        int diasParaCaducar = Integer.parseInt(scanner.nextLine());
        ProductoPerecedero producto = new ProductoPerecedero(nombre, precio, categoria, diasParaCaducar);
        listaProductos.add(producto);
    } else {
        System.out.println("Ingrese la garantía del producto:");
        String garantia = scanner.nextLine();
        ProductoNoPerecedero producto = new ProductoNoPerecedero(nombre, precio, categoria, garantia);
        listaProductos.add(producto);
    }
    guardarProductos();
    System.out.println("Producto agregado correctamente.");
}

public void actualizarProducto() throws IOException, Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el nombre del producto que desea actualizar:");
    String nombre = scanner.nextLine();
    boolean encontrado = false;
    for (Producto producto : listaProductos) {
        if (producto.getNombre().equalsIgnoreCase(nombre)) {
            System.out.println("Qué desea actualizar? (precio/categoría)");
            String opcion = scanner.nextLine();
            if (opcion.equalsIgnoreCase("precio")) {
                System.out.println("Ingrese el nuevo precio:");
                double precio = Double.parseDouble(scanner.nextLine());
                producto.setPrecio(precio);
            } else if (opcion.equalsIgnoreCase("categoria")) {
                System.out.println("Ingrese la nueva categoría:");
                String categoria = scanner.nextLine();
                producto.setCategoria(categoria);
            }
            encontrado = true;
            guardarProductos();
            System.out.println("Producto actualizado correctamente.");
            break;
        }
    }
    if (!encontrado) {
        throw new Exception("El producto no se encuentra en la lista.");
    }
}

public void eliminarProducto() throws IOException, Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el nombre del producto que desea eliminar:");
    String nombre = scanner.nextLine();
    boolean encontrado = false;
    for (int i = 0; i < listaProductos.size(); i++) {
        if (listaProductos.get(i).getNombre().equalsIgnoreCase(nombre)) {
            listaProductos.remove(i);
            encontrado = true;
            guardarProductos();
            System.out.println("Producto eliminado correctamente.");
            break;
        }
    }
    if (!encontrado) {
        throw new Exception("El producto no se encuentra en la lista.");
    }
}

public void buscarProducto() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el nombre del producto que desea buscar:");
    String nombre = scanner.nextLine();
    boolean encontrado = false;
    for (Producto producto : listaProductos) {
        if (producto.getNombre().equalsIgnoreCase(nombre)) {
            System.out.println(producto.toString());
            encontrado = true;
            break;
        }
    }
    if (!encontrado) {
        System.out.println("El producto no se encuentra en la lista.");
    }
    }

public void listarProductos() {
    if (listaProductos.isEmpty()) {
        System.out.println("No hay productos en la lista.");
    } else {
        for (Producto producto : listaProductos) {
            System.out.println(producto.toString());
        }
    }
}

private void guardarProductos() throws IOException {
    FileWriter writer = new FileWriter(archivo);
    for (Producto producto : listaProductos) {
        if (producto instanceof ProductoPerecedero) {
            ProductoPerecedero productoPerecedero = (ProductoPerecedero) producto;
            writer.write(productoPerecedero.getNombre() + "," + productoPerecedero.getPrecio() + "," +
                    productoPerecedero.getCategoria() + "," + productoPerecedero.getDiasParaCaducar() + "\n");
            
        } else if (producto instanceof ProductoNoPerecedero) {
            ProductoNoPerecedero productoNoPerecedero = (ProductoNoPerecedero) producto;
            writer.write(productoNoPerecedero.getNombre() + "," + productoNoPerecedero.getPrecio() + "," +
                    productoNoPerecedero.getCategoria() + "," + productoNoPerecedero.getGarantia() + "\n");
        
        } else {
            writer.write(producto.getNombre() + "," + producto.getPrecio() + "," + producto.getCategoria() + "\n");
        }
    }
    writer.close();
}
}
