
package dosEnUnoElemMayor;

import java.util.Scanner;

public class dosEnUno {
    public static void main(String[] args) {
                int[] a = new int[5];
                Scanner entrada = new Scanner(System.in);

                System.out.println("--Ingresa 5 numeros enteros--");
                for(int i = 0; i<a.length;  i++){
                    a[i] = entrada.nextInt();
                }
                
                int max =0;
                for(int i = 1; i < a.length; i++){
                    max = (a[max] > a[i])? max:i;
                }
                System.out.println("El maximo es: " + a[max]);

    }
    
}
