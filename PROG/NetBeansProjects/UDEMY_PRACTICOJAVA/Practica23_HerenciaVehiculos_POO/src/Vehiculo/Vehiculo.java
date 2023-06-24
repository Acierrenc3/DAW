
package Vehiculo;

public class Vehiculo {
    private int numBastidor;
    private double peso;

    public Vehiculo(int numBastidor, double peso) {
        this.numBastidor = numBastidor;
        this.peso = peso;
    }

    public int getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(int numBastidor) {
        this.numBastidor = numBastidor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double impuestoBase(double impuesto){
        return impuesto = peso*0.45;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "numBastidor=" + numBastidor + ", peso=" + peso + '}';
    }
    
    
    
}
