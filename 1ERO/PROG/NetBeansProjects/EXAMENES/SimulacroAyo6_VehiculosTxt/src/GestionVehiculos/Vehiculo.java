
package GestionVehiculos;

public abstract class Vehiculo {
    private int añoFabricacion;
    private long numeroVerificacion;
    private String marca;
    private String modelo;

    public Vehiculo(int añoFabricacion, long numeroVerificacion, String marca, String modelo) {
        this.añoFabricacion = añoFabricacion;
        this.numeroVerificacion = numeroVerificacion;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public long getNumeroVerificacion() {
        return numeroVerificacion;
    }

    public void setNumeroVerificacion(long numeroVerificacion) {
        this.numeroVerificacion = numeroVerificacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "a\u00f1oFabricacion=" + añoFabricacion 
                + ", numeroVerificacion=" + numeroVerificacion + ", marca=" + marca 
                + ", modelo=" + modelo + '}';
    }
    
    
    
}
