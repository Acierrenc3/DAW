
package ddr_ejercicio8;

import java.util.Scanner;

/**
 *  Crear una aplicacion que nos permita insertar numeros hasta que insertemos un -1, Calcular la cantidad de numeros introducidos
 */
public class DDR_Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        int num=entrada.nextInt();
        int contador=0;
                           
        while(num!=-1){
            
            contador++;
            
            num=entrada.nextInt();
       }
        
        System.out.println("FIN, se han introducido "+contador+" numeros");
        
        
    }
    
}
