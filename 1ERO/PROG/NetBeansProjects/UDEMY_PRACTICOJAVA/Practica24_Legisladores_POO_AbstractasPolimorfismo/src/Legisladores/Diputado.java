
package Legisladores;

public class Diputado extends Legislador{

    public Diputado() {
    }

    public Diputado(String provincia, String partidoPolitico, float numeroDespacho, String nombre, String apellidos, int edad, boolean casado) {
        super(provincia, partidoPolitico, numeroDespacho, nombre, apellidos, edad, casado);
    }
    
    

    

    @Override
    public String getCamaraEnQueTrabaja() {
        String trabaja = "Trabaja en el Congreso";
        return trabaja;
    }
    
}
