
package arrays2;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
            
 //Arrays String y ordenados con SORT
        
        String[] productos = new String [7];
        
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2]= "Disco duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast de 4a Generacion";
        productos[6] = "Bicicleta Oxford";
        
        Arrays.sort(productos); //Es el metodo helper de Arrays con sort que ordena Numerica o Alfabeticamente
        
        String p1 = productos[0];
        String p2 = productos[1];
        String p3 = productos[2];
        String p4 = productos[3];
        String p5 = productos[4];
        String p6 = productos[5];
        String p7 = productos[6];
        
        System.out.println("productos [0] " + p1);
        System.out.println("productos [1] " + p2);
        System.out.println("productos [2] " + p3);
        System.out.println("productos [3] " + p4);
        System.out.println("productos [4] " + p5);
        System.out.println("productos [5] " + p6);
        System.out.println("productos [6] " + p7);
        
        System.out.println("---------------------------");  
        
        int[] numeros = new int[4];
        
        numeros[0] = 17;
        numeros[1] = 35;
        numeros[2] = 84;
        numeros[3] = -34;
        
        Arrays.sort(numeros);
        
        int i =  numeros[0];
        int j =  numeros[1];
        int k =  numeros[2];
        int l =  numeros[3];
        
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}    

    
    

