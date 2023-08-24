package Juegos;

import java.util.Scanner;

public class JuegoLOTR implements IGames {

    private String personaje; //Declaramos variable Personaje

    @Override
    public void inicio() { //En el metodo Inicio declaramos un Bucle Switch con 6 Personajes, uno por caso, que se generará aleatoriamente gracias a la clase Math.random
        int numeroAleatorio = (int) (Math.random() * 6) + 1;

        switch (numeroAleatorio) {
            case 1:
                personaje = "Gimli";
                break;
            case 2:
                personaje = "Aragorn";
                break;
            case 3:
                personaje = "Legolas";
                break;
            case 4:
                personaje = "Frodo";
                break;
            case 5:
                personaje = "Gandalf";
            case 6:
                personaje = "Sam";
        }

        System.out.println("Estoy pensando en un personaje del Señor de los Anillos...");

    }

    @Override
    public void desarrollo() {
        Scanner entrada = new Scanner(System.in);
        String respuesta; //Declaramos variable respuesta y el paquete Scanner, y comenzamos a preguntar al usuario sobre que personaje cree que es
                                  //Si no lo adivina, se le darán algunas pistas  
        do {
            System.out.println("¿Crees que el personaje es un Hobbit? (responde si o no)");
            respuesta = entrada.nextLine();
        } while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));

        if ((personaje.equals("Gimli") || personaje.equals("Aragorn") || personaje.equals("Legolas")
                || personaje.equals("Gandalf")) && respuesta.equalsIgnoreCase("no")) {
            System.out.println("El personaje no es un Hobbit.");
            System.out.println("Pista: Este personaje es un guerrero y es conocido por su habilidad con su arma.");
        } else if (personaje.equals("Frodo") && respuesta.equalsIgnoreCase("si")) {
            System.out.println("El personaje es un Hobbit.");
            System.out.println("Pista: Este personaje es el portador del Anillo.");
        } else if (personaje.equals("Sam") && respuesta.equalsIgnoreCase("si")) {
            System.out.println("El personaje es un Hobbit.");
            System.out.println("Pista: Este personaje es el mejor amigo del portador del Anillo.");
        } else {
            System.out.println("El personaje es un Hobbit.");
            System.out.println("Pista: Este personaje es conocido por su habilidad con el arco y flechas.");
        }

        do {
            System.out.println("¿Crees que el personaje es un guerrero? (responde si o no)");
            respuesta = entrada.nextLine();
        } while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));

        if ((personaje.equals("Gimli") || personaje.equals("Aragorn") || personaje.equals("Legolas")
                || personaje.equals("Gandalf")) && respuesta.equalsIgnoreCase("si")) {
            System.out.println("El personaje es un guerrero.");
            System.out.println("Pista: Este personaje es conocido por su habilidad con su arma.");
        } else if (personaje.equals("Frodo") && respuesta.equalsIgnoreCase("no")) {
            System.out.println("El personaje no es un guerrero.");
            System.out.println("Pista: Este personaje es el portador del Anillo.");
        } else {
            System.out.println("El personaje no es un guerrero.");
            System.out.println("Pista: Este personaje es conocido por su sabiduría y habilidades mágicas.");
        }

    }

    @Override
    public void fin() {
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        boolean acertado = false;

        do {
            System.out.println("¿Quién crees que es el personaje?");
            respuesta = entrada.nextLine();
        } while (respuesta.isEmpty());

        if (respuesta.equalsIgnoreCase(personaje)) {
            System.out.println("¡Felicidades! Has adivinado el personaje.");
        } else {
            System.out.println("Lo siento, no has adivinado el personaje. El personaje era " + personaje + ".");
        }
    }

}
