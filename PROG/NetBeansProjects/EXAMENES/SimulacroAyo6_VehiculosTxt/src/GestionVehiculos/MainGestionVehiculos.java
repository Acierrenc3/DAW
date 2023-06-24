package GestionVehiculos;

import java.io.*;
import java.util.*;

public class MainGestionVehiculos {

      static ListaVehiculos flota;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        eliminarArchivo();

        try {
            flota = new ListaVehiculos("vehiculos.txt");
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo");
            return;
        }

        boolean salir = false;
        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar Vehiculo");
            System.out.println("2. Eliminar Vehiculo");
            System.out.println("3. Buscar Vehiculo");
            System.out.println("4. Listar Vehiculo");
            System.out.println("0. Salir");

            int opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1:
                    try {
                    flota.agregarVehiculo();
                } catch (IOException e) {
                    System.out.println("Error al guardar el Vehiculo.");
                }
                break;
                case 2:
                    try {
                    flota.eliminarVehiculo();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
                case 3:
                    flota.buscarVehiculo();
                    break;
                case 4:
                    flota.listarVehiculo();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

    }

    private static void eliminarArchivo() {
        File archivo = new File("vehiculos.txt");
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Archivo eliminado exitosamente.");
        } else {
            System.out.println("El archivo no existe.");
        }
    }
}
