
package Vehiculo;

public class Color {
    private String tonoColor;
    private TipoColor color;

    public Color(String tonoColor, TipoColor color) {
        this.tonoColor = tonoColor;
        this.color = color;
    }

    public String getTonoColor() {
        return tonoColor;
    }

    public TipoColor getColor() {
        return color;
    }

    public void setTonoColor(String tonoColor) {
        this.tonoColor = tonoColor;
    }

    public void setColor(TipoColor color) {
        this.color = color;
    }
    
    
    
    
}
