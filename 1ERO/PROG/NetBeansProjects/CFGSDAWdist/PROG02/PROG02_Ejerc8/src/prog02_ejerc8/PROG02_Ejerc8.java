

package prog02_ejerc8;

import java.util.Scanner;
/* Diseña un programa Java denominado PROG02_Ejerc8 que dados el número de alumnos matriculados en Programación, 
número de alumnos matriculados  en Entornos de Desarrollo y número de alumnos matriculados en Base de datos. 
El programa deberá mostrar el % de alumnos matriculado 
en cada uno de los tres módulos. Se supone que un alumno sólo puede estar matrículado en un módulo. 
Trata de mostrar un solo decimal en los porcentajes. */

public class PROG02_Ejerc8 {

   
    public static void main(String[] args) {
        int alumnProg, alumnED, alumnBS;
        Scanner sc = new Scanner(System.in);
        
                      
        System.out.println("Introduce el numero de alumnos que hay en PROGRAMACION ");       
        alumnProg = sc.nextInt();
        
        System.out.println("Introduce el numero de alumnos que hay en BASE DE DATOS");
        alumnBS = sc.nextInt();
           
        System.out.println("Introduce el numero de alumnos que hay en ENTORNOS DE DESARROLLO");
        alumnED = sc.nextInt();
        
        int total = alumnProg + alumnED + alumnBS;
        
        double porcentaje1 = (double) (alumnProg*100) / total;
        double porcentaje2 = (double) (alumnBS*100) / total;
        double porcentaje3 = (double) (alumnED*100) / total;
        
        
        System.out.println("El porcentaje de Alumnos matriculados en PROGRAMACION es: "+(porcentaje1-porcentaje1%0.1)+"\nEl numero de Alumnos matriculados en BASE DE DATOS es: "
        +(porcentaje2-porcentaje2%0.1)+"\nEl numero de Alumnos matriculados en ENTORNOS DE DESARROLLO es: "+(porcentaje3-porcentaje3%0.1));
        
       
        
        
        
       
        
        
    }

}
