
package com.mycompany.arrays1;

/** Un array es una estructura de datos que nos permite almacenar un conjunto de datos de un mismo tipo. 
 * El tamaño de los arrays se declara en un primer momento y no se puede cambiar luego durante la ejecución del programa */

// Array Unidimensionales: Tipo de variable[] Nombre del Array = new Tipo de Variable[dimension];

//Dar valores a un Array: int[] numeros = new int[3]; (se comienza siempre desde el 0) numeros[0] = 5; así el índice 0 tendría el valor 5. numeros[1] = 7; numeros[2] = 9;
// Un caso más rápido sería: int[] numeros = {5,7,9};

public class Arrays1 {

    public static void main(String[] args) {
    int[] numeros = {5,7,9,10};
    
    for(int i=0; i<4; i++){
        System.out.println(numeros[i]);
    }
        
        
    }
}


