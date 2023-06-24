
package ejercicio;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cliente[] tabla = new Cliente[5];
        
        tabla[0] = new Cliente("Juanito", "44444444W", 27, 458.58);
        tabla[1] = new Cliente("Pepita", "555555555S", 69, 13458.78);
        tabla[2] = new Cliente("Azucena", "666666666A", 18, 58.47);
        tabla[3] = new Cliente("Paco", "111111111K", 39, 8745.03);
        tabla[4] = new Cliente("Pedro", "222222222X", 53, 3456.80);    
        
       Arrays.sort(tabla);
        System.out.println("DNI: " + Arrays.toString(tabla));
        
        Arrays.sort(tabla, new comparaNombre());
        System.out.println("Nombre: " + Arrays.toString(tabla));
        
        Arrays.sort(tabla, new comparaEdad());
        System.out.println("Edad: " + Arrays.toString(tabla));
    }
  
}
