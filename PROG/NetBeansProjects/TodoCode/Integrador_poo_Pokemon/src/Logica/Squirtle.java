
package Logica;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }
    
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle usó el ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle usó el atauque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle usó el ataque Mordisco");
    }    

    @Override
    public void atacarHidroBomba() {
        System.out.println("Squirtle usó el ataque Hidro Bomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle usó el ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle usó el ataque Pistola Agua");
    }
}
