package GestionEmpleados;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Empresa {

    protected ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public void listarEmpleado() {
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " - " + e.getApellido() + " - " + e.getPuesto() + " - " + e.getSalario());

        }
    }

    protected static void agregarEmpleado(Empresa empresa, Scanner scanner) {
        System.out.println("----- AGREGAR EMPLEADO -----");
        String nombre;
        String apellido;
        String puesto;
        double salario;
        do {
            System.out.println("Ingrese el nombre del Empleado a almacenar en la base de datos");
            nombre = scanner.nextLine();
        } while (nombre.isEmpty());
        do {
            System.out.println("Ingrese el apellido del Empleado");
            apellido = scanner.nextLine();
        } while (apellido.isEmpty());
        do {
            System.out.println("Ingrese el puesto del Empleado a listar");
            puesto = scanner.nextLine();
        } while (puesto.isEmpty());
        do {
            try {
                System.out.println("Ingrese el Salario que percibe dicho trabajador, en Bruto");
                salario = scanner.nextDouble();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Salario Invalido, no puede ser una letra y/o palabra");
                scanner.nextLine();
                salario = -1;
            }

        } while (salario <= 0);

        Empleado nuevoEmpleado = new Empleado(nombre, apellido, puesto, salario);
        empresa.agregarEmpleado(nuevoEmpleado);
        System.out.println("Empleado agregado con éxito");

    }

    protected static void eliminarEmpleado(Empresa empresa, Scanner scanner) {
        System.out.println("----- ELIMINAR EMPLEADO -----");
        listarEmpleados(empresa);
        if (empresa.empleados.size() > 0) {
            int indice;
            do {
                try {
                    System.out.println("Ingrese el indice del Empleado a eliminar");
                    indice = scanner.nextInt();
                    scanner.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Indice incorrecto");
                    scanner.nextLine();
                    indice = -1;
                }
            } while (indice < 0 || indice >= empresa.empleados.size());
            Empleado empleado = empresa.empleados.get(indice);
            empresa.eliminarEmpleado(empleado);
            System.out.println("Empleado eliminado con exito");
        } else {
            System.out.println("No hay empleados, por lo tanto no se puede eliminar");
        }
    }
  
    protected static void listarEmpleados(Empresa empresa) {
        System.out.println("----- LISTAR EMPLEADOS -----");
        if (empresa.empleados.size() > 0) {
            empresa.listarEmpleado();
        } else {
            System.out.println("No hay empleados listados en la empresa");
        }
    }

}
