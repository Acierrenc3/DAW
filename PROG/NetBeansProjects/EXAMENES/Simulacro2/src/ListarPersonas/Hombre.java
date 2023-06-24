
package ListarPersonas;

//Clase hombre que hereda de Persona y agrega el atributo Genero

public class Hombre extends Persona {
    private String genero;

    public Hombre(String nombre, int edad) {
        super(nombre, edad);
        this.genero = "Hombre";
    }

    public String getGenero() {
        return genero;
    }
}
