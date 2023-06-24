
package practica15_validarcontraseñas_cadenas;

import java.util.Scanner;

/*
Desarrollar un programa que valide contraseñas. Una contraseña será valida cuando tenga entre
10 y 20 caracteres y contenga alguno de los 3 siguientes caracteres: 
*, -, _,

*/

public class Practica15_ValidarContraseñas_CADENAS {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la contraseña a validar");
        
        String pass = entrada.nextLine();
        
        if (pass.length() >= 10 && pass.length() <= 20){
           
            for (int i = 0; i < pass.length();  i++) {
                boolean valida = false;
                if (pass.charAt(i) == '*' || pass.charAt(i) == '-' || pass.charAt(i) == '_') {
                    valida = true;
                }
           
            
            if (valida) {
                System.out.println("La contraseña es valida");
                
            }else{
                System.out.println("La contraseña tiene que tener uno de los siguientes caracteres:  *, -, _ ");
            }
            } 
        }else{
            System.out.println("La longitud no es correcta");
        }
    }
    
}
