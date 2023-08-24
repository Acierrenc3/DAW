/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicioscondicionales9;

import javax.swing.JOptionPane;

/**
 *
 * @author ayoze
 */
public class EjerciciosCondicionales9 {

    public static void main(String[] args) {
        int dia,mes,año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        
        if ((dia>=1) && (dia <=30)) {
            if((mes>=1) && (mes<=12)){
                if(año !=0){
                    JOptionPane.showMessageDialog(null,"Fecha correcta");
                   
                }
                    else{
                            JOptionPane.showMessageDialog(null,"Fecha Incorrecta, año incorrecto ");
                            }
                }
                 else{
                     JOptionPane.showMessageDialog(null, "Fecha Incorrecta, Mes Incorrecto");
                        }
       
            
        }
         else{
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, Día Incorrecto");
       
            }
    
        }

    }

