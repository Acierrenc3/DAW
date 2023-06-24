
package iterandoarrays;

import java.util.Arrays;

public class IterandoArrays {
    public static void main(String[] args) {
      //Arrays String y ordenados con SORT
        
        String[] productos = new String [7];
        int total = productos.length;      
        
        System.out.println("-----Iterando PRODUCTOS-----");
        
        
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2]= "Disco duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast de 4a Generacion";
        productos[6] = "Bicicleta Oxford";
        
        Arrays.sort(productos); //Siempre hay que ordenar antes de iterar elementos!
        
        System.out.println("-----Usando for------"); //for
        
        for(int i=0; i < total; i++){
          System.out.println("Para indice " + i + " : " + productos[i]);
        }
        
        System.out.println("-------Usando foreach-------"); //foreach
        
        for(String prod: productos){ 
            System.out.println("prod = "+prod);
        }
        
        System.out.println("-------Usando while-------"); //While
            int i = 0;
            while(i < total){
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }
            
        System.out.println("-------Usando do while-------"); //Do While
        int j = 0;
        do{
        System.out.println("Para indice " + j + " : " + productos[j]);
        j++;
        }while(j < total);      
        
 //---------------------------------------------------------------------
    System.out.println("-------iterando NUMEROS-------");
    
        int[] numeros = new int[10];
        int totalNum = numeros.length;
        
        for(int z = 0; z < totalNum; z++){
            numeros[z] = z*3;
            System.out.println("numeros = "+numeros[z]);
                
        }
        
    }
} 
    
    

