
package prueba;

import java.util.Arrays;
import java.util.Collections;

public class Prueba {

    public static void main(String[] args) {
        String[][] prueba = new String[2][2];
        prueba[0][0] = "Tenerife";
        prueba[0][1] = "Santa Cruz";
        prueba[1][0] = "Gran Canaria";
        prueba[1][1] = "Las Palmas";

        String[] elementos = new String[4];
        int index = 0;
        for (int i = 0; i < prueba.length; i++) {
            for (int j = 0; j < prueba[i].length; j++) {
                elementos[index] = prueba[i][j];
                index++;
            }
        }
        
        Collections.shuffle(Arrays.asList(elementos));

        index = 0;
        for (int i = 0; i < prueba.length; i++) {
            for (int j = 0; j < prueba[i].length; j++) {
                prueba[i][j] = elementos[index];
                index++;
            }
        }

        for (int i = 0; i < prueba.length; i++) {
            for (int j = 0; j < prueba[i].length; j++) {
                System.out.print(prueba[i][j] + " ");
            }
            System.out.println();
        }
    }
}
