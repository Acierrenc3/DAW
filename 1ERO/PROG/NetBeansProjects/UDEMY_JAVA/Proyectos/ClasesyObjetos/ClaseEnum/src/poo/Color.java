
package poo;

public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    VERDE("Verde Claro"),
    BLANCO("Blanco Nieve"),
    GRIS("Gris Escarcha"),
    NEGRO("Negro"),
    NARANJA("Naranja");
    
    private final String color;

    private Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
                
}
