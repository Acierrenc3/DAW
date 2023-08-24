
package ListarPersonas;

//Clase Mujer que hereda de Persona y agrega el atributo Genero


public class Mujer extends Persona {
    private String genero;

    public Mujer(String nombre, int edad) {
        super(nombre, edad);
        this.genero = "Mujer";
    }

    public String getGenero() {
        return genero;
    }
}
