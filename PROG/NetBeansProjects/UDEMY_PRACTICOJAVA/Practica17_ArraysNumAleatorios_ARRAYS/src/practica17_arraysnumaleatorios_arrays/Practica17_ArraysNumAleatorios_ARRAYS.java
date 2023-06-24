
package practica17_arraysnumaleatorios_arrays;
/*
Escribir un programa que cree e inicialice un array de 10 elementos enteros con valores aleatorios entre 1 y 10.
A continuacion debe imprimir el contenido del array y la suma de todos sus elementos
*/
public class Practica17_ArraysNumAleatorios_ARRAYS {
    public static void main(String[] args) {
        int[] aleatorios = new int[10];
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int) Math.floor(Math.random()*10+1);
        }
  
      int suma = 0;
      
        for (int i = 0; i < aleatorios.length; i++) {
            System.out.print(aleatorios[i] + " ");
            suma = suma + aleatorios[i];
        }
      
        System.out.println("\nLa suma de los elementos es: " + suma);
    }
    
}
