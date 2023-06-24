package trigonometria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //radianes = (grados *Math.PI)/180

        Scanner entrada = new Scanner(System.in);
        double grados;

        System.out.println("Digita el ángulo de la figura en grados");
        grados = entrada.nextDouble();

        double radianes = Math.toRadians(grados);

        System.out.println("Los grados que has introducido: " + grados + ", son: " + radianes + " radianes");

        System.out.println("El seno es: " + Math.sin(radianes));
        System.out.println("El coseno es: " + Math.cos(radianes));
        System.out.println("La tangente es: " + Math.tan(radianes));

    }
}
