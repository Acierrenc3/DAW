package math4randomjavautil;

import java.util.Random;

public class math4 {
    public static void main(String[] args) {
        String[] colores = {"azul", "rojo", "rosado", "violeta",  "verde", "marron", "amarillo"};  
        
        Random randomObj = new Random();

        int randomInt = randomObj.nextInt();

        System.out.println("RandomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("colores = " + colores[randomInt]);
    }
    
}