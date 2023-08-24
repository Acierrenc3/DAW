package empresa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean salir = false;
        
        do{

        try {

            Scanner entrada = new Scanner(System.in);

            System.out.print("Ingresa el numero de empleados");
            int numEmpleados = entrada.nextInt();

            Empleado[] empleados = new Empleado[numEmpleados];

            for (int i = 0; i < numEmpleados; i++) {
                System.out.print("Ingrese el nombre del empleado numero: " + (i + 1));
                String nombreEmpleado = entrada.next();

                System.out.print("Ingrese las horas trabajadas por el empleado numero: " + (i + 1));
                int horasTrabajadas = entrada.nextInt();

                empleados[i] = new Empleado(nombreEmpleado, horasTrabajadas);

            }

            for (int i = 0; i < numEmpleados; i++) {
                System.out.println("El salario semanal de: " + empleados[i].getNombre() + " es: " + empleados[i].getSalarioSemanal() + " €");

            }
            
            salir = true;
            
            entrada.close();

        } catch (InputMismatchException e) { //Excepción de letras y no numeros
            System.out.println("No se admiten letras, introduce un número, melón");

        }

        }while (!salir); 

        

    }

}
