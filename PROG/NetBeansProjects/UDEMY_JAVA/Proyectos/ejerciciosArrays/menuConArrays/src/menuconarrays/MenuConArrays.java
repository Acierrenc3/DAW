/*
Realizar 1 menú con Arrays en donde liste 3 edades, las muestre y salga del programa.
Todo esto se le preguntará a un  usuario por consola.
*/
package menuconarrays;

import java.util.Scanner;

public class MenuConArrays {
    
    static int edades[] = new int[3];
    
    public static void main(String[] args) {
      MenuOpciones();
    }
    
    public static void MenuOpciones(){
    Scanner entrada = new Scanner(System.in);
        int op = 0;
        
        for(;;){
            System.out.println("\nMenu de Opciones\n" + "============\n"
            + "Ingresar Edades[1]\n" + "Listar Edades[2]\n" + "Salir del Programa[3]");
            System.out.println("Ingrese una de las 3 opciones");
            op = entrada.nextInt();
            System.out.println("\n");
            
            switch(op){
                case 1:{IngresarEdades();break;}
                case 2:{ListarEdades();break;}
                case 3:{System.exit(0);break;}
                
            }
        }
}    
    public static void IngresarEdades(){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Ingrese la edad["+(i+1)+"]=");
            edades[i] = entrada.nextInt();
        }
    }
    
    public static void ListarEdades(){
        for (int i = 0; i < edades.length; i++) {
            System.out.println(" "+ edades[i]);
        }
    }
    
}
