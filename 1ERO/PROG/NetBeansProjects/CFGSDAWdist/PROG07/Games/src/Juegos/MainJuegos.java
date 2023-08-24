package Juegos;

import java.util.Scanner;

public class MainJuegos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Elige un juego:");
            System.out.println("1. Adivina el número");
            System.out.println("2. Batalla de Dados");
            System.out.println("3. Adivina el personaje del Señor de los Anillos");
            System.out.println("4. Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    IGames juego1 = new Adivina();
                    juego1.inicio();
                    juego1.desarrollo();
                    juego1.fin();
                    break;
                case 2:
                    IGames juego2 = new JuegoDados();
                    juego2.inicio();
                    juego2.desarrollo();
                    juego2.fin();
                    break;
                case 3:
                    IGames juego3 = new JuegoLOTR();
                    juego3.inicio();
                    juego3.desarrollo();
                    juego3.fin();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 4);

        entrada.close();
    }

}
