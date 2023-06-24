
package Logica;

public class Main {
    public static void main(String[] args) {
      Enemigo vegeta = new Enemigo("Vegeta", 100, 1000);
      Enemigo freezer = new Enemigo("Freezer", 500, 2000);
      GuerreroZ goku = new GuerreroZ("Goku", 100, 1000);   
      
      goku.atacar(vegeta);
        System.out.println("La vida de Goku es de: " +  vegeta.vida);
      
      vegeta.atacar(goku);
        System.out.println("La vida de Vegeta es de: " + goku.vida);
        
        System.out.println("======================================");
            
      /*goku.defender(goku);
        System.out.println("Goku, te has defendido, tu vida ahora es de: " + goku.vida);
      
      vegeta.defender(vegeta);
        System.out.println("Vegeta, te has defendido, tu vida ahora es de: " + vegeta.vida);*/
     
      
        System.out.println("===Freezer Ataca a los Guerreros Z===");
      freezer.bolaMortal(goku);
      freezer.superNova(vegeta);
        System.out.println("===Goku responde===");
      goku.genkidama(freezer);
      goku.kamehameha(freezer);
      
        
    }
}
