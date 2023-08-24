
package Tienda;

import java.util.ArrayList;


public class Tienda {
    
    protected ArrayList<Producto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public void listarProductos() {
        for (Producto p : productos) {
            System.out.println(p.getNombre() + " - " + p.getDescripcion() + " - " + p.getPrecio() + " - " + p.getCategoria());
        }
    }
}
