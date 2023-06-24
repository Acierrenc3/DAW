package ejercicio;

import java.util.Comparator;

public class compEdades implements Comparator {
    
 @Override
 public int compare (Object o1, Object o2){
     return (((Cliente) o1).getEdad() - ((Cliente) o2).getEdad());
 }
}
