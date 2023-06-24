package GestionVehiculos;

import java.io.*;
import java.util.*;

public class ListaVehiculos {

    private ArrayList<Vehiculo> listaVehiculos;
    private File archivo;

    public ListaVehiculos(String rutaArchivo) throws IOException {
        listaVehiculos = new ArrayList<>();
        archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
    }

    public void agregarVehiculo() throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el año de Fabricacion del Vehiculo");
        int añoFabricacion = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el Numero de Verificacion del Vehiculo");
        long numeroVerificacion = entrada.nextLong();
        entrada.nextLine();
        System.out.println("Ingrese la marca del Vehiculo");
        String marca = entrada.nextLine();
        System.out.println("Ingrese el modelo del Vehiculo");
        String modelo = entrada.nextLine();
        System.out.println("¿Que clase de Vehiculo es? (Automovil/Camion)");
        String respuesta = entrada.nextLine();
        if (respuesta.equalsIgnoreCase("Automovil")) {
            Vehiculo v = new Automovil(añoFabricacion, numeroVerificacion, marca, modelo);
            listaVehiculos.add(v);
        } else {
            System.out.println("Ingrese la capacidad de Carga del Camion");
            int capacidadCarga = entrada.nextInt();
            Vehiculo v2 = new Camion(capacidadCarga, añoFabricacion, numeroVerificacion, marca, modelo);
            listaVehiculos.add(v2);
        }
        guardarVehiculos();
        System.out.println("Vehiculo agregado correctamente");
    }
    
    public void eliminarVehiculo() throws IOException, Exception{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la marca del Vehiculo a eliminar");
        String marca = entrada.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < listaVehiculos.size(); i++) {
            if (listaVehiculos.get(i).getMarca().equalsIgnoreCase(marca)) {
                listaVehiculos.remove(i);
                encontrado = true;
                guardarVehiculos();
                System.out.println("Vehiculo eliminado correctamente");
                break;
            }
        }
          if (!encontrado) {
            throw new Exception("El Vehiculo no se encuentra en la lista.");
        }
    }
    
    public void listarVehiculo(){
        if (listaVehiculos.isEmpty()) {
            System.out.println("No hay vehiculos para listar");
        }else{
            for (Vehiculo vehiculo : listaVehiculos) {
                System.out.println(vehiculo.toString() + "Vehiculo\n");
            }
        }
    }
    
    public void buscarVehiculo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numero de verificacion del vehiculo");
        long numeroVerificacion = entrada.nextLong();
        boolean encontrado = false;
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getNumeroVerificacion() == numeroVerificacion) {
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado el vehiculo");
        }
    }
    
    private void guardarVehiculos() throws IOException{
        FileWriter writer = new FileWriter(archivo);
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo instanceof Automovil) {
                Automovil automovil = (Automovil) vehiculo;
                writer.write(automovil.getAñoFabricacion() + " - " + automovil.getMarca() 
                        + " - " + automovil.getModelo() + " - " + automovil.getNumeroVerificacion());
            
            }else if (vehiculo instanceof Camion){
                Camion camion = (Camion) vehiculo;
                writer.write(camion.getCapacidadCarga() + " - " + camion.getAñoFabricacion() 
                        + " - " + camion.getMarca() + camion.getModelo() + " - " + camion.getNumeroVerificacion());
            }
        }
        writer.close();
    }
    
        public void eliminarArchivo() {
        File archivo = new File("vehiculos.txt");
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Archivo eliminado exitosamente.");
        } else {
            System.out.println("El archivo no existe.");
        }
    }
    
}
