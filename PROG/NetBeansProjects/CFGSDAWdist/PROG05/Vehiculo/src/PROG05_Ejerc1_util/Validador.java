
package PROG05_Ejerc1_util;

import java.time.LocalDate;

public class Validador {
          public static boolean positivo(int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean fechaMasHoy(LocalDate fecha){
        
        LocalDate hoy = LocalDate.now();
        
        if(hoy.isBefore(fecha)){
            return true;
        }else{ 
            return false;
        }
        
    }
    
    public static boolean DNIvalido(String DNI){
        
        if(DNI.length() != 9){
            return false;
        }
        
        String DNInum = DNI.substring(0, DNI.length() - 1);
        char DNILetra = DNI.charAt(DNI.length() - 1);
        
        int numDNI;
        
        try {
            numDNI = Integer.parseInt(DNInum);
        } catch (NumberFormatException e) {
            return false;
        }
        
        if(!Character.isAlphabetic(DNILetra)){
            return false;
        }
        
        char letrasNIF[]={'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                  'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                  'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    
        int resto = numDNI % 23;
        
        char DNILetraNuevo = letrasNIF[resto];
        
        String DNINuevo = DNInum + DNILetraNuevo;
        
        if(DNI.equals(DNINuevo)){
            return true;
        }else{
            return false;
        } 
    }
}
