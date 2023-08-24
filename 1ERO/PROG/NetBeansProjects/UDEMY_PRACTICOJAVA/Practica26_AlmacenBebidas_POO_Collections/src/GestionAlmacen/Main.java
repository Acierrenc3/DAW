
package GestionAlmacen;

public class Main {
    public static void main(String[] args) {
        AguaMineral b1 = new AguaMineral(1, 1, "Bezoya", 0.60, "Manantial");
        AguaMineral b2 = new AguaMineral(2, 1.5, "Solan de Cabras", 0.95, "Manantial");
        BebidaAzucarada b3 = new BebidaAzucarada(3, 1.5, "Cocacola", 1.25, 20);
        BebidaAzucarada b4 = new BebidaAzucarada(4, 1.5, "Fanta", 1.25, 20);        
        
        Almacen almacen = new Almacen();
        almacen.agregarBebida(b1);
        almacen.agregarBebida(b2);
        almacen.agregarBebida(b3);
        almacen.agregarBebida(b4);
        almacen.eliminarBebida(b2);
        
        System.out.println(almacen.precioTotalMarca("Bezoya"));
        System.out.println(almacen.precioTotal());
        almacen.mostrarInformacion();
    }
    
}
