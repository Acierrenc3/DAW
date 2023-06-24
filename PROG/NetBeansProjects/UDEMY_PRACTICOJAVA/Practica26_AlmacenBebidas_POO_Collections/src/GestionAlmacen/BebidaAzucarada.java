
package GestionAlmacen;

public class BebidaAzucarada extends Bebida{
    private double porcentajeAzucar;

    public BebidaAzucarada( int id, double capacidad, String marca, double precio, double porcentajeAzucar) {
        super(id, capacidad, marca, precio);
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bebida Azucarada{" + "porcentajeAzucar=" + porcentajeAzucar + '}';
    }
    
    
    
}
