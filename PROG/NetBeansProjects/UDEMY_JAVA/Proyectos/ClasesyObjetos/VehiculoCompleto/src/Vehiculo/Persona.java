
package Vehiculo;

public class Persona {
    
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return (nombre  +  " " + apellidos + ", " + edad + " años");
    }
    
    
    
}
