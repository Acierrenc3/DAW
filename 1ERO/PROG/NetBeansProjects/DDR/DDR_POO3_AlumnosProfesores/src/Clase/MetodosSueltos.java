
package Clase;


public class MetodosSueltos {
    
    /*
     *Genera un numero aleatorio entre dos numeros.
     *Entre el minimo y el maximo
     */
    
    public static int generaNumeroAleatorio(int minimo, int maximo){
        int num = (int)Math.floor(Math.random()*(minimo-(maximo+1)) + (maximo+1));
        return num;
        
    }
    
}
