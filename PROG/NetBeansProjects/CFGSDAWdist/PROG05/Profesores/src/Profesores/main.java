
package Profesores;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

      Profesor p1,p2;
      
      p1 = new Profesor("Ayoze", "Pestano", 29, false,  true); //Definimos Parámetros primer objeto como el primer Constructor
      p2 = new Profesor(); //El Segundo objeto lo dejamos vacío como el 2do Constructor
      
      //Preguntamos al usuario por Consola sobre los datos del segundo profesor
      
      Scanner entrada= new Scanner (System.in);
        System.out.println("Dinos el nombre del Profesor: ");
        p2.nombre = entrada.nextLine();
        
        System.out.println("Dinos su Apellido: ");
        p2.apellidos  = entrada.nextLine();
        
        System.out.println("Que edad tiene? ");
        p2.edad = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Esta casado?");
        p2.casado = entrada.nextBoolean();
        entrada.nextLine();
        
        System.out.println("Se Especializa en alguna rama?");
        p2.especialista = entrada.nextBoolean();
                  
      //Mostramos los datos
      
      p1.mostrarDatos();
      System.out.println("--------------");
      p2.mostrarDatos();
        
    }
    
}

/*  1º       //say your boolean variable is called gotIt
            if(gotIt == true) //you can also just say if(gotIt) here
                {
                    //here you place the string where it needs to be, either output it or place it into a variable
                     System.out.println("Yes");
                }            
             else
                {
                    //same as above but for false
                    System.out.println("No");
                } 

        }


2º

boolean myBoolean = true;
String result = myBoolean ? "yes" : "no";

*/
