
package metodosEstaticos;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Subaru", "Impreza");
        
        Vehiculo v2 = new Vehiculo("Mazda", "BT-50","Rojo", 3.0);
        
        Vehiculo.colorPatente = "Gris claro";
        
        
        System.out.println(v1.verDetalle());
        System.out.println("===================");
        System.out.println(v2.verDetalle());
    }
    
}
