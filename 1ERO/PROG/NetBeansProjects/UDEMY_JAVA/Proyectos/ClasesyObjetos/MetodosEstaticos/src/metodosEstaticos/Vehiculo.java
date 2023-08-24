
package metodosEstaticos;

public class Vehiculo {
    static String colorPatente = "Naranja"; //Atributo estatico
    
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadTanque;

    public Vehiculo(String fabricante, String modelo) { //Constructor
        this.fabricante = fabricante;
        this.modelo = modelo;
    }                                       

    public Vehiculo() { //Constructor sin parámetros
    }
    
    public Vehiculo(String fabricante, String modelo, String color){
        this(fabricante, modelo);
        this.color = color;                                                     //Sobrecarga de Constructores
    }
    
    public Vehiculo(String fabricante, String modelo, String color, double cilindrada){
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }
        
    public Vehiculo(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque){
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }
    
    
    public String verDetalle(){
        return "vehiculo.fabricante = " + this.fabricante + 
                "\nvehiculo.modelo = " + this.modelo + 
                "\nvehiculo.color = " + this.color +
                "\nvehiculo.patenteColor = " + colorPatente +
                "\nvehiculo.cilindrada = " + this.cilindrada;
    }
    
    public String acelerar(int rpm){
        return "El auto " + fabricante + " acelerando a " + rpm + " rpm";
    }
    
    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }
    
    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }
    
    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(capacidadTanque*porcentajeBencina);
    }                                                               //Sobrecarga de Métodos (Distintos tipos de atributos)
    
    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(capacidadTanque*(porcentajeBencina/100f));
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public boolean equals(Object obj) {
        Vehiculo v = (Vehiculo)obj;
        return (this.fabricante != null && this.modelo != null && this.equals(v.getFabricante()) 
                && this.modelo.equals(v.modelo)); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
