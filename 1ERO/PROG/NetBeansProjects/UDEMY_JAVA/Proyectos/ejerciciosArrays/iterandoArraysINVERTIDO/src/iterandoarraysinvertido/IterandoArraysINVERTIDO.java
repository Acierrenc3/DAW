
package iterandoarraysinvertido;

import java.util.Arrays;


public class IterandoArraysINVERTIDO {
    public static void main(String[] args) {
                
        //String[] productos = new String [7];
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
            "Disco duro SSD Samsung Externo", "Asus Notebook", "Macbook Air",
            "Chromecast de 4a Generacion", "Bicicleta Oxford"};
        
        int total = productos.length;      
    
        /*
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2]= "Disco duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast de 4a Generacion";
        productos[6] = "Bicicleta Oxford";
        */
        
        Arrays.sort(productos); 
        
        System.out.println("-----ITERANDO DE MANERA NORMAL-----");

        for(int i=0; i < total; i++){
        System.out.println("Para indice " + i + " : " + productos[i]);
        }
        
        System.out.println("-----ITERANDO DE MANERA INVERSA-----");
        
        for(int i=0; i < total; i++){ //Forma 1
            System.out.println("Para indice = " + (total-1-i) + " valor: " + productos[total-1-i]); //Restamos a productos 1 y el indice (i) para que cuando  vaya incrementandose,
        }                                                                                           // vaya aumentando la resta 
            
            System.out.println("---FORMA 2---");
            
        for(int i=total-1; i >= 0; i--){ //Forma 2
            System.out.println("Para indice = " + i + " valor: " + productos[i]);
        }  
        
    }
} 
