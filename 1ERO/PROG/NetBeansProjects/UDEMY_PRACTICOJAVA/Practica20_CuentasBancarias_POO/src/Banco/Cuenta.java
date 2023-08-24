
package Banco;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta() {
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public void ingresarCantidad(double ingresarCantidad){
        if (cantidad > 0) {
         ingresarCantidad = ingresarCantidad + cantidad;
        }
    }
    
    public void retirarCantidad(double retirarCantidad){
        retirarCantidad = cantidad - retirarCantidad;
        
        if ((retirarCantidad - cantidad) < 0 ) {
            cantidad = 0;
        }else{
            cantidad = cantidad - retirarCantidad;
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    
    
}