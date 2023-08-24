
package Vehiculo;

public class Rueda {
    private String fabricante;
    private Integer aro;
    private Integer ancho;

    public Rueda(String fabricante, Integer aro, Integer ancho) {
        this.fabricante = fabricante;
        this.aro = aro;
        this.ancho = ancho;
    } 

    public String getFabricante() {
        return fabricante;
    }

    public Integer getAro() {
        return aro;
    }

    public Integer getAncho() {
        return ancho;
    }
    
    
    
}
