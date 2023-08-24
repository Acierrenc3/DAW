
package cadenas1;

import java.util.Scanner;

public class Cadenas1 {

    public static void main(String[] args) {
        
        //Definir cadenas        
        String cadena1 = "Esto es una cadena";
        
        String cadena2 = new String("Otra cadena");       
        //Concatenar cadenas
        
        String cadena3 = cadena1+" "+cadena2;
        
        System.out.println(cadena3);
        
        System.out.println(cadena1.length());
        
        //Comparar cadenas
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Introduce la primera cadena");
        String s1 = entrada.nextLine();
        
        System.out.println("Introduce la segunda cadena");
        String s2 = entrada.nextLine();
        
        if (s1.equals(s2)) { //El metodo equals sirve para comparar cadenas
            System.out.println("Iguales");
            
        }else{
            System.out.println("Distintos");
        }
        
        //Extraer Caracteres
        
        char c = cadena1.charAt(2);
        System.out.println(c);
        
        //Comparar cadenas (Cual es mayor)
        
       if (cadena1.compareTo(cadena2)< 0){
           System.out.println("Cadena 1 es menor");
       } else if (cadena1.compareTo(cadena2) > 0){
           System.out.println("cadena 2 es menor");
       }else{
           System.out.println("Son iguales");
       }
       
       //Buscar en una cadena
       
        System.out.println(cadena1.indexOf("s"));
        
        //Conversion a mayusculas y minusculas
        
        System.out.println(cadena1.toUpperCase());
        System.out.println(cadena2.toLowerCase() );
       
        String miCadena = new String("Java");
        for (int i = 0; i < miCadena.length(); i++) {
            System.out.print(miCadena.charAt(i));
        }
        
    }
    
}
