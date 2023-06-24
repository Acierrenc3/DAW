package GestionEmpleados;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Empresa pc_componentes = new Empresa();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println("--------- MENU ---------");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Eliminar Empleado");
            System.out.println("3. Listar Empleados");
            System.out.println("0. Salir");
            System.out.println("Ingrese una opción: ");
            System.out.println("----------------------------");
            try {
                int opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 1:
                        Empresa.agregarEmpleado(pc_componentes, scanner);
                        break;
                    case 2:
                        Empresa.eliminarEmpleado(pc_componentes, scanner);
                        break;
                    case 3:
                        Empresa.listarEmpleados(pc_componentes);
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opción inválida");
                scanner.nextLine();
            }
        } while (!salir);
    }
}
