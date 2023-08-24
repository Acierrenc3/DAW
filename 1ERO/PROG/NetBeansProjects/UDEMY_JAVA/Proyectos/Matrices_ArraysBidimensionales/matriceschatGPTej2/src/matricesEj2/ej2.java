/*
1.Crea una matriz de 5x5 llamada "matriz" y asigna valores aleatorios a cada uno de sus elementos entre 0 y 100.
2.Crea un método llamado "imprimirMatriz" que reciba como parámetro una matriz y la imprima en consola.
3.Crea un método llamado "sumaFila" que reciba como parámetro una matriz y un número entero que represente una fila, y devuelva la suma de los elementos de esa fila.
4.Crea un método llamado "promedioColumna" que reciba como parámetro una matriz y un número entero que represente una columna, y devuelva el promedio de los elementos de esa columna.
5.Crea un método main y en él crea una matriz de 5x5, asigna valores aleatorios a sus elementos, 
llama al método "imprimirMatriz" para imprimir la matriz, llama al método "sumaFila" para obtener la suma de una fila específica y al método "promedioColumna" 
para obtener el promedio de una columna específica.
*/

package matricesEj2;

import java.util.Random;

public class ej2 {
    public static void main(String[] args) {
    Random rand = new Random();   
    int[][] numeros = new int[5][5];
    
    numeros[0][0] = rand.nextInt(100);  numeros[0][1] = rand.nextInt(100); numeros[0][2] = rand.nextInt(100); numeros[0][3] = rand.nextInt(100); numeros[0][4] = rand.nextInt(100);
    numeros[1][0] = rand.nextInt(100);  numeros[1][1] = rand.nextInt(100); numeros[1][2] = rand.nextInt(100); numeros[1][3] = rand.nextInt(100); numeros[1][4] = rand.nextInt(100);
    numeros[2][0] = rand.nextInt(100);  numeros[2][1] = rand.nextInt(100); numeros[2][2] = rand.nextInt(100); numeros[2][3] = rand.nextInt(100); numeros[2][4] = rand.nextInt(100);
    numeros[3][0] = rand.nextInt(100);  numeros[3][1] = rand.nextInt(100); numeros[3][2] = rand.nextInt(100); numeros[3][3] = rand.nextInt(100); numeros[3][4] = rand.nextInt(100); 
    numeros[4][0] = rand.nextInt(100);  numeros[4][1] = rand.nextInt(100); numeros[4][2] = rand.nextInt(100); numeros[4][3] = rand.nextInt(100); numeros[4][4] = rand.nextInt(100);
    
     for (int i = 0; i < numeros.length; i++) {
        for (int j = 0; j < numeros.length; j++) {
            numeros[i][j] = rand.nextInt(100);
             System.out.println(numeros[i][j]);   
            }
           
            
        }
        
    


    }
}
