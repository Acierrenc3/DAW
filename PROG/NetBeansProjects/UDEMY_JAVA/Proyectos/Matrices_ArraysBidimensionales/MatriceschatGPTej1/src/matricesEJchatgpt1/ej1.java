
package matricesEJchatgpt1;
/*
    1.Crea una matriz de 3x3 llamada "matriz" y asigna valores enteros a cada uno de sus elementos.
    2.Crea un método llamado "imprimirMatriz" que reciba como parámetro una matriz y la imprima en consola.
    3.Crea un método llamado "sumaMatriz" que reciba como parámetro una matriz y devuelva la suma de todos sus elementos.
    4.Crea un método llamado "promedioMatriz" que reciba como parámetro una matriz y devuelva el promedio de todos sus elementos.
    5.Crea un método main y en él crea una matriz de 3x3, asigna valores a sus elementos, 
    llama al método "imprimirMatriz" para imprimir la matriz, llama al método "sumaMatriz" para obtener la suma de sus elementos 
    y al método "promedioMatriz" para obtener el promedio de sus elementos.
 */
public class ej1 {   
    public static void main(String[] args) {
    double[][] matriz = { //Punto 1
        {-3d, 8d, -2d}, 
        {17d, 22d, 76d}, 
        {-34d, -24d, -77d}        
                           }; 
            //Punto 5
        System.out.println("Las filas son: " + matriz.length);        
        System.out.println("Las columnas son: " + matriz[0].length); 
        System.out.println("====================================="); 
        System.out.println("La matriz es: ");
        imprimirMatriz(matriz);        
        System.out.println("=====================================");        
        System.out.println("La suma de los elementos de la matriz es: ");        
        System.out.println(sumaMatriz(matriz));         
        System.out.println("=====================================");        
        System.out.println("El promedio de la matriz es: ");
        System.out.println(promedioMatriz(matriz));      
    }
                
    public static void imprimirMatriz(double matriz[][]){ //Punto 2
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");                
            }
            System.out.println();           
        }
    }
    
    public static double sumaMatriz(double matriz[][]){ //Punto 3
        double suma = 0;
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];   
            }                                 
        }
            return suma;
}
    
    public static double promedioMatriz(double matriz[][]){ //Punto 4
        double sumatorio = 0;
          for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumatorio += matriz[i][j];                       
            }           
        }
          return sumatorio / (matriz.length * matriz[0].length);
    }   
}
