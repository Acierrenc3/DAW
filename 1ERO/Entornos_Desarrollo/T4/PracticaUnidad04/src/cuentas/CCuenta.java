
package cuentas;

/**
 *
 * @author acie
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    public double estado() {
        return saldo;
    }

    
    //Añadimos el método operativa_cuenta tal y como nos piden en el punto 3 de la práctica
    //Añadimos el parámetro "cantidad" de tipo float
    
public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
    double saldoActual;
    try {
        System.out.println("Ingreso en cuenta");
        cuenta.ingresar(cantidad);
    } catch (Exception e) {
        System.out.print("Fallo al ingresar");
    }
    saldoActual = cuenta.estado();
    System.out.println("El saldo actual es: " + saldoActual);
    try {
        System.out.println("Retirada de efectivo");
        cuenta.retirar(cantidad);
    } catch (Exception e) {
        System.out.print("Fallo al retirar");
    }
    saldoActual = cuenta.estado();
    System.out.println("El saldo actual es: " + saldoActual);
}




}
