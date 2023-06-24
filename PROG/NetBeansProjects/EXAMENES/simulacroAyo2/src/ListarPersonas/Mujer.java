
package ListarPersonas;


public class Mujer extends Persona{
    private String genero;

    public Mujer(String genero, String nombre, int edad) {
        super(nombre, edad);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
    
    
    
}
