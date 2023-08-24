
package practica7_calificacionfinal_if;

import java.util.Scanner;
/*
EScribir un programa que lea una nota numerica y devuelva la calificacion a la que corresponde, sabiendo que:
0 <= nota < 3: Muy deficiente
3 <= nota < 5: Insuficiente
5 <= nota < 6: Suficiente
6 <= nota < 7: Bien
7 <= nota < 9: Notable
9  <= nota <= 10: Sobresaliente
*/
public class Practica7_CalificacionFinal_IF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la nota del examen");
        double nota = entrada.nextDouble();
        
        if (nota >= 0 && nota < 3) {
            System.out.println("MUY DEFICIENTE");
        }else if(nota >= 3 && nota < 5){
            System.out.println("INSUFICIENTE");
        }else if(nota >= 5 && nota < 6 ){
            System.out.println("SUFICIENTE");
        }else if(nota >= 6 && nota < 7){
            System.out.println("BIEN");
        }else if( nota >= 7 && nota < 9){
            System.out.println("NOTABLE");
        }else if(nota >= 9 && nota <= 10){
            System.out.println("SOBRESALIENTE");
        }
            
    }
    
}
