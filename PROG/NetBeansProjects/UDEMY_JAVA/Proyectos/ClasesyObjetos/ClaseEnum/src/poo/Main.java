
package poo;

public class Main {
    public static void main(String[] args) {
    Vehiculo v1 = new Vehiculo("Subaru", "Impreza", Color.AZUL,  3.0, 150, 120);        
    Vehiculo v2 = new Vehiculo("Mazda", "BT-50", Color.ROJO, 2.0, 100, 120);
        
        System.out.println(v1.toString());
        System.out.println("==============");
        System.out.println(v2.toString());
      
    }
}
