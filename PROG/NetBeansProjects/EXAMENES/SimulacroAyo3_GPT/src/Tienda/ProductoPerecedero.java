package Tienda;

public class ProductoPerecedero extends Producto {
    private int diasParaCaducar;

    public ProductoPerecedero(String nombre, double precio, String categoria, int diasParaCaducar) {
        super(nombre, precio, categoria);
        this.diasParaCaducar = diasParaCaducar;
    }

    public int getDiasParaCaducar() {
        return diasParaCaducar;
    }

    public void setDiasParaCaducar(int diasParaCaducar) {
        this.diasParaCaducar = diasParaCaducar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Dias para caducar: " + diasParaCaducar;
    }
}