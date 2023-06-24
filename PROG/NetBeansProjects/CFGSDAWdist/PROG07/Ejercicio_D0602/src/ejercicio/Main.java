
package ejercicio;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Cliente tabla[] = new Cliente[5];
        
        tabla[0] = new Cliente("79064273W", "Juan Rodriguez", 47, 6899.00);
        tabla[1] = new Cliente("79064274A", "Ramiro de Maetzu", 22, 587.34);
        tabla[2] = new Cliente("7856342Z", "Lucia Ventura", 17, 87.02);
        tabla[3] = new Cliente("7856342W", "Pedro Perez", 72, 36899);
        tabla[4] = new Cliente("7856342SA", "Juan Martinez", 38, 2899);
        
        Arrays.sort(tabla);
        System.out.println("Ordenacion por DNI: " + Arrays.toString(tabla));
        
        
        Arrays.sort(tabla, new compEdades());
        System.out.println("Ordenacion por Edades: " + Arrays.toString(tabla));
    }
  
}
