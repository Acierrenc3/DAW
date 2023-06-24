
package ejercicio;

import java.util.Comparator;

public class comparaEdad implements Comparator<Cliente> {

    @Override
    public int compare(Cliente c1, Cliente c2) {
        return (((Cliente) c1).getEdad() - ((Cliente) c2).getEdad());
    }

    



       
}
