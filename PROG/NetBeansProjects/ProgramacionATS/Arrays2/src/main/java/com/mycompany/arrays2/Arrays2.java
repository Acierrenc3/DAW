/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arrays2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**  */

public class Arrays2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      int nElementos;
      
      nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la Cantidad de elementos del Array:  "));
      
      char[] letras = new char[nElementos];
      
        System.out.println("Digite los Elementos del Arreglo: ");
        
        for(int i=0; i<nElementos; i++){
            
            System.out.println((i+1)+"Digite un Caracter ");
            letras[i] = entrada.next().charAt(0);
        }
       
            System.out.println("\nLos caracteres del Array son: ");
            for(int i=0; i<nElementos; i++){
                System.out.print(letras[i]+" ");
         
            }
        
        
        
        
        
        
    }
}
