
package paquete1;


public class Persona {
    private final String nombre; //Final se usa para crear constantes, y al  serlo, no puedes dejar que cambien en el tiempo.
   private int edad; 

    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre+"\nLa edad es: "+edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
   
   
}
