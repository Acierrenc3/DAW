
package atributosFinal;

public class Vehiculo {
   private static String colorPatente = "Naranja"; //Atributos estaticos
   private static int capacidadTanqueEstatico = 30;
   private static int ultimoId;
   
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadTanque;
    
    
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120; //Atributos Estaticos y no modificables
    public static final int VELOCIDAD_MAX_CIUDAD = 60;
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris";
    
    public Vehiculo(String fabricante, String modelo) { //Constructor
        this.fabricante = fabricante;
        this.modelo = modelo;
    }                                       
    
    public Vehiculo(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque, Integer VELOCIDAD_MAX_CARRETERA){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
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
