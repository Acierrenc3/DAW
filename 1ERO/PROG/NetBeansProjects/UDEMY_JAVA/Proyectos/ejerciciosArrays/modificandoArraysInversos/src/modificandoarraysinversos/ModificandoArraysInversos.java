
package modificandoarraysinversos;

import java.util.Arrays;
import java.util.Collections;

public class ModificandoArraysInversos {
    
    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for(int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo [i] = inverso;
            arreglo [total-1-i] = actual;
            total2--;
        }
    }    
    
    public static void main(String[] args) {
                                
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
            "Disco duro SSD Samsung Externo", "Asus Notebook", "Macbook Air",
            "Chromecast de 4a Generacion", "Bicicleta Oxford"};
        
        int total = productos.length;      
        
        Arrays.sort(productos);
        arregloInverso(productos);
        Collections.reverse(Arrays.asList(productos));
        //Collections.reverse(Arrays.asList(productos)); -->La de arriba es la Explicita, esta es 1 manera con una Libreria del JDK!
                
        for(int i=0; i < total; i++){
        System.out.println("Para indice " + i + " : " + productos[i]);
        }
        
    }
} 
