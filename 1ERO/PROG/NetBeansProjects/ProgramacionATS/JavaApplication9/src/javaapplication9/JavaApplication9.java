

package javaapplication9;


public class JavaApplication9 {

//Explicacion Arrays en ProgramacionATS
 /* Un Array es una estructura de datos que nos permite almacenar un conjunto de datos del mismo tipo
    El tamañode los Arrays se declara al principioyno puede camviar luegodurante la ejecución del programa */
    
    public static void main(String[] args) {
        
        int[] Edad={5,7,9,11,13,15,17,19,21,23,25};
        
        //Al Imprimir el valor 7 se imprime 19 en vez de 17 ya que siempre se empieza desde el 0, es decir 0 = 5
        
        //   System.out.println(Edad[7]);        
            
        for(int i=0;i<11;i++){
            System.out.println(Edad[i]);
        }    
        
    
    }

}
