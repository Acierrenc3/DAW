
package ListarPersonas;

public class Hombre extends Persona {
    private String genero;

    public Hombre(String genero, String nombre, int edad) {
        super(nombre, edad);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
    
    
    
}
