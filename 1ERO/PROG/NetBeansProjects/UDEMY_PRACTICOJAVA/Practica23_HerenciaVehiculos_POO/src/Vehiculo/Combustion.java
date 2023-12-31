
package Vehiculo;

public class Combustion extends Vehiculo{
    private int cilindrada;
    
    public Combustion(int numBastidor, double peso, int cilindrada) {
        super(numBastidor, peso);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + " - Combustion{" + "cilindrada=" + cilindrada + '}';
    }
    
    public double impuestoBase(){
        return super.impuestoBase(cilindrada)*3;
    }
    
    
}
