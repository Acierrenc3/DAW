
package prog04_ejerc4;
import java.util.Scanner;

public class PROG04_Ejerc4{
    public static void main(String[] args) {

        int NUM_INT_DEFAULT = 5;
        int NUM_MAX_DEFAULT = 10;
        
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;
        int numInt = NUM_INT_DEFAULT;
        int numMax = NUM_MAX_DEFAULT;


        while(!salir){

            System.out.println("1. Configurar");
            System.out.println("2. Jugar");
            System.out.println("3. Salir");
            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                System.out.println("Introduce el numero de intentos");
                numInt = entrada.nextInt();
                System.out.println("Introduce el maximo generador");
                numMax = entrada.nextInt();
                    break;

                case 2:

                int numOculto = (int)Math.floor(Math.random()*numMax+1);
                int intentosJugador =1;
                int numJugador = 0;
                boolean acertado = false;

                while(intentosJugador <= numInt && !acertado){
                    System.out.println("Introduce un numero");
                    numJugador = entrada.nextInt();

                    if(numJugador == numOculto){
                        System.out.println("Has ganado!. Has necesitado "+intentosJugador+" Intentos");
                    }else{
                        if(numJugador > numOculto){
                            System.out.println("El numero oculto es menor");
                        }
                        intentosJugador++;
                        System.out.println("Te quedan "+(numInt - intentosJugador)+" Intentos");
                    }
                }
                    break;
                
                case 3:
                salir = true;
                    break;

            }
        }
    }
}
