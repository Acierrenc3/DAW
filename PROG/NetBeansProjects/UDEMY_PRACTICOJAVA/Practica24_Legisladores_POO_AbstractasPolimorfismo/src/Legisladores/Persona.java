
package Legisladores;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;

    public Persona() {
        nombre = "";
        apellidos = "";
        casado = false;
    }

    public Persona(String nombre, String apellidos, int edad, boolean casado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.casado = casado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    @Override
    public String toString() {
        return ", Persona {" + "nombre= " + nombre + ", apellidos= " + apellidos + ", edad= " 
                + edad + ", casado= " + casado + '}';
    }
    
    
    
    
}
