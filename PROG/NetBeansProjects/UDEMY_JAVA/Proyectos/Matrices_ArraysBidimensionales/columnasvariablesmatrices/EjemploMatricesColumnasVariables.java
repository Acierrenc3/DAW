package io.github.jiangdequan;

import java.util.Random;

public class EjemploMatricesColumnasVariables {
        public static void main(String[] args) {
            
            int[][] matriz = new int[3][];

            matriz[0] = new int[12];
            matriz[1] = new int[3];
            matriz[2] = new int[6];

            System.out.println("Matriz tamaño: " + matriz.length);
            System.out.println("Fila 0 length: " + matriz[0].length);
            System.out.println("Fila 1 length: " + matriz[1].length);
            System.out.println("Fila 2 length: " + matriz[2].length);

            Random rand = new Random();

            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[i].length; j++){
                    matriz[i][j] = rand.nextInt(1000);
                }
            }

            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[i].length; j++){
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
        }
    
}