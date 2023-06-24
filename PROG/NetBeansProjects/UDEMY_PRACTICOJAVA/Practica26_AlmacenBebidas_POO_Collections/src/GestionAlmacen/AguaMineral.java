
package GestionAlmacen;

public class AguaMineral extends Bebida{
    private String origen;

    public AguaMineral( int id, double capacidad, String marca, double precio, String origen) {
        super(id, capacidad, marca, precio);
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return super.toString() +  ", Agua Mineral{" + "origen=" + origen + '}';
    }
    
    
    
    
}
