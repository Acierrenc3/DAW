package TiendaEnLinea;

import java.util.*;
import java.io.*;

public class Tienda {

    private ArrayList<Producto> listaProductos;
    private ArrayList<Cliente> listaClientes;
    private File archivoProductos;
    private File archivoClientes;

    //METODOS DE LOS PRODUCTOS
    public Tienda(String archivoProductos, String archivoClientes) {
        this.listaProductos = new ArrayList<Producto>();
        this.listaClientes = new ArrayList<Cliente>();
        this.archivoProductos = new File(archivoProductos);
        this.archivoClientes = new File(archivoClientes);
        cargarDatos(true);
        cargarDatos(false);
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        guardarDatos(true);
    }

    public void eliminarProducto(String nombre) {
        listaProductos.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
        guardarDatos(true);
    }

    public void listarProducto() {
        for (Producto p : listaProductos) {
            System.out.println(p.getNombre() + " - " + p.getDescripcion() + " - " + p.getCategoria() + " - "
                    + p.getPrecio());
        }
    }

    //METODOS DE LOS CLIENTES
    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
        guardarDatos(false);
    }

    public void eliminarClientes(String nombre) {
        listaClientes.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
        guardarDatos(false);

    }

    public void listarClientes() {
        for (Cliente c : listaClientes) {
            System.out.println(c.getNombre() + " - " + c.getGenero() + " - " + c.getEdad());
        }
    }

    private void cargarDatos(boolean cargarProductos) {
        File archivo = cargarProductos ? archivoProductos : archivoClientes;
        ArrayList lista = cargarProductos ? listaProductos : listaClientes;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (cargarProductos) {
                    lista.add(new Producto(datos[0], datos[1], datos[2], Double.parseDouble(datos[3])));
                } else {
                    lista.add(new Cliente(datos[0], datos[1].charAt(0), Integer.parseInt(datos[2])));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void guardarDatos(boolean guardarProductos) {
        File archivo = guardarProductos ? archivoProductos : archivoClientes;
        ArrayList lista = guardarProductos ? listaProductos : listaClientes;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (Object obj : lista) {
                if (guardarProductos) {
                    Producto p = (Producto) obj;
                    bw.write(p.getNombre() + "," + p.getDescripcion() + "," + p.getPrecio() + "," + p.getCategoria() + "\n");
                } else {
                    Cliente c = (Cliente) obj;
                    bw.write(c.getNombre() + "," + c.getGenero() + "," + c.getEdad() + "\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
