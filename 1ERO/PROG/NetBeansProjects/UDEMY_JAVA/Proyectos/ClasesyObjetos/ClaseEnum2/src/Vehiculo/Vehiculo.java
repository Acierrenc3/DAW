
package Vehiculo;

public class Vehiculo {
    
   private static TipoColor colorPatente; //Atributos estaticos
   private static int capacidadTanqueEstatico = 30;
   private static int ultimoId;
   
    private String fabricante;
    private String modelo;
    private TipoColor color = TipoColor.ROJO;
    private double cilindrada;
    private int capacidadTanque;
    
    private TipoVehiculo tipo; //Atributo de clase TipoVehiculo.java
    
    
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120; //Atributos Estaticos y no modificables
    public static final int VELOCIDAD_MAX_CIUDAD = 60;
    
    public Vehiculo(String fabricante, String modelo) { //Constructor
        this.fabricante = fabricante;
        this.modelo = modelo;
    }                                       
    
    public Vehiculo(String fabricante, String modelo, double cilindrada, int capacidadTanque, Integer VELOCIDAD_MAX_CARRETERA){
        this(fabricante, modelo);
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadTanque = capacidadTanque;                       
    }

    public static TipoColor getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(TipoColor colorPatente) {
        Vehiculo.colorPatente = colorPatente;
    }

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Vehiculo.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        Vehiculo.ultimoId = ultimoId;
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

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }
    
    
    
    

    @Override
    public String toString() {
        return "====Vehiculo====" + "\nfabricante=" + fabricante 
                + ",\nmodelo=" + modelo 
                + ",\ncolor=" + this.getColor().getTipoColor()
                + ",\ncilindrada=" + cilindrada 
                + ",\ncapacidadTanque=" + capacidadTanque 
                + ",\nVelocidad Maxima= " + VELOCIDAD_MAX_CARRETERA 
                + ",\ntipo= " + this.getTipo().getNombre()
                + ",\ndescripcion= " + this.getTipo().getDescripcion();
    }     
}
