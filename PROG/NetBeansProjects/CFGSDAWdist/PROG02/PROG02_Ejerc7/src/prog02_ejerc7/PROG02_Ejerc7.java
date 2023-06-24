

package prog02_ejerc7;
import java.util.Scanner;
/*Diseñar programa para resolver ecuacion de primer grado con una incognita X suponiento
que los coeficientes de la ecuacion son C1 y C2 se inicializan en el metodo main*/

public class PROG02_Ejerc7 {
 
    public static void main(String[] args) {
    
        float x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita dos numeros ");
        
        float C1 = sc.nextFloat();
        float C2 = sc.nextFloat();
        
        x = (-C2)/C1;
        
        System.out.println("El resultado de la incognita es: "+(x-x%0.0001));
        
        
    }

}
