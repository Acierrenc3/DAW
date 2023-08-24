package Tienda;

public class ProductoNoPerecedero extends Producto {
    private String garantia;

    public ProductoNoPerecedero(String nombre, double precio, String categoria, String garantia) {
        super(nombre, precio, categoria);
        this.garantia = garantia;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Garantia: " + garantia;
    }
}
