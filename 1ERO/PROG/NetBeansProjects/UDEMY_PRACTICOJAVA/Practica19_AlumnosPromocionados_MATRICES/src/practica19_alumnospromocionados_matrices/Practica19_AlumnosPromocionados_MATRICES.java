
package practica19_alumnospromocionados_matrices;
/*
La informacion academica de los alumnos de una determinada asignatura se encuentra almacenada en
una matriz. Cada fila de la matriz guarda las notas del alumno. La primera posicion indica el nombre del
alumno,  las dos siguienes la nota de los examenes de teoria y el siguiente la nota del practico.

La nota final se calcula de la siguiente forma: NF = 40% Teoria + 60% Practica.

-Realiza un programa en el que definas una matriz como la anterior y muestre para cada alumno si
ha aprobado o suspendido dicha asignatura.
*/

public class Practica19_AlumnosPromocionados_MATRICES {
    public static void main(String[] args) {
        
        String[][] matriz = {{"Pepe", "6.5", "7.5", "8"},
                                          {"Ana", "5", "7.5", "7"},
                                          {"Juan", "2.4", "4.9", "5"}};
        
        boolean[] resultados = new boolean[matriz.length];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                double notaTeoria = (Double.parseDouble(matriz[i][1]) + Double.parseDouble(matriz[i][2]))/2;
                double notaFinal = (notaTeoria * 0.4) + Double.parseDouble(matriz[i][3]) * 0.6;
                if (notaFinal >= 5) {
                    resultados[i] = true;
                }else{
                    resultados[i] = false;
                }
                
            }
   
        }
        
        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i]) {
                System.out.println("El alumno: " + matriz[i][0] + ", Ha aprobado");
            }else{
                System.out.println("El alumno: " + matriz[i][0] + ", No ha aprobado");

            }
        }
        
        }
    }
    

