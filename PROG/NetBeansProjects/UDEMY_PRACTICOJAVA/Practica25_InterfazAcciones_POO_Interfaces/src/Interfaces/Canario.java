
package Interfaces;

public class Canario implements IAcciones{

    @Override
    public void cantar() {
        System.out.println("PIO PIO");
    }

    @Override
    public void andar() {
        System.out.println("ANDO, PERO ME GUSTA VOLAR");
        
    }
    
}
