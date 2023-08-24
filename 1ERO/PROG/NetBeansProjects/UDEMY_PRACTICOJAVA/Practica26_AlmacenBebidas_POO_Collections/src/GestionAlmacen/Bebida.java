
package GestionAlmacen;

public class Bebida {
    
    private int id;
    private double capacidad;
    private String marca;
    private double precio;

    public Bebida(int id, double capacidad, String marca, double precio) {
        this.id = id;
        this.capacidad = capacidad;
        this.marca = marca;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Bebida{" + "id=" + id + ", capacidad=" 
                + capacidad + ", marca=" + marca + ", precio=" + precio + '}';
    }
    
    
    
}
