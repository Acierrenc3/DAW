
package practica18_temperaturasemanal_arrays;

import java.util.Scanner;


/*
Pedir al usuario la temperatura de los 7 dias de la semana y almacenarlas en un array. Mostrar la
temperatura media e indicar si se ha bajado de 0º algun dia.
*/
public class Practica18_TemperaturaSemanal_ARRAYS {
    public static void main(String[] args) {
        
        double[] temperatura = new double[7];
        
        for (int i = 0; i < temperatura.length; i++) {
            temperatura[i] = Math.floor(Math.random()*(30+1));
            System.out.println("Los grados segun el dia son: \nLunes: " + temperatura[0] 
                    + "\nMartes: " + temperatura[1] + "\nMiercoles: " + temperatura[2] 
            + "\nJueves: " + temperatura[3] + "\nViernes: "+ temperatura[4] 
                    + "\nSabado: " + temperatura[5] + "\nDomingo: " + temperatura[6]);
        }

        double suma = 0;
        boolean resultado = false;
        for (int i = 0; i < 7; i++) {
            suma = suma + temperatura[i];
            
                    
        if (temperatura[i] <= 0) {
            resultado = true;
        }
          
        }
          double media = suma/7;
          
          System.out.println("La temperatura media semanal es: " + media);
          System.out.println(resultado);
    }
    
}
