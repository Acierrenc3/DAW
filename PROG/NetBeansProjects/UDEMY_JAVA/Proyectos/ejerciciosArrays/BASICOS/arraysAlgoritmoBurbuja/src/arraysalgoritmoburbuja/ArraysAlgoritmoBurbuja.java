
package arraysalgoritmoburbuja;

import java.util.Arrays;
import java.util.Collections;

public class ArraysAlgoritmoBurbuja {

    public static void sortBurbuja(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;
        
       for(int i = 0; i < total - 1; i++){
           
           for(int j = 0; j < total - 1 - i; i++){
               if( ( (Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0){
                   Object auxiliar = arreglo[j];
                   arreglo[j] = arreglo[j+1];
                   arreglo[j+1] = auxiliar;
                   
               }
               contador++;
           }
       }
       
        System.out.println("contador: "+contador );
    }
    
    public static void main(String[] args) {
                               
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
            "Disco duro SSD Samsung Externo", "Asus Notebook", "Macbook Air",
            "Chromecast de 4a Generacion", "Bicicleta Oxford"};
        
        int total = productos.length;
        
        sortBurbuja(productos);
        
        System.out.println("=== Usando for ===");
        for(int i = 0; i < total; i++){
        System.out.println("Para indice " + i + " : " + productos[i]);
        }
        
//--------------------------------------------------------------------------------------        
        
        Integer[] numeros = new Integer[4];                   
        
        numeros[0] = 17;
        numeros[1] = 35;
        numeros[2] = 84;
        numeros[3] = -34;  
        
       sortBurbuja(numeros); 
              
        for(int i = 0; i < numeros.length; i++){
         System.out.println("i = "+i+ " : "+numeros[i]);
            }
              
    }
} 


