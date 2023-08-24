
package Vehiculo;

public enum TipoColor {
    ROJO("Rojo", "Rojo Manzana"),
    AMARILLO("Amarillo","Amarillo Girasol"),
    AZUL("Azul","Azul Cielo"),
    VERDE("Verde","Verde Claro"),
    BLANCO("Blanco","Blanco Nieve"),
    GRIS("Gris","Gris Escarcha"),
    NEGRO("Negro","Negro Petróleo"),
    NARANJA("Naranja","Naranja Mate");
    
    private final String color;
    private final String tipoColor;
     
    private TipoColor(String color, String tipoColor) {
        this.color = color;
        this.tipoColor = tipoColor;
    }

    public String getColor() {
        return color;
    }

    public String getTipoColor() {
        return tipoColor;
    }    
}
