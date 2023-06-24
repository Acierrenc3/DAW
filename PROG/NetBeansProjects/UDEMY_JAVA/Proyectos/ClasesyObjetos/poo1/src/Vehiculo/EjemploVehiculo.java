
package Vehiculo;


public class EjemploVehiculo {
    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo("Toyota", "Supra", "Rojo", 8.2d);     
        
        Vehiculo v2 = new Vehiculo("Subaru", "Impreza", "Azul y Amarillo", 2.0d);
        
        System.out.println(v1.toString());
        System.out.println("==================");
        System.out.println(v2.toString());

    }
    
}
