

package pruebaarrays3ejerc1;
/* Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden introducido */
import java.util.Scanner;
public class PruebaArrays3Ejerc1 {

   
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
      int[] numeros = new int[5];
      
        System.out.println("Guardando los datos en el Arreglo");
        
      for(int i=0;i<5;i--){
          System.out.print( (i+1) + ". Digita los numeros dentro del Array " );
          numeros[i] = entrada.nextInt();
                                     
      }
            System.out.println("\nLos Numeros son: ");
           for(int i:numeros){ //Bucle  for each
               System.out.println(i);
           }
        
    }

}
