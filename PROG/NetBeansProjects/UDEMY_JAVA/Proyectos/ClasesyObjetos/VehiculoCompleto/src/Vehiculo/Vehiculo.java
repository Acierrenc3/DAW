
package Vehiculo;

public class Vehiculo {    
private int id;
private String fabricante;
private String modelo;
private TipoColor color;
private Motor motor;
private Deposito deposito;
private Persona propietario;
private Rueda[] ruedas;
private TipoVehiculo tipo;

public Vehiculo() {
    
}

public Vehiculo(String fabricante, String modelo, TipoColor color, Motor motor){
    this.fabricante = fabricante;
    this.modelo = modelo;
    this.color = color;
    this.motor = motor;
}
public Vehiculo(String fabricante, String modelo, TipoColor color, Motor motor, Deposito deposito){
    this(fabricante, modelo, color, motor);
    this.deposito = deposito;
} 

public Vehiculo(String fabricante, String modelo, TipoColor color, Motor motor, Deposito deposito, Persona propietario, Rueda[] ruedas) {
    this(fabricante, modelo, color, motor,deposito);
    this.propietario = propietario;
    this.ruedas = ruedas;
}

    public int getId() {
        return id;
}

    public void setId(int id) {
        this.id = id;
}

    public String getFabricante() {
        return fabricante;
}

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
}

    public String getModelo() {
        return modelo;
}

    public void setModelo(String modelo) {
        this.modelo = modelo;
}

    public TipoColor getColor() {
        return color;
}

    public void setColor(TipoColor color) {
        this.color = color;
}

    public Motor getMotor() {
        return motor;
}

    public void setMotor(Motor motor) {
        this.motor = motor;
}

    public Deposito getDeposito() {
        return deposito;
}

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
}

    public Persona getPropietario() {
        return propietario;
}

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
}

    public Rueda[] getRuedas() {
        return ruedas;
}

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
}

    public TipoVehiculo getTipo() {
        return tipo;
}

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
}
        
    public String verDetalle(){
        return "vehiculo. id = " + this.id +
                "\nvehiculo.fabricante = " + this.getFabricante() +
                "\nvehiculo.modelo = " + this.getModelo() +
                "\nvehiculo.tipo = " + this.getTipo().getDescripcion() +
                "\nvehiculo.color = " + this.color +
                "\nvehiculo.cilindrada = " + this.motor.getCilindrada();
}
    

    
    
    
}
