
package com.mycompany.ejercicios_bucles1;

import javax.swing.JOptionPane;

/* Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo */

public class Ejercicios_Bucles1 {

    public static void main(String[] args) {
        int numero,cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
        
        while(numero >= 0){
            
        cuadrado = (int)Math.pow(numero,2);
        
        JOptionPane.showMessageDialog(null, "El numero "+numero+" elevado al cuadrado "+cuadrado);
    
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero "));
        }
    }
}
