
package Interfaces;

public class Persona implements IAcciones{

    @Override
    public void cantar() {
        System.out.println("ESTOY CANTANDO");
    }

    @Override
    public void andar() {
        System.out.println("ESTOY ANDANDO");
    }
    
}
