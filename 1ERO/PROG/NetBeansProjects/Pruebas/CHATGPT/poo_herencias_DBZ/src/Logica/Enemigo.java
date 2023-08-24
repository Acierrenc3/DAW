
package Logica;

public class Enemigo extends Personaje implements IEnemigoFinal{    
    Enemigo(String nombre, int ki, int vida){
        super(nombre, ki, vida);
    }

    @Override
    protected void atacar(Personaje goku) {
        this.ki -= 10;
        goku.vida -= 20;
        System.out.println("Goku, Has atacado y has acertado, tu ki es: " + ki + ", se ha restado 20 puntos de vida a tu enemigo");        
    }

    @Override
    protected void defender(Personaje vegeta) {
         this.vida += 10;
    }

    @Override
    public void superNova(Personaje vegeta) {
        this.ki -= 50;
        vegeta.vida -= 25;        
        System.out.println("Freezer ha usado Super Nova, su ki es de: " + ki + ", y la vida de vegeta es de: " + vegeta.vida);
 
    }

    @Override
    public void bolaMortal(Personaje goku) {
        goku.vida -= 30;
        this.ki -= 70;        
        System.out.println("Freezer ha usado Bola Mortal, Su ki es de: " + ki + ", y la vida de goku es de: " + goku.vida);

    }
    
}
