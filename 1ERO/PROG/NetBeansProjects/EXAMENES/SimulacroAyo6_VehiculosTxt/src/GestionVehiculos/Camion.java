
package GestionVehiculos;


public class Camion extends Vehiculo{
    
    private int capacidadCarga;

    public Camion(int capacidadCarga, int añoFabricacion, long numeroVerificacion, String marca, String modelo) {
        super(añoFabricacion, numeroVerificacion, marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return   "capacidadCarga=" + capacidadCarga + super.toString() ;
    }
    
    
    
    
    
}
