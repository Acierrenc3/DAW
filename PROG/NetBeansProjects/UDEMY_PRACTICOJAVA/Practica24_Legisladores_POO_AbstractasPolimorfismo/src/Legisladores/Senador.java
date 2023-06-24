
package Legisladores;

public class Senador extends Legislador{
    
    

    public Senador() {
    }

    public Senador(String provincia, String partidoPolitico, float numeroDespacho, String nombre, String apellidos, int edad, boolean casado) {
        super(provincia, partidoPolitico, numeroDespacho, nombre, apellidos, edad, casado);
        
        
    }
    
    
    
    

    @Override
    public String getCamaraEnQueTrabaja() {
        String trabaja = "Trabaja en el Senado";
        return trabaja;
        
        
    }
    
    
    
}
