
import java.util.Scanner;

public class burbuja {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int arreglo[], nElementos, aux;
        
        System.out.println("Digita la cantidad de Elementos del Arreglo ");
        nElementos = entrada.nextInt();
        
        arreglo = new int[nElementos];
        
        for(int i=0; i<nElementos; i++){
            System.out.println((i+1)+".Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Método Burbuja
        for(int i=0; i<(nElementos-1); i++){
            for(int z=0; z<(nElementos-1); z++){
                if(arreglo[z] > arreglo[z+1]){  //Si numeroActual > numeroSiguiente
                        aux = arreglo[z];
                        arreglo[z] = arreglo[z+1];
                        arreglo[z+1] = aux;
            }
          }
        }
        System.out.println("\nArreglo ordenado en forma creciente: ");
        for(int i=0; i<nElementos; i++){
            System.out.println(arreglo[i]+" - ");
        }
        
        System.out.println("\nArreglo ordenado en forma decreciente: ");
        for (int i=(nElementos-1); i>=0; i--){
            System.out.println(arreglo[i]+" - ");
        }
    }

}
