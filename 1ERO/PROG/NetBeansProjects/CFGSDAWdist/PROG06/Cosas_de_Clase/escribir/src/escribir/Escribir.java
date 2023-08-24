
package escribir;

import java.util.Scanner;
import java.io.*;

public class Escribir  {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita tu nombre");
        String nombre = entrada.nextLine();
        System.out.println("Digita tu edad");
        int edad = entrada.nextInt();
        
        
        try {
            BufferedWriter f = new BufferedWriter(new FileWriter("datos.txt"));
            f.write("Nombre: " + nombre);
            f.newLine();
            f.write("Edad: " + edad);
            f.close();
        } catch (EOFException eof){
            System.out.println("Fichero no se pudo abrir");
        }
    }
    
}
