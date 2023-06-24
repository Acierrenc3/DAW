
package poo2;

public class MainVehiculo {
    public static void main(String[] args) {
                
        Vehiculo v1 = new Vehiculo("Subaru", "Impreza");
        
        Vehiculo v2 = new Vehiculo("Mazda", "BT-50","Rojo", 3.0);
        
        Vehiculo v3 = new Vehiculo("Ford", "Mustang", "Azul", 3.5d, 60);
        
        Vehiculo v4 = new Vehiculo("Mazda", "BT-50", "Rojo", 3.0);
        
        Vehiculo v5 = new Vehiculo();
        
        System.out.println(v5.equals(v2));
        
        System.out.println(v1.verDetalle());
        System.out.println(v1.acelerarFrenar(5000));
        System.out.println(v1.calcularConsumo(100, 55));
        System.out.println("==================");
        System.out.println(v2.verDetalle());
        System.out.println(v2.acelerarFrenar(3800));
        System.out.println(v2.calcularConsumo(100, 60));        
        System.out.println("==================");
        System.out.println(v3.verDetalle());
        System.out.println(v3.acelerarFrenar(6800));
        System.out.println(v3.calcularConsumo(100, 70));
        System.out.println("Son iguales? " + v1.equals(v4)); //EL equals se usa para ver si 2 objetos o sentencias son iguales, como "=="

        
    }
}
