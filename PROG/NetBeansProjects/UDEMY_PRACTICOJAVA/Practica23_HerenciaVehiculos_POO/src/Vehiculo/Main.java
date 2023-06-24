
package Vehiculo;

public class Main {
    public static void main(String[] args) {
        Electrico e1 = new Electrico(982371,800, 20000);
        Electrico e2 = new Electrico(45678, 550, 24000);
        
        Combustion c1 = new  Combustion(333, 600, 180);
        Combustion c2 = new Combustion(444, 780, 190);
        
        System.out.println(e1.toString() + ", Impuesto: " + e1.impuestoBase());
        System.out.println(e2.toString() + ", Impuesto: " + e2.impuestoBase());
        System.out.println(c1.toString() + ", Impuesto: " + c1.impuestoBase());
        System.out.println(c2.toString() + ", Impuesto: " + c2.impuestoBase());
        
        
    }
    
}
