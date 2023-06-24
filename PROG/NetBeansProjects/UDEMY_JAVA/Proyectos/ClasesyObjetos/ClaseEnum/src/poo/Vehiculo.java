
package poo;

public class Vehiculo {
   private static Color colorPatente; //Atributos estaticos
   private static int capacidadTanqueEstatico = 30;
   private static int ultimoId;
   
    private String fabricante;
    private String modelo;
    private Color color = Color.ROJO;
    private double cilindrada;
    private int capacidadTanque;
    
    
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120; //Atributos Estaticos y no modificables
    public static final int VELOCIDAD_MAX_CIUDAD = 60;
    
    public Vehiculo(String fabricante, String modelo) { //Constructor
        this.fabricante = fabricante;
        this.modelo = modelo;
    }                                       
    
    public Vehiculo(String fabricante, String modelo, Color color, double cilindrada, int capacidadTanque, Integer VELOCIDAD_MAX_CARRETERA){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadTanque = capacidadTanque;                       
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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
    public String toString() {
        return "Vehiculo{" + "fabricante=" + fabricante 
                + ", modelo=" + modelo + ", color=" + color
                + ", cilindrada=" + cilindrada 
                + ", capacidadTanque=" + capacidadTanque + ", Velocidad Maxima= " 
                + VELOCIDAD_MAX_CARRETERA + '}';
    }    
}
