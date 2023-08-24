

package prog02_ejerc6;
    /*Crea un programa que cree un tipo enumerado para las siguientez razas de perro:Mastín, Terrier,Bulldog, Pekines, Caniche y Galgo. El Programa
    debe realizar las siguientes operaciones:
    
Crea una variable denominada var1 del tipo enumerador. Asignale un valor
Crea una variable denominada var2 del tipo enumerador. Asígnale un valor
Muestra por pantalla el valor obtenido de comparar ambas variables.

Investiga sobre la posibilidad de averiguar la posicion que ocupa un determinado valor en el enumerado asi como mostrar la cantidad de valores
que contiene. si lo consigues, muestra la posicion de las dos variables en el tipo enumerado. */

public class PROG02_Ejerc6{
public enum R{MASTIN,TERRIER,BULLDOG,PEKINES,CANICHE,GALGO}
    

    public static void main(String[] args) {
        R var1 = R.BULLDOG; //Punto 1 y 2
        R var2 = R.TERRIER;
        System.out.println("La variable tiene el valor: "+var1);
         System.out.println("La variable tiene el valor: "+var2);
         System.out.println(R.BULLDOG.compareTo(var2)); //Punto 3
         
         
         
    
    
   
            
    }    
}

    


