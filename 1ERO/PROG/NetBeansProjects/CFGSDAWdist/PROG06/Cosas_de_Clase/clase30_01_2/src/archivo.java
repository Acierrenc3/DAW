


import java.io.BufferedReader;
import java.io.*;
import java.util.Scanner;



public class archivo {
    public static void main(String[] args) throws IOException{
        Scanner entrada = new Scanner(System.in);
        final String POR_DEFECTO="prueba.txt";
        System.out.println("Digita el nombre del fichero: ");
        String nombreFichero = entrada.nextLine();
        if (nombreFichero.isEmpty()) {
            nombreFichero = POR_DEFECTO;
            
        }
        
        try {
            BufferedReader f = new BufferedReader(new FileReader(nombreFichero));
            int c = f.read();
            
            while (c != -1) {
                System.out.println((char) c);
                c = f.read();
                
            }
            f.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo abrir el fichero");
        }
        
        
    }
    
}
