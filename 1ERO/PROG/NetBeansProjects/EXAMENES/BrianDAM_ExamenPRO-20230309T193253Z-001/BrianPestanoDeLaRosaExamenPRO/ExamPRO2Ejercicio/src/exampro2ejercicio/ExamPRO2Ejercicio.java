package exampro2ejercicio;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*@author Brian*/
 /*Se desea estimar el nuevo valor que adopta una lata de refresco partiendo del precio del producto por volumen envasado $/centilitro(cl) siendo
1 cl igual a 10 centimetros cubicos. Cada lata se modeliza por un cilindro con datos privados àra el radio r y altura h que tendrá un precio $ o Eur 
según el producto que contiene dentro.

Aplicando herencia y control de errores, crear un menú que cargue diferentes volúmenes de contenedores, indicando diámetro(2 * r) y altura
para crear una lista de objetos que empleando casting de objetos permita identificar cada producto para sacar por pantalla su volumen en centimetros
cubicos.

Finalizada la carga, se mostrará el coste del producto almacenado en cada objeto según los precios indicados y el programa informará del precio
por centilitro(cl) aplicado a cada caso expresando los resultados formateados a 2 decimales para las cantidades de volumen y el precio.*/
public class ExamPRO2Ejercicio {
/*valores a ingresar: 6,62 12,2 0,85 -- 6,60 12,27 0,79 -- 5,75 13,44 0,90*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cilindro> cilindros = new ArrayList<Cilindro>();

        while (true) {
            try {
                System.out.println("Ingrese el diámetro del cilindro (en cm):");
                double diametro = scanner.nextDouble();
                double radio = diametro / 2;
                System.out.println("Ingrese la altura del cilindro (en cm):");
                double altura = scanner.nextDouble();
                System.out.println("Ingrese el precio del cilindro (en EUR):");
                double precio = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer del scanner
                if (radio <= 0 || altura <= 0 || precio <= 0) {
                    throw new InputMismatchException("Los valores deben ser positivos.");
                }
                System.out.println("¿Es una lata de refresco? (s/n):");
                String esLataDeRefresco = scanner.nextLine();
                if (esLataDeRefresco.equals("s")) {
                    System.out.println("Ingrese el sabor del refresco:");
                    String sabor = scanner.nextLine();
                    LataDeRefresco lata = new LataDeRefresco(radio, altura, precio, sabor);
                    cilindros.add(lata);
                } else {
                    Cilindro cilindro = new Cilindro(radio, altura, precio);
                    cilindros.add(cilindro);
                }
            } catch (InputMismatchException e) {
                System.out.println("[!] Detectado valor no válido, debe ingresar un número positivo y el valor se debe de poner con ,");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        
            System.out.println("¿Desea ingresar otro cilindro? (s/n):");
            String respuesta = scanner.nextLine();
            if (!respuesta.equals("s")) {
                break;
            }
        }
        
        System.out.println("Volumen de cada cilindro:");
        for (Cilindro cilindro : cilindros) {
            double volumen = cilindro.getVolumen();
            System.out.printf("%s - Volumen: %.2f cm³\n", cilindro.toString(), volumen);
        }
        System.out.println("Precio por centilitro de cada producto:");
        for (Cilindro cilindro : cilindros) {
            double precioPorCentilitro = cilindro.getPrecioPorCentilitro();
            System.out.printf("%s - Precio por centilitro: %.2f EUR/cl\n",  cilindro.toString(),cilindro.getPrecioPorCentilitro());
        }
    }
}
