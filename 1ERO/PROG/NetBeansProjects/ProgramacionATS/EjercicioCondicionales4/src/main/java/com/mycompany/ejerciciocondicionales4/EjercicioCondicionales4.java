/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciocondicionales4;

import javax.swing.JOptionPane;

/**
 *
 * @author ayoze
 */
public class EjercicioCondicionales4 {

    public static void main(String[] args) {
        /*En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los $300. ¿Cuál será
        la cantidad que pagará una persona por su compra? 
        */
        
         float compra,descuento,total;
        compra= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto total de la compra: "));
        
        if(compra>300){
            descuento=(float)(compra*0.20);
            total=compra-descuento;
            JOptionPane.showMessageDialog(null,"Su descuento aplicado es de -$"+descuento+" y su total a pagar es de: $"+total);  
        }
        else {
            JOptionPane.showMessageDialog(null,"No aplica Descuento");
        }
    }
    
}
    

