
package Juegos;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Random;

public class JuegoDados  implements IGames{
    private String jugador1;
    private String jugador2;
    private int dado1;
    private int dado2;

    @Override
    public void inicio() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Iniciando juego de Dados");
        System.out.println("Introduzca el nombre del jugador 1");
        jugador1 = entrada.nextLine();
        System.out.println("Introduzca el nombre del jugador 2");
        jugador2 = entrada.nextLine();
    }

    @Override
    public void desarrollo() {
        Random rand = new Random();
        dado1 = rand.nextInt(6) + 1;
        dado2 = rand.nextInt(6) + 1;
        
        System.out.println("El jugador 1: " + jugador1 + " ha sacado un: " + dado1 + ", y el jugador 2: " 
                + jugador2 + ", ha sacado un: " + dado2  );
    }

    @Override
    public void fin() {
        if (dado1 > dado2) {
            System.out.println("Enhorabuena, ha ganado: " + jugador1);
        }else if (dado1 < dado2){
            System.out.println("Enhorabuena, ha ganado: " + jugador2);
        }else{
            System.out.println("Habeis empatado!");
        }
    }
   
}
