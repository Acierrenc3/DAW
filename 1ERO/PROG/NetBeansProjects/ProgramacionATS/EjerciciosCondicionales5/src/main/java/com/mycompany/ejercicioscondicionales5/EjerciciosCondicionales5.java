/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicioscondicionales5;

import javax.swing.JOptionPane;

/**
 *
 * @author ayoze
 */
public class EjerciciosCondicionales5 {

    public static void main(String[] args) {
        int horasTrabajadas;
        float salarioTotal;
    
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite el total de horas trabajadas "));
        
        if(horasTrabajadas <= 40 ){
            salarioTotal = horasTrabajadas *  16;
        }
        else{
            salarioTotal = (40*16) + ((horasTrabajadas-40)*20);
        }
        
       JOptionPane.showMessageDialog(null, "El salario Total es: "+salarioTotal);
    }
}
