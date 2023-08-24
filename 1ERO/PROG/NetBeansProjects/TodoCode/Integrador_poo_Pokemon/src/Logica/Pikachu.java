
package Logica;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }
    
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu usó el ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu usó el atauque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu usó el ataque Mordisco");
    }        

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu usó el ataque Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu usó el ataque Punio Trueno");
    }
}
