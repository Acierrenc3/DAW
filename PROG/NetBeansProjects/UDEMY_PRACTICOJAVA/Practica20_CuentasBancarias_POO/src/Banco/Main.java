
package Banco;

public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta("pepe");
        
        c1.setTitular("Ayoze");
        c1.setCantidad(1000);
        
        c2.ingresarCantidad(500);
        c2.retirarCantidad(100);
        
        System.out.println(c1.toString());
        System.out.println("------------------------------");
        System.out.println(c2.toString());
        
    }
    
}
