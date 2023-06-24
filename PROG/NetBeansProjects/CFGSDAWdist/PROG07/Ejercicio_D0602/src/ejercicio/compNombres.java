
package ejercicio;

import java.util.Comparator;

public class compNombres implements Comparator{
   @Override
 public int compare (Object o1, Object o2){
     return ((Cliente) o1).getNombre().compareTo(((Cliente) o2).getNombre());
 }  
}
