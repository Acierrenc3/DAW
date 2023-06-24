
package Logica;

public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }
    
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander usó el ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander usó el ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander usó el ataque Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander usó el ataque Punio Fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander usó el ataque Lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander usó el ataque Ascuas");
    }
    
}
