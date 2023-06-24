package io.github.jiangdequan;

public class ArraywithStringndFor {
    public static void main(String[] args) {
        String[][] nombres = { {"Pepe", "Pepa"}, {"Paco", "Josefa"}, {"Ayoze", "Paula"} }; 

System.out.println("===Iterando con For===");
        for(int i = 0; i < nombres.length; i++){
            for( int j = 0; j < nombres[i].length; j++){
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

    }
    
}