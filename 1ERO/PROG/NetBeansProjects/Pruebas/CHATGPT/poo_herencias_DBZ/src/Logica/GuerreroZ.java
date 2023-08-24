
package Logica;
//2 Crea dos clases que hereden de la clase Personaje
public class GuerreroZ extends Personaje implements IAliadoFinal {    
    GuerreroZ(String nombre, int ki, int vida){
        super(nombre, ki, vida);
    }


    @Override
    public void atacar(Personaje vegeta) {
        this.ki -= 10;
        vegeta.vida -= 20;
        System.out.println("Vegeta, Has atacado y has acertado, tu ki es: " + ki + ", se ha restado 20 puntos de vida a tu enemigo");
        }
    

    @Override
    public void defender(Personaje goku) {
        this.vida += 10;
    }

    @Override
    public void genkidama(Personaje freezer) {
        freezer.vida -= 65;         
        this.ki -= 70;
        System.out.println("Goku ha usado Genkidama, su ki es de: " + ki + ", la vida de freezer se ha quedado en: " + freezer.vida );
    }

    @Override
    public void kamehameha(Personaje freezer) {
        freezer.vida -= 45;
        this.ki -= 25;
        System.out.println("Goku ha usado Kamehameha, su ki es de: " + ki + ", la vida de freezer se ha quedado en: " + freezer.vida);
    }
    
   
    
}
