
package TiendaEnLinea;

public class Cliente {
    private String nombre;
    private char genero;
    private int edad;
    
    public Cliente(String nombre, char genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
          
    
}
