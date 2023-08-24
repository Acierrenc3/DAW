
package Vehiculo;

public class Motor {
    private double cilindrada;
    private TipoMotor tipo;

    public Motor(double cilindrada, TipoMotor tipo) {
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    public Motor() { //Constructor vacío
    }
    
    //Getters y Setters
    
    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }

    
}
