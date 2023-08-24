package clase30_01;

import java.util.Scanner;

//crea una matriz que pregunte las dimensiones al usuario

public class claseMatrices2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("===Digita las filas de la Matriz===");
        int filas = entrada.nextInt();

        System.out.println("===Digita las columnas de la Matriz===");
        int columnas = entrada.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.println("El tamaño de la matriz es de: " +
        matriz[0].length + " columnas " + matriz.length + " filas ");

        for (int i = 0;  i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = numAleatorio(0, 9);
                System.out.println(matriz[i][j]+" ");              
            }
           System.out.println(""); 
            }
        } 

    public static int numAleatorio (int minimo, int maximo){
        return(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));

        }

    }     


