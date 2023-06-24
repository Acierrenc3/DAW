
package Instituto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Map<String,Integer> alumnos = new HashMap<String,Integer>();
        
        int opcion = -1;
        
        while (opcion != 2) {
            System.out.println("Introduce la opcion que deseas: ");
            System.out.println("1. Introducir asignatura y creditos");
            System.out.println("2. Salir del programa");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            if (opcion == 1) {
                System.out.println("Introduce el nombre de la asignatura");
                String asignatura = entrada.nextLine();
                
                System.out.println("Introduce los creditos de la asignatura");
                int creditos = entrada.nextInt();
                
                alumnos.put(asignatura, creditos);
            }
            
        }
        
        int totalCreditos = 0;
        for (String asig: alumnos.keySet()) {
            totalCreditos += alumnos.get(asig);
        }
        
        System.out.println("El numero de creditos que cursas es: " + totalCreditos);
        
    }
    
}
