
package Logica;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }
    
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur usó el ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasaur usó el ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur usó el ataque Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur usó el ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur usó el ataque Paralizar");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulbasaur usó el ataque Latigo Cepa");
    }
    
}
