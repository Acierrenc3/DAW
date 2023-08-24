
package Juegos;

import java.util.Random;
import java.util.Scanner;

public class Adivina implements IGames{
    private int numero;
    private String jugador;

    @Override
    public void inicio() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido/a al juego de Adivinar!!");
        System.out.println("Dinos tu nombre: ");
        jugador = entrada.nextLine();
        
    }

    @Override
    public void desarrollo() {
        Random rand = new Random();
        numero = rand.nextInt(10) + 1;
        System.out.println("Se está pensando en un numero entre 1 y 10. ¿Eres capaz de adivinarlo?");
    }

    @Override
    public void fin() {
        Scanner entrada = new Scanner(System.in);
        int intento;
        do {
            System.out.println("Introduce el numero: ");
            intento = entrada.nextInt();
            
            if (intento < numero) {
                System.out.println("Mi numero es mas grande que el tuyo!");
                
            }else if(intento > numero) {
                System.out.println("Mi numero es mas pequeño que el  tuyo!");
            }else {
                System.out.println("Enhorabuena " + jugador + ", has acertado el numero! ");
            }
            
        } while (intento != numero);
    }
}
