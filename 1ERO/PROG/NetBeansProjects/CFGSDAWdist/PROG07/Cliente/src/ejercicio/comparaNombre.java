
package ejercicio;

import java.util.Comparator;

public class comparaNombre implements Comparator<Cliente> {

    @Override
    public int compare(Cliente c1, Cliente c2) {
        return ((Cliente) c1).getNombre().compareTo(((Cliente) c2).getNombre());         
                
    }
    
}
