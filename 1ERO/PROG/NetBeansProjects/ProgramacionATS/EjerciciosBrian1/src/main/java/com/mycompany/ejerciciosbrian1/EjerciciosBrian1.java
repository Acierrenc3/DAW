/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciosbrian1;

import java.util.Scanner;

/**
 *
 * @author ayoze
 */
public class EjerciciosBrian1 {

    public static void main(String[] args) {
        /* Crear un programa para representar y ejecutar por consola que permita calcular el volumen aproximado neto de una lata de refresco
        cilindrica. Escribe un proigrama que lea en el radio en centimetros y la longitud del modelo del cilindro en centimetros tambien
        */
        
        double area, radio, pi, volumen, longitud;
        
        Scanner entrada = new Scanner(System.in);
        
        /*Lata de 330ml tiene 6-62cm diametro y 12.2cm de altura*/
        /* El radio siempre será la mitad del diametro de un círculo, y la longitud siempre será 2pi * radio */
        
        radio = 3.31;
        pi = 3.14;
        area = radio * radio * pi;
        longitud = (2*pi) * radio;
        volumen = (radio*radio*pi) * (2 * pi * radio);
        
        System.out.println("La longitud de la Lata es de "+longitud+" cm");
        System.out.println("El área de la Lata es de "+area+" cm cuadrados");
        System.out.println("El volumen de la Lata es de "+volumen+" ml");
       
    }
}

/*La longitud de la Lata es de 20.7868 cm
El área de la Lata es de 34.402154 cm cuadrados
El volumen de la Lata es de 715.1106947672 ml */